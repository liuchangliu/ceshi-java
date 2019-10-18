package com.springboot.entity;

import java.util.Date;

public class TbVcode {
    private Long tvId;

    private String tvPhone;

    private String tvCode;

    private Date tvAddDate;

    private Integer tvType;

    public Long getTvId() {
        return tvId;
    }

    public void setTvId(Long tvId) {
        this.tvId = tvId;
    }

    public String getTvPhone() {
        return tvPhone;
    }

    public void setTvPhone(String tvPhone) {
        this.tvPhone = tvPhone;
    }

    public String getTvCode() {
        return tvCode;
    }

    public void setTvCode(String tvCode) {
        this.tvCode = tvCode;
    }

    public Date getTvAddDate() {
        return tvAddDate;
    }

    public void setTvAddDate(Date tvAddDate) {
        this.tvAddDate = tvAddDate;
    }

    public Integer getTvType() {
        return tvType;
    }

    public void setTvType(Integer tvType) {
        this.tvType = tvType;
    }
}