package com.xc.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by XC on 2017/6/7.
 */

public class City extends DataSupport {

    private int id;

    private String cittName;//城市名

    private int cityCode;//城市编号

    private int provinceId;//附属城市

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCittName() {
        return cittName;
    }

    public void setCittName(String cittName) {
        this.cittName = cittName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
