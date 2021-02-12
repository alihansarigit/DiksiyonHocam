package com.yuhdeveloper.diksiyonhocam.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.yuhdeveloper.diksiyonhocam.R;
import com.yuhdeveloper.diksiyonhocam.TekerlemeClass;

import java.util.List;

public class TekerlemelerActivity extends AppCompatActivity implements OnClickListener,
        RewardedVideoAdListener, OnCheckedChangeListener {

    List<String> myTekerlemeler;
    Button btn_next, btn_back, btn_BeforeWord, btn_AfterWord;
    TextView txtStartWord, txtTekerleme;
    int tekerlemeSayaci = 0;
    int harfSayaci;
    Toolbar toolbar;
    TekerlemeClass tekerlemeClass;
    boolean state = false;
    boolean gecis;
    long waitIni;

    String afterWord, beforeWord;

    RewardedVideoAd rewardedVideoAd;
    CheckBox checkBox;
    MenuItem menuItem;

    InterstitialAd interstitialAd;
    AdRequest gecisRequest;
    CountDownTimer countDownTimer;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        menuItem = menu.getItem(0);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_toolbarItem_banadestekol:
                item.setVisible(false);
                rewardedVideoAd.show();
                com.yuhdeveloper.diksiyonhocam.Activity.MainActivity._value += waitIni;
                Toast.makeText(this, "Tam Ekran Reklama : " + String.valueOf(com.yuhdeveloper.diksiyonhocam.Activity.MainActivity._value / 1000) + " saniye kaldı", Toast.LENGTH_SHORT).show();
                Reklamiyukle();
                break;
            case R.id.menu_toolbarItem_youtube:
                Intent yt_play = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(getString(R.string.myYoutubeChannel)));
                Intent chooser = Intent.createChooser(yt_play, "Open With");

                if (yt_play.resolveActivity(getPackageManager()) != null) {
                    startActivity(chooser);
                }
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void onReklam() {
        rewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        rewardedVideoAd.setRewardedVideoAdListener(this);
    }

    void Reklamiyukle() {
        rewardedVideoAd.loadAd(getString(R.string.odulluReklam2), new AdRequest.Builder()
                .addTestDevice("8AE65708CBB07AD6DE19921409EF11E6")
                .build());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tekerlemeler);
        toolbar = findViewById(R.id.myToolbar);

        gecis = true;
        AdView adView = findViewById(R.id.adview);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        waitIni = 60000;
        gecisRequest = new AdRequest.Builder()
                .addTestDevice("D9A8CF2E36EF152A1BA0456397164FF4")
                .build();

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.gecisReklami1));


        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                sayac();
            }


            @Override
            public void onAdFailedToLoad(int i) {
                super.onAdFailedToLoad(i);
                ReklamYukle();
            }


            @Override
            public void onAdClosed() {
                super.onAdClosed();
                ReklamYukle();
            }
        });

        ReklamYukle();

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                back();
            }
        });


        checkBox = findViewById(R.id.tekerlemeler_chckbox);
        btn_back = findViewById(R.id.tekerlemeler_btn_back);
        btn_next = findViewById(R.id.tekerlemeler_btn_next);
        btn_AfterWord = findViewById(R.id.tekerlemler_btnAfterWord);
        btn_BeforeWord = findViewById(R.id.tekerlemler_btnBeforeWord);
        txtStartWord = findViewById(R.id.tekerlemeler_txt_wordStart);
        txtTekerleme = findViewById(R.id.tekerlemeler_txt_tekerlemeler);
        String getWord = getIntent().getStringExtra("Harf");
        tekerlemeClass = new TekerlemeClass();
        setTekerlemeler(getWord);
        btn_back.setOnClickListener(this);
        btn_next.setOnClickListener(this);
        btn_BeforeWord.setOnClickListener(this);
        btn_AfterWord.setOnClickListener(this);
        checkBox.setOnCheckedChangeListener(this);
        checkBox.setChecked(false);
        onReklam();
        Reklamiyukle();

        (new Thread(new Runnable() {

            @Override
            public void run() {
                while (!Thread.interrupted()) {
                    try {
                        Thread.sleep(6000);
                        if (state) {
                            runOnUiThread(new Runnable() // start actions in UI thread
                            {
                                @Override
                                public void run() {

                                    if (tekerlemeSayaci < myTekerlemeler.size()) {
                                        txtTekerleme.setText(myTekerlemeler.get(tekerlemeSayaci).toString());
                                        tekerlemeSayaci++;
                                    } else {
                                        if (harfSayaci < tekerlemeClass.getWords().size() - 1) {
                                            harfSayaci++;
                                            tekerlemeSayaci = 0;
                                            myTekerlemeler = tekerlemeClass
                                                    .getTekerlemeler(tekerlemeClass.getWords().get(harfSayaci));
                                            txtTekerleme.setText(myTekerlemeler.get(tekerlemeSayaci).toString());
                                            txtStartWord.setText(tekerlemeClass.getWords().get(harfSayaci).toString());

                                            if (harfSayaci + 1 < tekerlemeClass.getWords().size()) {
                                                btn_AfterWord
                                                        .setText(tekerlemeClass.getWords().get(harfSayaci + 1).toString());
                                            }
                                            if (harfSayaci != 0) {
                                                btn_BeforeWord
                                                        .setText(tekerlemeClass.getWords().get(harfSayaci - 1).toString());
                                            }

                                        } else {
                                            checkBox.setChecked(false);
                                        }
                                    }
                                }
                            });
                        }
                    } catch (InterruptedException e) {
                    }
                }
            }
        })).start();


    }

    void setTekerlemeler(String Harf) {
        myTekerlemeler = tekerlemeClass.getTekerlemeler(Harf);
        txtStartWord.setText(Harf);
        txtTekerleme.setText(myTekerlemeler.get(0).toString());
        harfSayaci = tekerlemeClass.getWords().indexOf(Harf);
        if (harfSayaci != tekerlemeClass.getWords().size() - 1) {
            btn_AfterWord.setText(tekerlemeClass.getWords().get(harfSayaci + 1));
        } else {
            btn_AfterWord.setVisibility(View.INVISIBLE);
        }
        if (harfSayaci != 0) {
            btn_BeforeWord.setVisibility(View.VISIBLE);
            btn_BeforeWord.setText(tekerlemeClass.getWords().get(harfSayaci - 1));
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tekerlemeler_btn_next:
                if (tekerlemeSayaci < myTekerlemeler.size() - 1) {
                    tekerlemeSayaci++;
                    txtTekerleme.setText(myTekerlemeler.get(tekerlemeSayaci).toString());
                    if (btn_back.getVisibility() == View.INVISIBLE) {
                        btn_back.setVisibility(View.VISIBLE);
                    }
                    if (tekerlemeSayaci >= myTekerlemeler.size() - 1) {
                        btn_next.setVisibility(View.INVISIBLE);
                    }
                }
                break;

            case R.id.tekerlemeler_btn_back:
                tekerlemeSayaci--;
                txtTekerleme.setText(myTekerlemeler.get(tekerlemeSayaci).toString());
                if (tekerlemeSayaci <= 0) {
                    btn_back.setVisibility(View.INVISIBLE);
                }
                if (btn_next.getVisibility() == View.INVISIBLE) {
                    btn_next.setVisibility(View.VISIBLE);
                }
                break;

            case R.id.tekerlemler_btnBeforeWord:
                harfSayaci--;
                if (harfSayaci <= tekerlemeClass.getWords().size() - 1) {
                    afterWord = tekerlemeClass.getWords().get(harfSayaci + 1).toString();
                    if (harfSayaci != 0) {
                        beforeWord = tekerlemeClass.getWords().get(harfSayaci - 1).toString();
                    }
                    btn_AfterWord.setText(afterWord);
                    btn_BeforeWord.setText(beforeWord);
                    txtStartWord.setText(tekerlemeClass.getWords().get(harfSayaci));
                    myTekerlemeler = tekerlemeClass.getTekerlemeler(txtStartWord.getText().toString());
                    txtTekerleme.setText(myTekerlemeler.get(0));
                    if (btn_BeforeWord.getVisibility() == View.INVISIBLE) {
                        btn_BeforeWord.setVisibility(View.VISIBLE);
                    }
                    if (btn_AfterWord.getVisibility() == View.INVISIBLE) {
                        btn_AfterWord.setVisibility(View.VISIBLE);
                    }
                    if (btn_back.getVisibility() == View.VISIBLE) {
                        tekerlemeSayaci = 0;
                        btn_back.setVisibility(View.INVISIBLE);
                    }
                    if (btn_next.getVisibility() == View.INVISIBLE) {
                        tekerlemeSayaci = 0;
                        btn_next.setVisibility(View.VISIBLE);
                    }
                    if (harfSayaci == 0) {
                        btn_BeforeWord.setVisibility(View.INVISIBLE);
                    }
                }
                break;
            case R.id.tekerlemler_btnAfterWord:
                harfSayaci++;
                if (harfSayaci <= tekerlemeClass.getWords().size() - 1) {
                    beforeWord = tekerlemeClass.getWords().get(harfSayaci - 1).toString();
                    if (harfSayaci != tekerlemeClass.getWords().size() - 1) {
                        afterWord = tekerlemeClass.getWords().get(harfSayaci + 1).toString();
                    }
                    btn_AfterWord.setText(afterWord);
                    btn_BeforeWord.setText(beforeWord);
                    txtStartWord.setText(tekerlemeClass.getWords().get(harfSayaci));
                    myTekerlemeler = tekerlemeClass.getTekerlemeler(txtStartWord.getText().toString());
                    txtTekerleme.setText(myTekerlemeler.get(0));
                    if (btn_BeforeWord.getVisibility() == View.INVISIBLE) {
                        btn_BeforeWord.setVisibility(View.VISIBLE);
                    }
                    if (btn_back.getVisibility() == View.VISIBLE) {
                        tekerlemeSayaci = 0;
                        btn_back.setVisibility(View.INVISIBLE);
                    }
                    if (btn_next.getVisibility() == View.INVISIBLE) {
                        tekerlemeSayaci = 0;
                        btn_next.setVisibility(View.VISIBLE);
                    }
                    if (harfSayaci == tekerlemeClass.getWords().size() - 1) {
                        btn_AfterWord.setVisibility(View.INVISIBLE);
                    }
                }
                break;


        }
    }

    void back() {
        onBackPressed();
    }

    void ReklamYukle() {
        interstitialAd.loadAd(gecisRequest);
    }

    @Override
    public void onRewardedVideoAdLoaded() {
        new CountDownTimer(4000, 1000) {
            @Override
            public void onTick(long l) {
            }

            @Override
            public void onFinish() {
                menuItem.setVisible(true);
            }
        }.start();
    }

    @Override
    public void onRewardedVideoAdOpened() {
        Toast.makeText(this, "Teşekkür Ederim...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRewardedVideoStarted() {
    }

    @Override
    public void onRewardedVideoAdClosed() {
    }

    @Override
    public void onRewarded(RewardItem rewardItem) {

    }

    @Override
    public void onRewardedVideoAdLeftApplication() {
    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {
        new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long l) {
            }

            @Override
            public void onFinish() {
                System.out.println("Yüklenemedi");
                Reklamiyukle();
            }
        }.start();
    }

    @Override
    public void onRewardedVideoCompleted() {

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (b) {
            Toast.makeText(this, "Otomatik geçiş açık.(6 Saniyede bir)", Toast.LENGTH_SHORT).show();

            state = true;
            btn_BeforeWord.setEnabled(!state);
            btn_AfterWord.setEnabled(!state);
            btn_next.setEnabled(!state);
            btn_back.setEnabled(!state);


        } else {
            Toast.makeText(this, "Otomatik geçiş kapalı.", Toast.LENGTH_SHORT).show();
            state = false;
            btn_BeforeWord.setEnabled(!state);
            btn_AfterWord.setEnabled(!state);
            btn_next.setEnabled(!state);
            btn_back.setEnabled(!state);

            if (harfSayaci < tekerlemeClass.getWords().size()) {
                btn_AfterWord.setVisibility(View.VISIBLE);
            } else {
                btn_AfterWord.setVisibility(View.INVISIBLE);
            }

            if (harfSayaci == 0) {
                btn_BeforeWord.setVisibility(View.INVISIBLE);
            } else {
                btn_BeforeWord.setVisibility(View.VISIBLE);
            }

            if (tekerlemeSayaci == 0) {
                btn_back.setVisibility(View.INVISIBLE);
            } else {
                btn_back.setVisibility(View.VISIBLE);
            }
            if (tekerlemeSayaci < myTekerlemeler.size()) {
                btn_next.setVisibility(View.VISIBLE);
            } else {
                btn_next.setVisibility(View.INVISIBLE);
            }
        }
    }


    public void sayac() {

        if (gecis) {

            countDownTimer = new CountDownTimer(com.yuhdeveloper.diksiyonhocam.Activity.MainActivity._value, 1000) {

                @Override
                public void onTick(long millisUntilFinished) {
                    com.yuhdeveloper.diksiyonhocam.Activity.MainActivity._value = millisUntilFinished;
                    System.out.println("sure => " + millisUntilFinished / 1000);
                }

                @Override
                public void onFinish() {
                    interstitialAd.show();
                    com.yuhdeveloper.diksiyonhocam.Activity.MainActivity._value = waitIni;
                }
            }.start();
        }

    }


    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("sure => stop");

        if (countDownTimer != null) {
            countDownTimer.cancel();
        } else {
            gecis = false;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("sure => pause");

        if (countDownTimer != null) {
            countDownTimer.cancel();
        } else {
            gecis = false;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("sure => re");
        if (interstitialAd.isLoaded() && gecis) {
            sayac();
        }
    }
}

