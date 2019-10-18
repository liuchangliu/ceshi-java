package com.springboot.entity;

import java.util.Date;

public class Roles {
    private Integer id;

    private Integer parentid;

    private String name;

    private String restriction;

    private Integer sortcode;

    private String remark;

    private Integer allowedit;

    private Integer allowdelete;

    private Integer status;

    private Date addtime;

    private Long adduserid;

    private String addusername;

    private Date modifytime;

    private Long modifyuserid;

    private String modifyusername;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRestriction() {
        return restriction;
    }

    public void setRestriction(String restriction) {
        this.restriction = restriction;
    }

    public Integer getSortcode() {
        return sortcode;
    }

    public void setSortcode(Integer sortcode) {
        this.sortcode = sortcode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getAllowedit() {
        return allowedit;
    }

    public void setAllowedit(Integer allowedit) {
        this.allowedit = allowedit;
    }

    public Integer getAllowdelete() {
        return allowdelete;
    }

    public void setAllowdelete(Integer allowdelete) {
        this.allowdelete = allowdelete;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Long getAdduserid() {
        return adduserid;
    }

    public void setAdduserid(Long adduserid) {
        this.adduserid = adduserid;
    }

    public String getAddusername() {
        return addusername;
    }

    public void setAddusername(String addusername) {
        this.addusername = addusername;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Long getModifyuserid() {
        return modifyuserid;
    }

    public void setModifyuserid(Long modifyuserid) {
        this.modifyuserid = modifyuserid;
    }

    public String getModifyusername() {
        return modifyusername;
    }

    public void setModifyusername(String modifyusername) {
        this.modifyusername = modifyusername;
    }
}