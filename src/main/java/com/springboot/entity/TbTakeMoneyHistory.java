package com.springboot.entity;

import java.util.Date;

public class TbTakeMoneyHistory {
    private Long ttmhId;

    private Integer ttmhUserType;

    private Integer ttmhType;

    private Long ttmhMemberId;

    private Date ttmhAddDate;

    private Double ttmhAmount;

    private String ttmhWithdrawAccount;

    private Integer ttmhStatus;

    private Integer ttmhPayType;

    private Boolean ttmhPayResult;

    private String ttmhPayNumber;

    private String ttmhDesc;

    private Long ttmhCheckPerson;

    private Date ttmhCheckTime;

    private String ttmhCheckDesp;

    private Long ttmhMoneyOrderId;

    public Long getTtmhId() {
        return ttmhId;
    }

    public void setTtmhId(Long ttmhId) {
        this.ttmhId = ttmhId;
    }

    public Integer getTtmhUserType() {
        return ttmhUserType;
    }

    public void setTtmhUserType(Integer ttmhUserType) {
        this.ttmhUserType = ttmhUserType;
    }

    public Integer getTtmhType() {
        return ttmhType;
    }

    public void setTtmhType(Integer ttmhType) {
        this.ttmhType = ttmhType;
    }

    public Long getTtmhMemberId() {
        return ttmhMemberId;
    }

    public void setTtmhMemberId(Long ttmhMemberId) {
        this.ttmhMemberId = ttmhMemberId;
    }

    public Date getTtmhAddDate() {
        return ttmhAddDate;
    }

    public void setTtmhAddDate(Date ttmhAddDate) {
        this.ttmhAddDate = ttmhAddDate;
    }

    public Double getTtmhAmount() {
        return ttmhAmount;
    }

    public void setTtmhAmount(Double ttmhAmount) {
        this.ttmhAmount = ttmhAmount;
    }

    public String getTtmhWithdrawAccount() {
        return ttmhWithdrawAccount;
    }

    public void setTtmhWithdrawAccount(String ttmhWithdrawAccount) {
        this.ttmhWithdrawAccount = ttmhWithdrawAccount;
    }

    public Integer getTtmhStatus() {
        return ttmhStatus;
    }

    public void setTtmhStatus(Integer ttmhStatus) {
        this.ttmhStatus = ttmhStatus;
    }

    public Integer getTtmhPayType() {
        return ttmhPayType;
    }

    public void setTtmhPayType(Integer ttmhPayType) {
        this.ttmhPayType = ttmhPayType;
    }

    public Boolean getTtmhPayResult() {
        return ttmhPayResult;
    }

    public void setTtmhPayResult(Boolean ttmhPayResult) {
        this.ttmhPayResult = ttmhPayResult;
    }

    public String getTtmhPayNumber() {
        return ttmhPayNumber;
    }

    public void setTtmhPayNumber(String ttmhPayNumber) {
        this.ttmhPayNumber = ttmhPayNumber;
    }

    public String getTtmhDesc() {
        return ttmhDesc;
    }

    public void setTtmhDesc(String ttmhDesc) {
        this.ttmhDesc = ttmhDesc;
    }

    public Long getTtmhCheckPerson() {
        return ttmhCheckPerson;
    }

    public void setTtmhCheckPerson(Long ttmhCheckPerson) {
        this.ttmhCheckPerson = ttmhCheckPerson;
    }

    public Date getTtmhCheckTime() {
        return ttmhCheckTime;
    }

    public void setTtmhCheckTime(Date ttmhCheckTime) {
        this.ttmhCheckTime = ttmhCheckTime;
    }

    public String getTtmhCheckDesp() {
        return ttmhCheckDesp;
    }

    public void setTtmhCheckDesp(String ttmhCheckDesp) {
        this.ttmhCheckDesp = ttmhCheckDesp;
    }

    public Long getTtmhMoneyOrderId() {
        return ttmhMoneyOrderId;
    }

    public void setTtmhMoneyOrderId(Long ttmhMoneyOrderId) {
        this.ttmhMoneyOrderId = ttmhMoneyOrderId;
    }
}