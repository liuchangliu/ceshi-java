package com.springboot.entity;

import java.util.Date;

public class TbInformation {
    private Long tiId;

    private Long tiCataId;

    private String tiTitle;

    private Integer tiViewCount;

    private Date tiAddDate;

    private Integer tiStatus;

    private Long tiPartion;

    private String tiContent;

    public Long getTiId() {
        return tiId;
    }

    public void setTiId(Long tiId) {
        this.tiId = tiId;
    }

    public Long getTiCataId() {
        return tiCataId;
    }

    public void setTiCataId(Long tiCataId) {
        this.tiCataId = tiCataId;
    }

    public String getTiTitle() {
        return tiTitle;
    }

    public void setTiTitle(String tiTitle) {
        this.tiTitle = tiTitle;
    }

    public Integer getTiViewCount() {
        return tiViewCount;
    }

    public void setTiViewCount(Integer tiViewCount) {
        this.tiViewCount = tiViewCount;
    }

    public Date getTiAddDate() {
        return tiAddDate;
    }

    public void setTiAddDate(Date tiAddDate) {
        this.tiAddDate = tiAddDate;
    }

    public Integer getTiStatus() {
        return tiStatus;
    }

    public void setTiStatus(Integer tiStatus) {
        this.tiStatus = tiStatus;
    }

    public Long getTiPartion() {
        return tiPartion;
    }

    public void setTiPartion(Long tiPartion) {
        this.tiPartion = tiPartion;
    }

    public String getTiContent() {
        return tiContent;
    }

    public void setTiContent(String tiContent) {
        this.tiContent = tiContent;
    }
}