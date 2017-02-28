package com.example.coolweather.android;

import android.app.Application;
import android.content.Context;
import android.support.v4.media.MediaMetadataCompat;

import org.litepal.LitePal;

/**
 * Created by liuht on 2017/2/28.
 */

public class MyApplication extends Application {
    private static Context context;
    @Override
    public void onCreate(){
        context=getApplicationContext();
        LitePal.initialize(context);
    }
  public static Context getContext(){
      return context;
  }
}
