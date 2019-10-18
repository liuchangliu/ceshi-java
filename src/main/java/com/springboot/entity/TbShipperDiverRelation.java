package com.springboot.entity;

import java.util.Date;

public class TbShipperDiverRelation {
    private Long tsdrId;

    private Long tsdrShipperId;

    private Long tsdrDiverId;

    private Integer tsdrStatus;

    private Date tsdrAddDate;

    public Long getTsdrId() {
        return tsdrId;
    }

    public void setTsdrId(Long tsdrId) {
        this.tsdrId = tsdrId;
    }

    public Long getTsdrShipperId() {
        return tsdrShipperId;
    }

    public void setTsdrShipperId(Long tsdrShipperId) {
        this.tsdrShipperId = tsdrShipperId;
    }

    public Long getTsdrDiverId() {
        return tsdrDiverId;
    }

    public void setTsdrDiverId(Long tsdrDiverId) {
        this.tsdrDiverId = tsdrDiverId;
    }

    public Integer getTsdrStatus() {
        return tsdrStatus;
    }

    public void setTsdrStatus(Integer tsdrStatus) {
        this.tsdrStatus = tsdrStatus;
    }

    public Date getTsdrAddDate() {
        return tsdrAddDate;
    }

    public void setTsdrAddDate(Date tsdrAddDate) {
        this.tsdrAddDate = tsdrAddDate;
    }
}