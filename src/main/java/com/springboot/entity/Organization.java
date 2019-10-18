package com.springboot.entity;

import java.util.Date;

public class Organization {
    private Integer id;

    private String name;

    private String code;

    private String innerphone;

    private String outerphone;

    private String manager;

    private String assistantmanager;

    private String pax;

    private String zipcode;

    private String address;

    private Integer parentid;

    private String remark;

    private Integer sortcode;

    private Integer status;

    private Date addtime;

    private Long adduser;

    private String addusername;

    private Date modiyftime;

    private Long modifyuser;

    private String modifyusername;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInnerphone() {
        return innerphone;
    }

    public void setInnerphone(String innerphone) {
        this.innerphone = innerphone;
    }

    public String getOuterphone() {
        return outerphone;
    }

    public void setOuterphone(String outerphone) {
        this.outerphone = outerphone;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getAssistantmanager() {
        return assistantmanager;
    }

    public void setAssistantmanager(String assistantmanager) {
        this.assistantmanager = assistantmanager;
    }

    public String getPax() {
        return pax;
    }

    public void setPax(String pax) {
        this.pax = pax;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSortcode() {
        return sortcode;
    }

    public void setSortcode(Integer sortcode) {
        this.sortcode = sortcode;
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

    public Long getAdduser() {
        return adduser;
    }

    public void setAdduser(Long adduser) {
        this.adduser = adduser;
    }

    public String getAddusername() {
        return addusername;
    }

    public void setAddusername(String addusername) {
        this.addusername = addusername;
    }

    public Date getModiyftime() {
        return modiyftime;
    }

    public void setModiyftime(Date modiyftime) {
        this.modiyftime = modiyftime;
    }

    public Long getModifyuser() {
        return modifyuser;
    }

    public void setModifyuser(Long modifyuser) {
        this.modifyuser = modifyuser;
    }

    public String getModifyusername() {
        return modifyusername;
    }

    public void setModifyusername(String modifyusername) {
        this.modifyusername = modifyusername;
    }
}