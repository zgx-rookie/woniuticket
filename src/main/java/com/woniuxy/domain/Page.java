package com.woniuxy.domain;

import java.util.List;

import lombok.Data;

@Data     
public class Page<T> {
	private Integer page;  
	private Integer	row;
	private Integer	allRow;
	private Integer	allPage;
	private Integer	prev;
	private Integer	next;
	private Integer startPage;
	private Integer	endPage;
	private Integer	startLine;
	private String cname;
	private List<T> list;
	
	public Page(Integer page2,Integer row2,Integer allRow2) {
		this.page=page2;
		this.row=row2;
		this.allRow=allRow2;
		
		allPage=(int) Math.ceil(allRow*1.0/row);
		
		//顺序不能颠倒,否则当allPage=0时会出现page=0的情况
		if(page>allPage)page=allPage;
		if(page<1)page=1;
		
		prev=page-1;  
		next=page+1;
		
		if(allPage<10) {
			startPage=1;
			endPage=allPage;
		}else {
			startPage=page-5;
			endPage=page+4;
			if(startPage<1) {
				startPage=1;
				endPage=10;
			};
			if(endPage>allPage) {
				startPage=allPage-9;
				endPage=allPage;
			}
		}
		
	}
	
	
}
