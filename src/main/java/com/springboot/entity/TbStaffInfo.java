package com.springboot.entity;

import java.util.Date;

public class TbStaffInfo {
    private Long tsiId;

    private Long tsiShipperId;

    private String tsiName;

    private String tsiPhone;

    private String tsiCardNumber;

    private Long tsiPosition;

    private String tsiLoginuser;

    private String tsiPassword;

    private String tsiRemark;

    private Integer tsiStatus;

    private Date tsiAddDate;

    public Long getTsiId() {
        return tsiId;
    }

    public void setTsiId(Long tsiId) {
        this.tsiId = tsiId;
    }

    public Long getTsiShipperId() {
        return tsiShipperId;
    }

    public void setTsiShipperId(Long tsiShipperId) {
        this.tsiShipperId = tsiShipperId;
    }

    public String getTsiName() {
        return tsiName;
    }

    public void setTsiName(String tsiName) {
        this.tsiName = tsiName;
    }

    public String getTsiPhone() {
        return tsiPhone;
    }

    public void setTsiPhone(String tsiPhone) {
        this.tsiPhone = tsiPhone;
    }

    public String getTsiCardNumber() {
        return tsiCardNumber;
    }

    public void setTsiCardNumber(String tsiCardNumber) {
        this.tsiCardNumber = tsiCardNumber;
    }

    public Long getTsiPosition() {
        return tsiPosition;
    }

    public void setTsiPosition(Long tsiPosition) {
        this.tsiPosition = tsiPosition;
    }

    public String getTsiLoginuser() {
        return tsiLoginuser;
    }

    public void setTsiLoginuser(String tsiLoginuser) {
        this.tsiLoginuser = tsiLoginuser;
    }

    public String getTsiPassword() {
        return tsiPassword;
    }

    public void setTsiPassword(String tsiPassword) {
        this.tsiPassword = tsiPassword;
    }

    public String getTsiRemark() {
        return tsiRemark;
    }

    public void setTsiRemark(String tsiRemark) {
        this.tsiRemark = tsiRemark;
    }

    public Integer getTsiStatus() {
        return tsiStatus;
    }

    public void setTsiStatus(Integer tsiStatus) {
        this.tsiStatus = tsiStatus;
    }

    public Date getTsiAddDate() {
        return tsiAddDate;
    }

    public void setTsiAddDate(Date tsiAddDate) {
        this.tsiAddDate = tsiAddDate;
    }
}