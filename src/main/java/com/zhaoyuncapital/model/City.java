package com.zhaoyuncapital.model;

/**
 * Created by gongtuo on 2017/5/22.
 */
public class City extends BaseEntity {
    private  String name;

    private  String state;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }




}
