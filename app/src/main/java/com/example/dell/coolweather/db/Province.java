package com.example.dell.coolweather.db;

import org.litepal.crud.LitePalSupport;

/*
 *项目名： CoolWeather
 *包名：   com.example.dell.coolweather.db
 *创建者： DELL
 *创建时间：2018/9/16 13:53
 作用： 
 */public class Province extends LitePalSupport{
     private int id;
     private String provinceName;
     private int provinceCode;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
