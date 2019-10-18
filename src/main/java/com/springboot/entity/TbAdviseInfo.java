package com.springboot.entity;

import java.util.Date;

public class TbAdviseInfo {
    private Long taiId;

    private String taiPhone;

    private String taiDesc;

    private Date taiAddDate;

    private Integer taiStatus;

    public Long getTaiId() {
        return taiId;
    }

    public void setTaiId(Long taiId) {
        this.taiId = taiId;
    }

    public String getTaiPhone() {
        return taiPhone;
    }

    public void setTaiPhone(String taiPhone) {
        this.taiPhone = taiPhone;
    }

    public String getTaiDesc() {
        return taiDesc;
    }

    public void setTaiDesc(String taiDesc) {
        this.taiDesc = taiDesc;
    }

    public Date getTaiAddDate() {
        return taiAddDate;
    }

    public void setTaiAddDate(Date taiAddDate) {
        this.taiAddDate = taiAddDate;
    }

    public Integer getTaiStatus() {
        return taiStatus;
    }

    public void setTaiStatus(Integer taiStatus) {
        this.taiStatus = taiStatus;
    }
}