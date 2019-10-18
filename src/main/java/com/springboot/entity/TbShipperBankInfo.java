package com.springboot.entity;

import java.util.Date;

public class TbShipperBankInfo {
    private Long tsbiId;

    private Long tsbiBankId;

    private Long tsbiShipperId;

    private String tsbiBranchName;

    private String tsbiShipperPhone;

    private String tsbiAccount;

    private String tsbiName;

    private Date tsbiAddDate;

    private Integer tsbiStatus;

    public Long getTsbiId() {
        return tsbiId;
    }

    public void setTsbiId(Long tsbiId) {
        this.tsbiId = tsbiId;
    }

    public Long getTsbiBankId() {
        return tsbiBankId;
    }

    public void setTsbiBankId(Long tsbiBankId) {
        this.tsbiBankId = tsbiBankId;
    }

    public Long getTsbiShipperId() {
        return tsbiShipperId;
    }

    public void setTsbiShipperId(Long tsbiShipperId) {
        this.tsbiShipperId = tsbiShipperId;
    }

    public String getTsbiBranchName() {
        return tsbiBranchName;
    }

    public void setTsbiBranchName(String tsbiBranchName) {
        this.tsbiBranchName = tsbiBranchName;
    }

    public String getTsbiShipperPhone() {
        return tsbiShipperPhone;
    }

    public void setTsbiShipperPhone(String tsbiShipperPhone) {
        this.tsbiShipperPhone = tsbiShipperPhone;
    }

    public String getTsbiAccount() {
        return tsbiAccount;
    }

    public void setTsbiAccount(String tsbiAccount) {
        this.tsbiAccount = tsbiAccount;
    }

    public String getTsbiName() {
        return tsbiName;
    }

    public void setTsbiName(String tsbiName) {
        this.tsbiName = tsbiName;
    }

    public Date getTsbiAddDate() {
        return tsbiAddDate;
    }

    public void setTsbiAddDate(Date tsbiAddDate) {
        this.tsbiAddDate = tsbiAddDate;
    }

    public Integer getTsbiStatus() {
        return tsbiStatus;
    }

    public void setTsbiStatus(Integer tsbiStatus) {
        this.tsbiStatus = tsbiStatus;
    }
}