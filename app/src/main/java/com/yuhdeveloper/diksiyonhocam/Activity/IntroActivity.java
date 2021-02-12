package com.yuhdeveloper.diksiyonhocam.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;

import com.yuhdeveloper.diksiyonhocam.R;

public class IntroActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_intro);

    final Intent i = new Intent(this,MainActivity.class);

    new CountDownTimer(2000, 1000) {
      @Override
      public void onTick(long l) {

      }

      @Override
      public void onFinish() {
        startActivity(i);
        finish();
      }
    }.start();


  }

}
