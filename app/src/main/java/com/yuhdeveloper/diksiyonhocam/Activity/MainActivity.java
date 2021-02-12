package com.yuhdeveloper.diksiyonhocam.Activity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.onesignal.OneSignal;
import com.yuhdeveloper.diksiyonhocam.Fragment.MenuFragment;
import com.yuhdeveloper.diksiyonhocam.R;

public class MainActivity extends AppCompatActivity {

    InterstitialAd interstitialAd;
    AdRequest gecisRequest;
    CountDownTimer countDownTimer;

    AdView adView;
    AdRequest adRequest;
    public static long _value;

    Boolean gecis;
    long waitIni;

    void ReklamYukle() {
        interstitialAd.loadAd(gecisRequest);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();

        waitIni = 60000;
        gecis = true;
        _value = waitIni;
        adView = findViewById(R.id.adview);
        adRequest = new AdRequest.Builder()
                .addTestDevice("D9A8CF2E36EF152A1BA0456397164FF4")
                .build();
        adView.loadAd(adRequest);


        gecisRequest = new AdRequest.Builder()
                .addTestDevice("D9A8CF2E36EF152A1BA0456397164FF4")
                .build();

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.gecisReklami1));


        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                if (gecis) {
                    sayac();
                }
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

        MenuFragment menuFragment = new MenuFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_fragmentLayout, menuFragment)
                .commit();
    }

    public void sayac() {


        countDownTimer = new CountDownTimer(_value, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                _value = millisUntilFinished;
                System.out.println("sure => " + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                _value = waitIni;
                interstitialAd.show();

            }
        }.start();
    }


    @Override
    protected void onStop() {
        super.onStop();

        if (countDownTimer != null) {
            countDownTimer.cancel();
            System.out.println("sure => CANCEL");

        } else {
            gecis = false;
            System.out.println("sure => Stop False");

        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        if (countDownTimer != null) {
            countDownTimer.cancel();
            System.out.println("sure => CANCEL");

        } else {
            gecis = false;
            System.out.println("sure => False");

        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("sure => re");
        if (interstitialAd.isLoaded()) {

            gecis = true;
            sayac();
        }
    }
}
