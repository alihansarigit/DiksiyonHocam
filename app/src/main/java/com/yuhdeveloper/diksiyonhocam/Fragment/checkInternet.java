package com.yuhdeveloper.diksiyonhocam.Fragment;

import android.content.Context;
import android.net.ConnectivityManager;

/**
 * Created by kored on 29.11.2017.
 */

public class checkInternet {


  public static Boolean checkInternet(Context ctx){
    ConnectivityManager connectivityManager = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);

    return connectivityManager.getActiveNetworkInfo()!=null && connectivityManager.getActiveNetworkInfo().isConnected();
  }
}
