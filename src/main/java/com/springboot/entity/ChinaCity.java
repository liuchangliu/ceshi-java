package com.springboot.entity;

public class ChinaCity {
    private Long cid;

    private String cname;

    private String pfl;

    private Integer pid;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPfl() {
        return pfl;
    }

    public void setPfl(String pfl) {
        this.pfl = pfl;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}