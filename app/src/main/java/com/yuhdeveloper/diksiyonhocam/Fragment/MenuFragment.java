package com.yuhdeveloper.diksiyonhocam.Fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.OnMenuItemClickListener;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.yuhdeveloper.diksiyonhocam.Activity.MainActivity;
import com.yuhdeveloper.diksiyonhocam.R;

public class MenuFragment extends Fragment implements OnClickListener, RewardedVideoAdListener,
    OnMenuItemClickListener {


  ImageButton btn_tekerlemeler, btn_sesegzersizleri, btn_nefesegzersizleri, btn_diksiyonOnemi;
  ImageButton btn_diyaframOnemi;
  RewardedVideoAd rewardedVideoAd;

  Toolbar toolbar;

  MenuItem menuItem;
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View v = inflater.inflate(R.layout.fragment_menu, container, false);
    initStep1(v);
    return v;
  }

  @Override
  public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
    inflater.inflate(R.menu.menu_toolbar,menu);
    menuItem = menu.getItem(0);
    super.onCreateOptionsMenu(menu, inflater);
  }

  void Reklamiyukle() {
    rewardedVideoAd.loadAd(getString(R.string.odulluReklam1), new AdRequest.Builder()
        .addTestDevice("D9A8CF2E36EF152A1BA0456397164FF4")
        .build());
  }

  private void initStep1(View v) {
    toolbar = v.findViewById(R.id.myToolbar);
    this.setHasOptionsMenu(true);
    ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

    btn_tekerlemeler = v.findViewById(R.id.menu_tekerlemeler);
    btn_sesegzersizleri = v.findViewById(R.id.menu_ses);
    btn_nefesegzersizleri = v.findViewById(R.id.menu_nefes);
    btn_diksiyonOnemi = v.findViewById(R.id.menu_diksiyononemi);
    btn_diyaframOnemi = v.findViewById(R.id.menu_diyaframOnemi);
    btn_tekerlemeler.setOnClickListener(this);
    btn_sesegzersizleri.setOnClickListener(this);
    btn_nefesegzersizleri.setOnClickListener(this);
    btn_diksiyonOnemi.setOnClickListener(this);
    btn_diyaframOnemi.setOnClickListener(this);

    toolbar.inflateMenu(R.menu.menu_toolbar);
    toolbar.setOnMenuItemClickListener(this);
    rewardedVideoAd = MobileAds.getRewardedVideoAdInstance(getContext());
    rewardedVideoAd.setRewardedVideoAdListener(this);
    Reklamiyukle();
  }


  @Override
  public void onClick(View view) {
    switch (view.getId()) {
      case R.id.menu_tekerlemeler:
        rewardedVideoAd.destroy(getContext());
        getFragmentManager().beginTransaction()
            .replace(R.id.frame_fragmentLayout, new WordsFragment())
            .addToBackStack("wordfragment")
            .commit();
        break;
      case R.id.menu_ses:
        getFragmentManager().beginTransaction()
            .replace(R.id.frame_fragmentLayout, new VoiceFragment()).addToBackStack("voicefragment")
            .commit();
        break;
      case R.id.menu_diksiyononemi:
        getFragmentManager().beginTransaction()
            .replace(R.id.frame_fragmentLayout, new DiksiyonFragment())
            .addToBackStack("diksiyonFragment").commit();
        break;
      case R.id.menu_diyaframOnemi:
        getFragmentManager().beginTransaction()
            .replace(R.id.frame_fragmentLayout, new DiyaframFragment())
            .addToBackStack("diyaframFragment").commit();
        break;

      case R.id.menu_nefes:
        getFragmentManager().beginTransaction()
            .replace(R.id.frame_fragmentLayout, new NefesEgzersizleri())
            .addToBackStack("nefesFragment").commit();
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

//  @Override
//  public boolean onOptionsItemSelected(MenuItem item) {
//    switch (item.getItemId()) {
//      case R.id.menu_toolbarItem_banadestekol:
//        item.setVisible(false);
//        rewardedVideoAd.show();
//        Reklamiyukle();
//
//        break;
//      case R.id.menu_toolbarItem_youtube:
//        Intent yt_play = new Intent(Intent.ACTION_VIEW,
//            Uri.parse(getString(R.string.myYoutubeChannel)));
//        Intent chooser = Intent.createChooser(yt_play, "Open With");
//
//        if (yt_play.resolveActivity(getContext().getPackageManager()) != null) {
//          startActivity(chooser);
//        }
//        break;
//    }
//
//    return super.onOptionsItemSelected(item);
//  }

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
  public boolean onMenuItemClick(MenuItem item) {
    switch (item.getItemId()) {
      case R.id.menu_toolbarItem_banadestekol:
        toolbar.getMenu().getItem(0).setVisible(false);
        MainActivity._value +=60000;
        Toast.makeText(getContext(), "Tam Ekran Reklama : "+ String.valueOf(MainActivity._value/1000
        )+ " saniye kaldı", Toast.LENGTH_SHORT).show();
        rewardedVideoAd.show();
        Reklamiyukle();

        break;

      case R.id.menu_toolbarItem_youtube:
        Intent yt_play = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.myYoutubeChannel)));
        Intent chooser = Intent.createChooser(yt_play , "Open With");

        if (yt_play.resolveActivity(getContext().getPackageManager()) != null) {
          startActivity(chooser);
        }
        break;
    }
    return false;
  }
}
