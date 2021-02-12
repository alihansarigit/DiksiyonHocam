package com.yuhdeveloper.diksiyonhocam.Fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.yuhdeveloper.diksiyonhocam.Activity.MainActivity;
import com.yuhdeveloper.diksiyonhocam.Adapt.myRecyAdapter;
import com.yuhdeveloper.diksiyonhocam.R;
import com.yuhdeveloper.diksiyonhocam.TekerlemeClass;
import java.util.List;

public class WordsFragment extends Fragment implements
    RewardedVideoAdListener {

  RecyclerView recyclerView;
  Toolbar toolbar;
  RewardedVideoAd rewardedVideoAd;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View v = inflater.inflate(R.layout.fragment_words, container, false);
    initStep1(v);
    return v;
  }


  @Override
  public void onStop() {
    super.onStop();
  }

  void Reklamiyukle() {
    rewardedVideoAd.loadAd(getString(R.string.odulluReklam1), new AdRequest.Builder()
        .addTestDevice("8AE65708CBB07AD6DE19921409EF11E6")
        .build());
  }

  MenuItem menuItem;

  @Override
  public void onCreateOptionsMenu(final Menu menu, MenuInflater inflater) {
    inflater.inflate(R.menu.menu_toolbar, menu);
    menuItem = menu.getItem(0);
    super.onCreateOptionsMenu(menu, inflater);
  }


  void onReklam() {

    rewardedVideoAd = MobileAds.getRewardedVideoAdInstance(getContext());
    rewardedVideoAd.setRewardedVideoAdListener(this);
  }

  private void initStep1(View v) {
    recyclerView = v.findViewById(R.id.tekerlemelerRecy);

    toolbar = v.findViewById(R.id.myToolbar);
    this.setHasOptionsMenu(true);
    ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
    ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    toolbar.setNavigationOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        getFragmentManager().popBackStack();

      }
    });

    List<String> harfler = TekerlemeClass.getWords();

    myRecyAdapter myRecyAdapter = new myRecyAdapter(getContext(), harfler);
    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    recyclerView.setAdapter(myRecyAdapter);

    onReklam();
    Reklamiyukle();
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
        Intent yt_play = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.myYoutubeChannel)));
        Intent chooser = Intent.createChooser(yt_play , "Open With");

        if (yt_play.resolveActivity(getContext().getPackageManager()) != null) {
          startActivity(chooser);
        }
        break;
    }
    return super.onOptionsItemSelected(item);
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
}
