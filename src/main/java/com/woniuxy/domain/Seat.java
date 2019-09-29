package com.woniuxy.domain;

import java.io.Serializable;
import java.util.List;

import lombok.Data;


public class Seat implements Serializable{
    private Integer sid;

    private Object rid;

    private Object sstate;

    private String srow;

    private String scolumn;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Object getRid() {
		return rid;
	}

	public void setRid(Object rid) {
		this.rid = rid;
	}

	public Object getSstate() {
		return sstate;
	}

	public void setSstate(Object sstate) {
		this.sstate = sstate;
	}

	public String getSrow() {
		return srow;
	}

	public void setSrow(String srow) {
		this.srow = srow;
	}

	public String getScolumn() {
		return scolumn;
	}

	public void setScolumn(String scolumn) {
		this.scolumn = scolumn;
	}

	@Override
	public String toString() {
		return "Seat [sid=" + sid + ", rid=" + rid + ", sstate=" + sstate + ", srow=" + srow + ", scolumn=" + scolumn
				+ "]";
	}
    
    
    
    
}