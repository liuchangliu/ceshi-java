package com.springboot.entity;

import java.util.Date;

public class TbTaskLocationHistory {
    private Long ttlhId;

    private Long ttlhOrderId;

    private Long ttlhDriverId;

    private String ttlhLongtude;

    private String ttlhLatitude;

    private Date ttlhAddDate;

    public Long getTtlhId() {
        return ttlhId;
    }

    public void setTtlhId(Long ttlhId) {
        this.ttlhId = ttlhId;
    }

    public Long getTtlhOrderId() {
        return ttlhOrderId;
    }

    public void setTtlhOrderId(Long ttlhOrderId) {
        this.ttlhOrderId = ttlhOrderId;
    }

    public Long getTtlhDriverId() {
        return ttlhDriverId;
    }

    public void setTtlhDriverId(Long ttlhDriverId) {
        this.ttlhDriverId = ttlhDriverId;
    }

    public String getTtlhLongtude() {
        return ttlhLongtude;
    }

    public void setTtlhLongtude(String ttlhLongtude) {
        this.ttlhLongtude = ttlhLongtude;
    }

    public String getTtlhLatitude() {
        return ttlhLatitude;
    }

    public void setTtlhLatitude(String ttlhLatitude) {
        this.ttlhLatitude = ttlhLatitude;
    }

    public Date getTtlhAddDate() {
        return ttlhAddDate;
    }

    public void setTtlhAddDate(Date ttlhAddDate) {
        this.ttlhAddDate = ttlhAddDate;
    }
}