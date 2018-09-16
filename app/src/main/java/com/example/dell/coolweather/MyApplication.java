package com.example.dell.coolweather;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/*
 *项目名： CoolWeather
 *包名：   com.example.dell.coolweather
 *创建者： DELL
 *创建时间：2018/9/16 23:29
 作用： 
 */public class MyApplication extends Application {
     private static Context context;

    @Override
    public void onCreate() {
        context=getApplicationContext();
        LitePal.initialize(context);
    }

    public static Context getContext() {
        return context;
    }
}
