package com.woniuxy.domain;
//田普旭
import lombok.Data;


public class DaysResult {

	private Integer movieCountDays;
	
	private String minfo;
	
	private Integer movieCount;
	
	private String minfo2;

	public Integer getMovieCountDays() {
		return movieCountDays;
	}

	public void setMovieCountDays(Integer movieCountDays) {
		this.movieCountDays = movieCountDays;
	}

	public String getMinfo() {
		return minfo;
	}

	public void setMinfo(String minfo) {
		this.minfo = minfo;
	}

	public Integer getMovieCount() {
		return movieCount;
	}

	public void setMovieCount(Integer movieCount) {
		this.movieCount = movieCount;
	}

	public String getMinfo2() {
		return minfo2;
	}

	public void setMinfo2(String minfo2) {
		this.minfo2 = minfo2;
	}

	@Override
	public String toString() {
		return "DaysResult [movieCountDays=" + movieCountDays + ", minfo=" + minfo + ", movieCount=" + movieCount
				+ ", minfo2=" + minfo2 + "]";
	}
	
	
	
}
