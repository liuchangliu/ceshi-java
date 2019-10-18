package com.springboot.entity;

import java.util.Date;

public class TbWords {
    private Long twId;

    private String twCode;

    private String twName;

    private String twValue;

    private Date twAddDate;

    private Long twAddPerson;

    private String twMemo;

    private Integer twStatus;

    private String twIcon;

    public Long getTwId() {
        return twId;
    }

    public void setTwId(Long twId) {
        this.twId = twId;
    }

    public String getTwCode() {
        return twCode;
    }

    public void setTwCode(String twCode) {
        this.twCode = twCode;
    }

    public String getTwName() {
        return twName;
    }

    public void setTwName(String twName) {
        this.twName = twName;
    }

    public String getTwValue() {
        return twValue;
    }

    public void setTwValue(String twValue) {
        this.twValue = twValue;
    }

    public Date getTwAddDate() {
        return twAddDate;
    }

    public void setTwAddDate(Date twAddDate) {
        this.twAddDate = twAddDate;
    }

    public Long getTwAddPerson() {
        return twAddPerson;
    }

    public void setTwAddPerson(Long twAddPerson) {
        this.twAddPerson = twAddPerson;
    }

    public String getTwMemo() {
        return twMemo;
    }

    public void setTwMemo(String twMemo) {
        this.twMemo = twMemo;
    }

    public Integer getTwStatus() {
        return twStatus;
    }

    public void setTwStatus(Integer twStatus) {
        this.twStatus = twStatus;
    }

    public String getTwIcon() {
        return twIcon;
    }

    public void setTwIcon(String twIcon) {
        this.twIcon = twIcon;
    }
}