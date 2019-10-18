package com.springboot.entity;

import java.util.Date;

public class TbShipperToAddress {
    private Long tstaId;

    private Long tstaShipper;

    private Long tstaProvId;

    private Long tstaCityId;

    private Long tstaRegionId;

    private String tstaAddresss;

    private String tstaDisburdenLabel;

    private String tstaLongitude;

    private String tstaLatitude;

    private Date tstaAddDate;

    private Integer tstaState;

    private String tsaContactPerson;

    private String tstaContactPhone;

    private String tsfaCompanyName;

    public Long getTstaId() {
        return tstaId;
    }

    public void setTstaId(Long tstaId) {
        this.tstaId = tstaId;
    }

    public Long getTstaShipper() {
        return tstaShipper;
    }

    public void setTstaShipper(Long tstaShipper) {
        this.tstaShipper = tstaShipper;
    }

    public Long getTstaProvId() {
        return tstaProvId;
    }

    public void setTstaProvId(Long tstaProvId) {
        this.tstaProvId = tstaProvId;
    }

    public Long getTstaCityId() {
        return tstaCityId;
    }

    public void setTstaCityId(Long tstaCityId) {
        this.tstaCityId = tstaCityId;
    }

    public Long getTstaRegionId() {
        return tstaRegionId;
    }

    public void setTstaRegionId(Long tstaRegionId) {
        this.tstaRegionId = tstaRegionId;
    }

    public String getTstaAddresss() {
        return tstaAddresss;
    }

    public void setTstaAddresss(String tstaAddresss) {
        this.tstaAddresss = tstaAddresss;
    }

    public String getTstaDisburdenLabel() {
        return tstaDisburdenLabel;
    }

    public void setTstaDisburdenLabel(String tstaDisburdenLabel) {
        this.tstaDisburdenLabel = tstaDisburdenLabel;
    }

    public String getTstaLongitude() {
        return tstaLongitude;
    }

    public void setTstaLongitude(String tstaLongitude) {
        this.tstaLongitude = tstaLongitude;
    }

    public String getTstaLatitude() {
        return tstaLatitude;
    }

    public void setTstaLatitude(String tstaLatitude) {
        this.tstaLatitude = tstaLatitude;
    }

    public Date getTstaAddDate() {
        return tstaAddDate;
    }

    public void setTstaAddDate(Date tstaAddDate) {
        this.tstaAddDate = tstaAddDate;
    }

    public Integer getTstaState() {
        return tstaState;
    }

    public void setTstaState(Integer tstaState) {
        this.tstaState = tstaState;
    }

    public String getTsaContactPerson() {
        return tsaContactPerson;
    }

    public void setTsaContactPerson(String tsaContactPerson) {
        this.tsaContactPerson = tsaContactPerson;
    }

    public String getTstaContactPhone() {
        return tstaContactPhone;
    }

    public void setTstaContactPhone(String tstaContactPhone) {
        this.tstaContactPhone = tstaContactPhone;
    }

    public String getTsfaCompanyName() {
        return tsfaCompanyName;
    }

    public void setTsfaCompanyName(String tsfaCompanyName) {
        this.tsfaCompanyName = tsfaCompanyName;
    }
}