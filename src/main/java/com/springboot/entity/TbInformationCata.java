package com.springboot.entity;

import java.util.Date;

public class TbInformationCata {
    private Long ticId;

    private String ticName;

    private Long ticParentId;

    private Integer ticOrder;

    private Date ticAddDate;

    private Integer ticStatus;

    public Long getTicId() {
        return ticId;
    }

    public void setTicId(Long ticId) {
        this.ticId = ticId;
    }

    public String getTicName() {
        return ticName;
    }

    public void setTicName(String ticName) {
        this.ticName = ticName;
    }

    public Long getTicParentId() {
        return ticParentId;
    }

    public void setTicParentId(Long ticParentId) {
        this.ticParentId = ticParentId;
    }

    public Integer getTicOrder() {
        return ticOrder;
    }

    public void setTicOrder(Integer ticOrder) {
        this.ticOrder = ticOrder;
    }

    public Date getTicAddDate() {
        return ticAddDate;
    }

    public void setTicAddDate(Date ticAddDate) {
        this.ticAddDate = ticAddDate;
    }

    public Integer getTicStatus() {
        return ticStatus;
    }

    public void setTicStatus(Integer ticStatus) {
        this.ticStatus = ticStatus;
    }
}