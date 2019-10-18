package com.springboot.entity;

import java.util.Date;

public class TbDriverBankInfo {
    private Long tdbiId;

    private Long tdbiBankId;

    private Long tdbiDriverId;

    private String tdbiBranchName;

    private String tdbiAccount;

    private String tdbiName;

    private Date tdbiAddDate;

    private Integer tdbiStatus;

    private String tdbiDriverPhone;

    public Long getTdbiId() {
        return tdbiId;
    }

    public void setTdbiId(Long tdbiId) {
        this.tdbiId = tdbiId;
    }

    public Long getTdbiBankId() {
        return tdbiBankId;
    }

    public void setTdbiBankId(Long tdbiBankId) {
        this.tdbiBankId = tdbiBankId;
    }

    public Long getTdbiDriverId() {
        return tdbiDriverId;
    }

    public void setTdbiDriverId(Long tdbiDriverId) {
        this.tdbiDriverId = tdbiDriverId;
    }

    public String getTdbiBranchName() {
        return tdbiBranchName;
    }

    public void setTdbiBranchName(String tdbiBranchName) {
        this.tdbiBranchName = tdbiBranchName;
    }

    public String getTdbiAccount() {
        return tdbiAccount;
    }

    public void setTdbiAccount(String tdbiAccount) {
        this.tdbiAccount = tdbiAccount;
    }

    public String getTdbiName() {
        return tdbiName;
    }

    public void setTdbiName(String tdbiName) {
        this.tdbiName = tdbiName;
    }

    public Date getTdbiAddDate() {
        return tdbiAddDate;
    }

    public void setTdbiAddDate(Date tdbiAddDate) {
        this.tdbiAddDate = tdbiAddDate;
    }

    public Integer getTdbiStatus() {
        return tdbiStatus;
    }

    public void setTdbiStatus(Integer tdbiStatus) {
        this.tdbiStatus = tdbiStatus;
    }

    public String getTdbiDriverPhone() {
        return tdbiDriverPhone;
    }

    public void setTdbiDriverPhone(String tdbiDriverPhone) {
        this.tdbiDriverPhone = tdbiDriverPhone;
    }
}