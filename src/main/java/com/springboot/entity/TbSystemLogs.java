package com.springboot.entity;

import java.util.Date;

public class TbSystemLogs {
    private Long tslId;

    private Integer tslType;

    private Integer tslAccountType;

    private String tslLoginAccount;

    private String tslLoginIp;

    private Date tslAddDate;

    private String tlsMemo;

    public Long getTslId() {
        return tslId;
    }

    public void setTslId(Long tslId) {
        this.tslId = tslId;
    }

    public Integer getTslType() {
        return tslType;
    }

    public void setTslType(Integer tslType) {
        this.tslType = tslType;
    }

    public Integer getTslAccountType() {
        return tslAccountType;
    }

    public void setTslAccountType(Integer tslAccountType) {
        this.tslAccountType = tslAccountType;
    }

    public String getTslLoginAccount() {
        return tslLoginAccount;
    }

    public void setTslLoginAccount(String tslLoginAccount) {
        this.tslLoginAccount = tslLoginAccount;
    }

    public String getTslLoginIp() {
        return tslLoginIp;
    }

    public void setTslLoginIp(String tslLoginIp) {
        this.tslLoginIp = tslLoginIp;
    }

    public Date getTslAddDate() {
        return tslAddDate;
    }

    public void setTslAddDate(Date tslAddDate) {
        this.tslAddDate = tslAddDate;
    }

    public String getTlsMemo() {
        return tlsMemo;
    }

    public void setTlsMemo(String tlsMemo) {
        this.tlsMemo = tlsMemo;
    }
}