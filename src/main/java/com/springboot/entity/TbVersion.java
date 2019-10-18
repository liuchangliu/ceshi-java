package com.springboot.entity;

import java.util.Date;

public class TbVersion {
    private Long tvId;

    private String tvVersion;

    private String tvName;

    private String tvDesp;

    private String tvUrl;

    private Integer tvType;

    private Integer tvStatus;

    private Date tvAddDate;

    private Integer tvIfUpdate;

    public Long getTvId() {
        return tvId;
    }

    public void setTvId(Long tvId) {
        this.tvId = tvId;
    }

    public String getTvVersion() {
        return tvVersion;
    }

    public void setTvVersion(String tvVersion) {
        this.tvVersion = tvVersion;
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public String getTvDesp() {
        return tvDesp;
    }

    public void setTvDesp(String tvDesp) {
        this.tvDesp = tvDesp;
    }

    public String getTvUrl() {
        return tvUrl;
    }

    public void setTvUrl(String tvUrl) {
        this.tvUrl = tvUrl;
    }

    public Integer getTvType() {
        return tvType;
    }

    public void setTvType(Integer tvType) {
        this.tvType = tvType;
    }

    public Integer getTvStatus() {
        return tvStatus;
    }

    public void setTvStatus(Integer tvStatus) {
        this.tvStatus = tvStatus;
    }

    public Date getTvAddDate() {
        return tvAddDate;
    }

    public void setTvAddDate(Date tvAddDate) {
        this.tvAddDate = tvAddDate;
    }

    public Integer getTvIfUpdate() {
        return tvIfUpdate;
    }

    public void setTvIfUpdate(Integer tvIfUpdate) {
        this.tvIfUpdate = tvIfUpdate;
    }
}