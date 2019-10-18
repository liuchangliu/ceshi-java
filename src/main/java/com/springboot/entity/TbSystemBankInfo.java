package com.springboot.entity;

import java.util.Date;

public class TbSystemBankInfo {
    private Long tsbiId;

    private String tsbiName;

    private String tsbiSimpleName;

    private Date tsbiAddDate;

    private Integer tsbiStatus;

    public Long getTsbiId() {
        return tsbiId;
    }

    public void setTsbiId(Long tsbiId) {
        this.tsbiId = tsbiId;
    }

    public String getTsbiName() {
        return tsbiName;
    }

    public void setTsbiName(String tsbiName) {
        this.tsbiName = tsbiName;
    }

    public String getTsbiSimpleName() {
        return tsbiSimpleName;
    }

    public void setTsbiSimpleName(String tsbiSimpleName) {
        this.tsbiSimpleName = tsbiSimpleName;
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