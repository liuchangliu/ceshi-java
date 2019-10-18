package com.springboot.entity;

import java.util.Date;

public class TbShipperCommonRoutes {
    private Long tscrId;

    private Long tscrShipperId;

    private Long tscrTaskId;

    private Date tscrAddDate;

    private Integer tscrStatus;

    public Long getTscrId() {
        return tscrId;
    }

    public void setTscrId(Long tscrId) {
        this.tscrId = tscrId;
    }

    public Long getTscrShipperId() {
        return tscrShipperId;
    }

    public void setTscrShipperId(Long tscrShipperId) {
        this.tscrShipperId = tscrShipperId;
    }

    public Long getTscrTaskId() {
        return tscrTaskId;
    }

    public void setTscrTaskId(Long tscrTaskId) {
        this.tscrTaskId = tscrTaskId;
    }

    public Date getTscrAddDate() {
        return tscrAddDate;
    }

    public void setTscrAddDate(Date tscrAddDate) {
        this.tscrAddDate = tscrAddDate;
    }

    public Integer getTscrStatus() {
        return tscrStatus;
    }

    public void setTscrStatus(Integer tscrStatus) {
        this.tscrStatus = tscrStatus;
    }
}