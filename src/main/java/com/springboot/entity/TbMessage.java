package com.springboot.entity;

import java.util.Date;

public class TbMessage {
    private Long tmId;

    private Long tmMemberId;

    private String tmTitle;

    private String tmContent;

    private Date tmAddDate;

    private Integer tmStatus;

    private Long tmAddPerson;

    private String tmNumber;

    private Integer tmIfSendSms;

    private Integer tmType;

    public Long getTmId() {
        return tmId;
    }

    public void setTmId(Long tmId) {
        this.tmId = tmId;
    }

    public Long getTmMemberId() {
        return tmMemberId;
    }

    public void setTmMemberId(Long tmMemberId) {
        this.tmMemberId = tmMemberId;
    }

    public String getTmTitle() {
        return tmTitle;
    }

    public void setTmTitle(String tmTitle) {
        this.tmTitle = tmTitle;
    }

    public String getTmContent() {
        return tmContent;
    }

    public void setTmContent(String tmContent) {
        this.tmContent = tmContent;
    }

    public Date getTmAddDate() {
        return tmAddDate;
    }

    public void setTmAddDate(Date tmAddDate) {
        this.tmAddDate = tmAddDate;
    }

    public Integer getTmStatus() {
        return tmStatus;
    }

    public void setTmStatus(Integer tmStatus) {
        this.tmStatus = tmStatus;
    }

    public Long getTmAddPerson() {
        return tmAddPerson;
    }

    public void setTmAddPerson(Long tmAddPerson) {
        this.tmAddPerson = tmAddPerson;
    }

    public String getTmNumber() {
        return tmNumber;
    }

    public void setTmNumber(String tmNumber) {
        this.tmNumber = tmNumber;
    }

    public Integer getTmIfSendSms() {
        return tmIfSendSms;
    }

    public void setTmIfSendSms(Integer tmIfSendSms) {
        this.tmIfSendSms = tmIfSendSms;
    }

    public Integer getTmType() {
        return tmType;
    }

    public void setTmType(Integer tmType) {
        this.tmType = tmType;
    }
}