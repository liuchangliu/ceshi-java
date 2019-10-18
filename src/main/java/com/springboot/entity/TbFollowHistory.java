package com.springboot.entity;

import java.util.Date;

public class TbFollowHistory {
    private Long tfhId;

    private Integer tfhType;

    private Long tfhFrom;

    private Long tfhTo;

    private Date tfhAddDate;

    private Integer tfhStatus;

    private Date tfhCheckDatetime;

    private String tfhCheckDes;

    public Long getTfhId() {
        return tfhId;
    }

    public void setTfhId(Long tfhId) {
        this.tfhId = tfhId;
    }

    public Integer getTfhType() {
        return tfhType;
    }

    public void setTfhType(Integer tfhType) {
        this.tfhType = tfhType;
    }

    public Long getTfhFrom() {
        return tfhFrom;
    }

    public void setTfhFrom(Long tfhFrom) {
        this.tfhFrom = tfhFrom;
    }

    public Long getTfhTo() {
        return tfhTo;
    }

    public void setTfhTo(Long tfhTo) {
        this.tfhTo = tfhTo;
    }

    public Date getTfhAddDate() {
        return tfhAddDate;
    }

    public void setTfhAddDate(Date tfhAddDate) {
        this.tfhAddDate = tfhAddDate;
    }

    public Integer getTfhStatus() {
        return tfhStatus;
    }

    public void setTfhStatus(Integer tfhStatus) {
        this.tfhStatus = tfhStatus;
    }

    public Date getTfhCheckDatetime() {
        return tfhCheckDatetime;
    }

    public void setTfhCheckDatetime(Date tfhCheckDatetime) {
        this.tfhCheckDatetime = tfhCheckDatetime;
    }

    public String getTfhCheckDes() {
        return tfhCheckDes;
    }

    public void setTfhCheckDes(String tfhCheckDes) {
        this.tfhCheckDes = tfhCheckDes;
    }
}