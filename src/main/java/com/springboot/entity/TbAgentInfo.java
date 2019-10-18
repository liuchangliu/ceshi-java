package com.springboot.entity;

import java.util.Date;

public class TbAgentInfo {
    private Long taiId;

    private String taiLoginuser;

    private String taiPassword;

    private String taiName;

    private String taiPhone;

    private String taiCardNumber;

    private Long taiHomeProvId;

    private Long taiHomeCityId;

    private Long taiHomeRegionId;

    private String taiHomeAddresss;

    private String taiBankNumber;

    private String taiBankHolderName;

    private Integer taiStatus;

    private Date taiAddDate;

    public Long getTaiId() {
        return taiId;
    }

    public void setTaiId(Long taiId) {
        this.taiId = taiId;
    }

    public String getTaiLoginuser() {
        return taiLoginuser;
    }

    public void setTaiLoginuser(String taiLoginuser) {
        this.taiLoginuser = taiLoginuser;
    }

    public String getTaiPassword() {
        return taiPassword;
    }

    public void setTaiPassword(String taiPassword) {
        this.taiPassword = taiPassword;
    }

    public String getTaiName() {
        return taiName;
    }

    public void setTaiName(String taiName) {
        this.taiName = taiName;
    }

    public String getTaiPhone() {
        return taiPhone;
    }

    public void setTaiPhone(String taiPhone) {
        this.taiPhone = taiPhone;
    }

    public String getTaiCardNumber() {
        return taiCardNumber;
    }

    public void setTaiCardNumber(String taiCardNumber) {
        this.taiCardNumber = taiCardNumber;
    }

    public Long getTaiHomeProvId() {
        return taiHomeProvId;
    }

    public void setTaiHomeProvId(Long taiHomeProvId) {
        this.taiHomeProvId = taiHomeProvId;
    }

    public Long getTaiHomeCityId() {
        return taiHomeCityId;
    }

    public void setTaiHomeCityId(Long taiHomeCityId) {
        this.taiHomeCityId = taiHomeCityId;
    }

    public Long getTaiHomeRegionId() {
        return taiHomeRegionId;
    }

    public void setTaiHomeRegionId(Long taiHomeRegionId) {
        this.taiHomeRegionId = taiHomeRegionId;
    }

    public String getTaiHomeAddresss() {
        return taiHomeAddresss;
    }

    public void setTaiHomeAddresss(String taiHomeAddresss) {
        this.taiHomeAddresss = taiHomeAddresss;
    }

    public String getTaiBankNumber() {
        return taiBankNumber;
    }

    public void setTaiBankNumber(String taiBankNumber) {
        this.taiBankNumber = taiBankNumber;
    }

    public String getTaiBankHolderName() {
        return taiBankHolderName;
    }

    public void setTaiBankHolderName(String taiBankHolderName) {
        this.taiBankHolderName = taiBankHolderName;
    }

    public Integer getTaiStatus() {
        return taiStatus;
    }

    public void setTaiStatus(Integer taiStatus) {
        this.taiStatus = taiStatus;
    }

    public Date getTaiAddDate() {
        return taiAddDate;
    }

    public void setTaiAddDate(Date taiAddDate) {
        this.taiAddDate = taiAddDate;
    }
}