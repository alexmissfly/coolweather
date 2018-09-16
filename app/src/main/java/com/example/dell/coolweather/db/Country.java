package com.example.dell.coolweather.db;

import org.litepal.crud.LitePalSupport;

/*
 *项目名： CoolWeather
 *包名：   com.example.dell.coolweather.db
 *创建者： DELL
 *创建时间：2018/9/16 14:05
 作用： 
 */public class Country extends LitePalSupport {
     private int id;
     private String countryName;
     private String weatherId;
     private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
