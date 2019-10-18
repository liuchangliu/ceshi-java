package com.springboot.entity;

import java.util.Date;

public class TbBackstageStaffInfo {
    private Long tbsiId;

    private String tbsiName;

    private String tbsiPhone;

    private String tbsiCardNumber;

    private Long tbsiPosition;

    private String tbsiAddresss;

    private Date tbsiAddDate;

    private Integer tbsiStatus;

    public Long getTbsiId() {
        return tbsiId;
    }

    public void setTbsiId(Long tbsiId) {
        this.tbsiId = tbsiId;
    }

    public String getTbsiName() {
        return tbsiName;
    }

    public void setTbsiName(String tbsiName) {
        this.tbsiName = tbsiName;
    }

    public String getTbsiPhone() {
        return tbsiPhone;
    }

    public void setTbsiPhone(String tbsiPhone) {
        this.tbsiPhone = tbsiPhone;
    }

    public String getTbsiCardNumber() {
        return tbsiCardNumber;
    }

    public void setTbsiCardNumber(String tbsiCardNumber) {
        this.tbsiCardNumber = tbsiCardNumber;
    }

    public Long getTbsiPosition() {
        return tbsiPosition;
    }

    public void setTbsiPosition(Long tbsiPosition) {
        this.tbsiPosition = tbsiPosition;
    }

    public String getTbsiAddresss() {
        return tbsiAddresss;
    }

    public void setTbsiAddresss(String tbsiAddresss) {
        this.tbsiAddresss = tbsiAddresss;
    }

    public Date getTbsiAddDate() {
        return tbsiAddDate;
    }

    public void setTbsiAddDate(Date tbsiAddDate) {
        this.tbsiAddDate = tbsiAddDate;
    }

    public Integer getTbsiStatus() {
        return tbsiStatus;
    }

    public void setTbsiStatus(Integer tbsiStatus) {
        this.tbsiStatus = tbsiStatus;
    }
}