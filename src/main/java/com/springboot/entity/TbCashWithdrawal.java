package com.springboot.entity;

import java.util.Date;

public class TbCashWithdrawal {
    private Long tcwId;

    private Integer tcwType;

    private Long tcwCashId;

    private Double tcwPrice;

    private String tcwAccount;

    private String tcwDesp;

    private Date tcwAddDate;

    private Integer tcwStatus;

    private Long tcwCheckPerson;

    private Date tcwCheckTime;

    private String tcwCheckDesp;

    public Long getTcwId() {
        return tcwId;
    }

    public void setTcwId(Long tcwId) {
        this.tcwId = tcwId;
    }

    public Integer getTcwType() {
        return tcwType;
    }

    public void setTcwType(Integer tcwType) {
        this.tcwType = tcwType;
    }

    public Long getTcwCashId() {
        return tcwCashId;
    }

    public void setTcwCashId(Long tcwCashId) {
        this.tcwCashId = tcwCashId;
    }

    public Double getTcwPrice() {
        return tcwPrice;
    }

    public void setTcwPrice(Double tcwPrice) {
        this.tcwPrice = tcwPrice;
    }

    public String getTcwAccount() {
        return tcwAccount;
    }

    public void setTcwAccount(String tcwAccount) {
        this.tcwAccount = tcwAccount;
    }

    public String getTcwDesp() {
        return tcwDesp;
    }

    public void setTcwDesp(String tcwDesp) {
        this.tcwDesp = tcwDesp;
    }

    public Date getTcwAddDate() {
        return tcwAddDate;
    }

    public void setTcwAddDate(Date tcwAddDate) {
        this.tcwAddDate = tcwAddDate;
    }

    public Integer getTcwStatus() {
        return tcwStatus;
    }

    public void setTcwStatus(Integer tcwStatus) {
        this.tcwStatus = tcwStatus;
    }

    public Long getTcwCheckPerson() {
        return tcwCheckPerson;
    }

    public void setTcwCheckPerson(Long tcwCheckPerson) {
        this.tcwCheckPerson = tcwCheckPerson;
    }

    public Date getTcwCheckTime() {
        return tcwCheckTime;
    }

    public void setTcwCheckTime(Date tcwCheckTime) {
        this.tcwCheckTime = tcwCheckTime;
    }

    public String getTcwCheckDesp() {
        return tcwCheckDesp;
    }

    public void setTcwCheckDesp(String tcwCheckDesp) {
        this.tcwCheckDesp = tcwCheckDesp;
    }
}