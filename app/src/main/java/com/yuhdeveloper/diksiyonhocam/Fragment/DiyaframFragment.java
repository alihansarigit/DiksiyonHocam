package com.yuhdeveloper.diksiyonhocam.Fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.yuhdeveloper.diksiyonhocam.Activity.MainActivity;
import com.yuhdeveloper.diksiyonhocam.NefesClass;
import com.yuhdeveloper.diksiyonhocam.R;
import java.util.List;

public class DiyaframFragment extends Fragment implements OnClickListener, RewardedVideoAdListener {


  TextView txt_baslik, txt_detay;
  Button btn_Before, btn_After;
  List<String> lstBaslik, lstDetay;
  RewardedVideoAd rewardedVideoAd;
  Toolbar toolbar;
  int sayac = 0;


  MenuItem menuItem;

  @Override
  public void onCreateOptionsMenu(final Menu menu, MenuInflater inflater) {
    inflater.inflate(R.menu.menu_toolbar, menu);
    menuItem = menu.getItem(0);
    super.onCreateOptionsMenu(menu, inflater);
  }


  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case R.id.menu_toolbarItem_banadestekol:
        item.setVisible(false);
        MainActivity._value +=60000;
        Toast.makeText(getContext(), "Tam Ekran Reklama : "+ String.valueOf(MainActivity._value/1000
        )+ " saniye kaldı", Toast.LENGTH_SHORT).show();
        rewardedVideoAd.show();
        Reklamiyukle();

        break;
      case R.id.menu_toolbarItem_youtube:
        Intent yt_play = new Intent(Intent.ACTION_VIEW,
            Uri.parse(getString(R.string.myYoutubeChannel)));
        Intent chooser = Intent.createChooser(yt_play, "Open With");

        if (yt_play.resolveActivity(getContext().getPackageManager()) != null) {
          startActivity(chooser);
        }
        break;
    }
    return super.onOptionsItemSelected(item);
  }

  private void onReklam() {
    rewardedVideoAd = MobileAds.getRewardedVideoAdInstance(getContext());
    rewardedVideoAd.setRewardedVideoAdListener(this);
  }

  void Reklamiyukle() {
    rewardedVideoAd.loadAd(getString(R.string.odulluReklam1), new AdRequest.Builder()
        .addTestDevice("8AE65708CBB07AD6DE19921409EF11E6")
        .build());
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_diyafram, container, false);
    step1(view);
    return view;
  }

  private void step1(View view) {
    toolbar = view.findViewById(R.id.myToolbar);
    this.setHasOptionsMenu(true);
    ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
    ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    toolbar.setNavigationOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        onDestroyView();

        getFragmentManager().popBackStack();
      }
    });

    onReklam();
    Reklamiyukle();

    btn_Before = view.findViewById(R.id.diyafram_btnBefore);
    btn_After = view.findViewById(R.id.diyafram_btnAfter);
    txt_detay = view.findViewById(R.id.diyafram_txtDetay);
    txt_baslik = view.findViewById(R.id.diyafram_txtBaslik);

    btn_Before.setOnClickListener(this);
    btn_After.setOnClickListener(this);
    lstBaslik = NefesClass.getDiyaframBaslik();
    lstDetay = NefesClass.getDiyaframDescription();

    txt_detay.setText(lstDetay.get(0));
    txt_baslik.setText(lstBaslik.get(0));
  }

  @Override
  public void onClick(View view) {
    switch (view.getId()) {
      case R.id.diyafram_btnBefore:
        sayac--;
        if (sayac >= 0) {
          txt_detay.setText(lstDetay.get(sayac).toString());
          txt_baslik.setText(lstBaslik.get(sayac).toString());
        }
        if (sayac == 0) {
          btn_Before.setVisibility(View.INVISIBLE);
        }
        if (btn_After.getVisibility() == View.INVISIBLE) {
          btn_After.setVisibility(View.VISIBLE);
        }
        break;
      case R.id.diyafram_btnAfter:
        sayac++;
        if (sayac <= lstDetay.size() - 1) {
          txt_detay.setText(lstDetay.get(sayac).toString());
          txt_baslik.setText(lstBaslik.get(sayac).toString());
        }
        if (sayac == lstDetay.size() - 1) {
          btn_After.setVisibility(View.INVISIBLE);
        }
        if (btn_Before.getVisibility() == View.INVISIBLE) {
          btn_Before.setVisibility(View.VISIBLE);
        }
        break;
    }
  }

  @Override
  public void onRewardedVideoAdLoaded() {
    menuItem.setVisible(true);
  }

  @Override
  public void onRewardedVideoAdOpened() {
  }

  @Override
  public void onRewardedVideoStarted() {

  }

  @Override
  public void onRewardedVideoAdClosed() {
    Toast.makeText(getContext(), "Teşekkür Ederim...", Toast.LENGTH_SHORT).show();

    Reklamiyukle();
  }

  @Override
  public void onRewarded(RewardItem rewardItem) {

  }

  @Override
  public void onRewardedVideoAdLeftApplication() {

  }

  @Override
  public void onRewardedVideoAdFailedToLoad(int i) {
    if (rewardedVideoAd.isLoaded()) {
      menuItem.setVisible(true);
    }
  }

  @Override
  public void onRewardedVideoCompleted() {

  }
}
