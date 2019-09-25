package com.woniuxy.domain;

import java.util.List;

import lombok.Data;

@Data     
public class Page<T> {
	private Integer p;  
	private Integer	rowCount;
	private Integer	maxPage;
	private Integer	prev;
	private Integer	next;
	private Integer	startLine;
	private Integer	size;
	private Integer startPage;
	private Integer	endPage;
	private String  name;
	private List<T> list;
	
	public Page(int pg,int rc,int sz) {
		p = pg;
		size = rc;
		rowCount= sz;
		maxPage = (int) Math.ceil(rowCount*1.0/size);
		
		if(p>maxPage) p=maxPage;
		if(p<1) p=1;
		
		prev = p-1;
		next = p+1;
		
		startLine = (p-1) * size;
		if(maxPage < 10) {
			startPage = 1;
			endPage = maxPage;
		}else {
			startPage = p-5;
			endPage = p+4;
			if(startPage<1) {
				startPage = 1;
				endPage = 10;
			}
			if(endPage>maxPage) {
				startPage = maxPage - 9;
				endPage = maxPage;
			}
		}
	}
	
	
}
