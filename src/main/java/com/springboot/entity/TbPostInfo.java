package com.springboot.entity;

import java.util.Date;

public class TbPostInfo {
    private Long tpiId;

    private String tpiPostName;

    private Long tpiDepartmentName;

    private String tpiDesc;

    private Date tpiAddDate;

    private Integer tpiStatus;

    public Long getTpiId() {
        return tpiId;
    }

    public void setTpiId(Long tpiId) {
        this.tpiId = tpiId;
    }

    public String getTpiPostName() {
        return tpiPostName;
    }

    public void setTpiPostName(String tpiPostName) {
        this.tpiPostName = tpiPostName;
    }

    public Long getTpiDepartmentName() {
        return tpiDepartmentName;
    }

    public void setTpiDepartmentName(Long tpiDepartmentName) {
        this.tpiDepartmentName = tpiDepartmentName;
    }

    public String getTpiDesc() {
        return tpiDesc;
    }

    public void setTpiDesc(String tpiDesc) {
        this.tpiDesc = tpiDesc;
    }

    public Date getTpiAddDate() {
        return tpiAddDate;
    }

    public void setTpiAddDate(Date tpiAddDate) {
        this.tpiAddDate = tpiAddDate;
    }

    public Integer getTpiStatus() {
        return tpiStatus;
    }

    public void setTpiStatus(Integer tpiStatus) {
        this.tpiStatus = tpiStatus;
    }
}