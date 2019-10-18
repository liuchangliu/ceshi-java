package com.springboot.entity;

import java.util.Date;

public class TbShipperMoney {
    private Long tsmId;

    private Long tsmShipperId;

    private Integer tsmType;

    private Double tsmAmount;

    private String tsmAccount;

    private Integer tsmMode;

    private String tsmBankNumber;

    private Long tsmTransportId;

    private String tsmDesc;

    private Date tsmAddDate;

    private Integer tsmStatus;

    public Long getTsmId() {
        return tsmId;
    }

    public void setTsmId(Long tsmId) {
        this.tsmId = tsmId;
    }

    public Long getTsmShipperId() {
        return tsmShipperId;
    }

    public void setTsmShipperId(Long tsmShipperId) {
        this.tsmShipperId = tsmShipperId;
    }

    public Integer getTsmType() {
        return tsmType;
    }

    public void setTsmType(Integer tsmType) {
        this.tsmType = tsmType;
    }

    public Double getTsmAmount() {
        return tsmAmount;
    }

    public void setTsmAmount(Double tsmAmount) {
        this.tsmAmount = tsmAmount;
    }

    public String getTsmAccount() {
        return tsmAccount;
    }

    public void setTsmAccount(String tsmAccount) {
        this.tsmAccount = tsmAccount;
    }

    public Integer getTsmMode() {
        return tsmMode;
    }

    public void setTsmMode(Integer tsmMode) {
        this.tsmMode = tsmMode;
    }

    public String getTsmBankNumber() {
        return tsmBankNumber;
    }

    public void setTsmBankNumber(String tsmBankNumber) {
        this.tsmBankNumber = tsmBankNumber;
    }

    public Long getTsmTransportId() {
        return tsmTransportId;
    }

    public void setTsmTransportId(Long tsmTransportId) {
        this.tsmTransportId = tsmTransportId;
    }

    public String getTsmDesc() {
        return tsmDesc;
    }

    public void setTsmDesc(String tsmDesc) {
        this.tsmDesc = tsmDesc;
    }

    public Date getTsmAddDate() {
        return tsmAddDate;
    }

    public void setTsmAddDate(Date tsmAddDate) {
        this.tsmAddDate = tsmAddDate;
    }

    public Integer getTsmStatus() {
        return tsmStatus;
    }

    public void setTsmStatus(Integer tsmStatus) {
        this.tsmStatus = tsmStatus;
    }
}