package com.zhaoyuncapital.model.domain;

/**
 * Created by gongtuo on 2017/6/7.
 */
public class CMS_ADMIN_MST {
    private int ID;
    private String LOING_ID;
    private String PASSWORD;
    private String USER_NAME;
    private String POSITION;
    private String PERMISSIONS;
    private String MARK;
    private String CMP_TYPE;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLOING_ID() {
        return LOING_ID;
    }

    public void setLOING_ID(String LOING_ID) {
        this.LOING_ID = LOING_ID;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getPOSITION() {
        return POSITION;
    }

    public void setPOSITION(String POSITION) {
        this.POSITION = POSITION;
    }

    public String getPERMISSIONS() {
        return PERMISSIONS;
    }

    public void setPERMISSIONS(String PERMISSIONS) {
        this.PERMISSIONS = PERMISSIONS;
    }

    public String getMARK() {
        return MARK;
    }

    public void setMARK(String MARK) {
        this.MARK = MARK;
    }

    public String getCMP_TYPE() {
        return CMP_TYPE;
    }

    public void setCMP_TYPE(String CMP_TYPE) {
        this.CMP_TYPE = CMP_TYPE;
    }
}
