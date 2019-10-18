package com.springboot.entity;

import java.util.Date;

public class TbShipperFromAddress {
    private Long tsfaId;

    private Long tsfaShipperId;

    private Long tsfaProvId;

    private Long tsfaCityId;

    private Long tsfaRegionId;

    private String tsfaAddresss;

    private String tsfaLongitude;

    private String tsfaLatitude;

    private String tsfaLabel;

    private Date tsfaAddDate;

    private Integer tsfaStatus;

    private String tsfaContactPerson;

    private String tsfaContactPhone;

    public Long getTsfaId() {
        return tsfaId;
    }

    public void setTsfaId(Long tsfaId) {
        this.tsfaId = tsfaId;
    }

    public Long getTsfaShipperId() {
        return tsfaShipperId;
    }

    public void setTsfaShipperId(Long tsfaShipperId) {
        this.tsfaShipperId = tsfaShipperId;
    }

    public Long getTsfaProvId() {
        return tsfaProvId;
    }

    public void setTsfaProvId(Long tsfaProvId) {
        this.tsfaProvId = tsfaProvId;
    }

    public Long getTsfaCityId() {
        return tsfaCityId;
    }

    public void setTsfaCityId(Long tsfaCityId) {
        this.tsfaCityId = tsfaCityId;
    }

    public Long getTsfaRegionId() {
        return tsfaRegionId;
    }

    public void setTsfaRegionId(Long tsfaRegionId) {
        this.tsfaRegionId = tsfaRegionId;
    }

    public String getTsfaAddresss() {
        return tsfaAddresss;
    }

    public void setTsfaAddresss(String tsfaAddresss) {
        this.tsfaAddresss = tsfaAddresss;
    }

    public String getTsfaLongitude() {
        return tsfaLongitude;
    }

    public void setTsfaLongitude(String tsfaLongitude) {
        this.tsfaLongitude = tsfaLongitude;
    }

    public String getTsfaLatitude() {
        return tsfaLatitude;
    }

    public void setTsfaLatitude(String tsfaLatitude) {
        this.tsfaLatitude = tsfaLatitude;
    }

    public String getTsfaLabel() {
        return tsfaLabel;
    }

    public void setTsfaLabel(String tsfaLabel) {
        this.tsfaLabel = tsfaLabel;
    }

    public Date getTsfaAddDate() {
        return tsfaAddDate;
    }

    public void setTsfaAddDate(Date tsfaAddDate) {
        this.tsfaAddDate = tsfaAddDate;
    }

    public Integer getTsfaStatus() {
        return tsfaStatus;
    }

    public void setTsfaStatus(Integer tsfaStatus) {
        this.tsfaStatus = tsfaStatus;
    }

    public String getTsfaContactPerson() {
        return tsfaContactPerson;
    }

    public void setTsfaContactPerson(String tsfaContactPerson) {
        this.tsfaContactPerson = tsfaContactPerson;
    }

    public String getTsfaContactPhone() {
        return tsfaContactPhone;
    }

    public void setTsfaContactPhone(String tsfaContactPhone) {
        this.tsfaContactPhone = tsfaContactPhone;
    }
}