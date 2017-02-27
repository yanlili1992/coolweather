package com.example.coolweather.android.db;

import android.content.SharedPreferences;

import org.litepal.crud.DataSupport;

/**
 * Created by liuht on 2017/2/27.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private String provinceeCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceeName){
        this.provinceName=provinceName;
    }
    public String getProvinceeCode(){
        return provinceeCode;
    }
    public void setProvinceeCode(String provinceeCode){
        this.provinceeCode=provinceeCode;
    }
}
