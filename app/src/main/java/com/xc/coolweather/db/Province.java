package com.xc.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by XC on 2017/6/7.
 */

public class Province extends DataSupport {

    private int id;

    private String provinceName;//省份

    private int provinceCode;//编码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
