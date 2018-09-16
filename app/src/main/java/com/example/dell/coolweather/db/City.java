package com.example.dell.coolweather.db;

import android.provider.ContactsContract;

import org.litepal.crud.LitePalSupport;

/*
 *项目名： CoolWeather
 *包名：   com.example.dell.coolweather.db
 *创建者： DELL
 *创建时间：2018/9/16 13:54
 作用： 
 */public class City extends LitePalSupport{
     private int id;
     private String cityName;
     private int cityCode;
     private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
