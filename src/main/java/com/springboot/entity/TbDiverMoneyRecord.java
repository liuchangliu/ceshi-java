package com.springboot.entity;

import java.util.Date;

public class TbDiverMoneyRecord {
    private Long tdmrId;

    private Long tdmrDiverId;

    private Integer tdmrType;

    private Double tdmrAmount;

    private String tdmrAccount;

    private Long tdmrTransportId;

    private Date tdmrAddDate;

    private String tdmrMemo;

    public Long getTdmrId() {
        return tdmrId;
    }

    public void setTdmrId(Long tdmrId) {
        this.tdmrId = tdmrId;
    }

    public Long getTdmrDiverId() {
        return tdmrDiverId;
    }

    public void setTdmrDiverId(Long tdmrDiverId) {
        this.tdmrDiverId = tdmrDiverId;
    }

    public Integer getTdmrType() {
        return tdmrType;
    }

    public void setTdmrType(Integer tdmrType) {
        this.tdmrType = tdmrType;
    }

    public Double getTdmrAmount() {
        return tdmrAmount;
    }

    public void setTdmrAmount(Double tdmrAmount) {
        this.tdmrAmount = tdmrAmount;
    }

    public String getTdmrAccount() {
        return tdmrAccount;
    }

    public void setTdmrAccount(String tdmrAccount) {
        this.tdmrAccount = tdmrAccount;
    }

    public Long getTdmrTransportId() {
        return tdmrTransportId;
    }

    public void setTdmrTransportId(Long tdmrTransportId) {
        this.tdmrTransportId = tdmrTransportId;
    }

    public Date getTdmrAddDate() {
        return tdmrAddDate;
    }

    public void setTdmrAddDate(Date tdmrAddDate) {
        this.tdmrAddDate = tdmrAddDate;
    }

    public String getTdmrMemo() {
        return tdmrMemo;
    }

    public void setTdmrMemo(String tdmrMemo) {
        this.tdmrMemo = tdmrMemo;
    }
}