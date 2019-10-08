package com.woniuxy.domain;

import lombok.Data;



       
public class Cinema {
    private Integer cid; 

    private String cname;

    private String clogo;

    private String ccoperight;

    private String caddress;   
   
    private String cfacility;

    private String cpicture;

    private Integer pid;
    
    private Integer startLine;
    
    private Integer row;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getClogo() {
		return clogo;
	}

	public void setClogo(String clogo) {
		this.clogo = clogo;
	}

	public String getCcoperight() {
		return ccoperight;
	}

	public void setCcoperight(String ccoperight) {
		this.ccoperight = ccoperight;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public String getCfacility() {
		return cfacility;
	}

	public void setCfacility(String cfacility) {
		this.cfacility = cfacility;
	}

	public String getCpicture() {
		return cpicture;
	}

	public void setCpicture(String cpicture) {
		this.cpicture = cpicture;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getStartLine() {
		return startLine;
	}

	public void setStartLine(Integer startLine) {
		this.startLine = startLine;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	@Override
	public String toString() {
		return "Cinema [cid=" + cid + ", cname=" + cname + ", clogo=" + clogo + ", ccoperight=" + ccoperight
				+ ", caddress=" + caddress + ", cfacility=" + cfacility + ", cpicture=" + cpicture + ", pid=" + pid
				+ ", startLine=" + startLine + ", row=" + row + "]";
	}

    
   
}