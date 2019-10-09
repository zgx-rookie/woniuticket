package com.woniuxy.domain;

import lombok.Data;


public class Groups {
    private Integer gid;

    private String gname;

    private String ginfo;

    private Integer pid;

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getGinfo() {
		return ginfo;
	}

	public void setGinfo(String ginfo) {
		this.ginfo = ginfo;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "Groups [gid=" + gid + ", gname=" + gname + ", ginfo=" + ginfo + ", pid=" + pid + "]";
	}

    
    
    
}