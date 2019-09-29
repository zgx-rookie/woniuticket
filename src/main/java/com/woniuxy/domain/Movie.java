package com.woniuxy.domain;

import java.util.Date;

public class Movie {
    private Integer movid;

    private String minfo;

    private String mrole;

    private String mdirector;

    private String mduration;

    private Date mshowtime;

    private String mprevue;

    private String mposter;

    private Double mprice;

    private String mname;

    private String mcover;

    private String mtype;

    public Integer getMovid() {
        return movid;
    }

    public void setMovid(Integer movid) {
        this.movid = movid;
    }

    public String getMinfo() {
        return minfo;
    }

    public void setMinfo(String minfo) {
        this.minfo = minfo;
    }

    public String getMrole() {
        return mrole;
    }

    public void setMrole(String mrole) {
        this.mrole = mrole;
    }

    public String getMdirector() {
        return mdirector;
    }

    public void setMdirector(String mdirector) {
        this.mdirector = mdirector;
    }

    public String getMduration() {
        return mduration;
    }

    public void setMduration(String mduration) {
        this.mduration = mduration;
    }

    public Date getMshowtime() {
        return mshowtime;
    }

    public void setMshowtime(Date mshowtime) {
        this.mshowtime = mshowtime;
    }

    public String getMprevue() {
        return mprevue;
    }

    public void setMprevue(String mprevue) {
        this.mprevue = mprevue;
    }

    public String getMposter() {
        return mposter;
    }

    public void setMposter(String mposter) {
        this.mposter = mposter;
    }

    public Double getMprice() {
        return mprice;
    }

    public void setMprice(Double mprice) {
        this.mprice = mprice;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMcover() {
        return mcover;
    }

    public void setMcover(String mcover) {
        this.mcover = mcover;
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }
}