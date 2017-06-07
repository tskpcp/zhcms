package com.zhaoyuncapital.model.domain;

import com.zhaoyuncapital.model.BaseEntity;

/**
 * Created by gongtuo on 2017/5/22.
 */
public class Country extends BaseEntity {
    private  String countryname;
    private  String countrycode;
    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }


}
