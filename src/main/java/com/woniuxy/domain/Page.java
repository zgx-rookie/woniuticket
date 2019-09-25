package com.woniuxy.domain;
<<<<<<< HEAD

//田普旭
import java.util.List;

import lombok.Data;
@Data
public class Page<T> {
	//当前页
		private int p;
		//总行数
		private int rowCount;
		//总页数
		private int maxPage;
		//上一页
		private int prev;
		//下一页
		private int next;
		//起始行
		private int startLine;
		//每页显示行数
		private int size;
		//起始页
		private int startPage;
		//结束页
		private int endPage;
		private List<User> list;
		public int getP() {
			return p;
		}
		public void setP(int p) {
			this.p = p;
		}
		public int getRowCount() {
			return rowCount;
		}
		public void setRowCount(int rowCount) {
			this.rowCount = rowCount;
		}
		public int getMaxPage() {
			return maxPage;
		}
		public void setMaxPage(int maxPage) {
			this.maxPage = maxPage;
		}
		public int getPrev() {
			return prev;
		}
		public void setPrev(int prev) {
			this.prev = prev;
		}
		public int getNext() {
			return next;
		}
		public void setNext(int next) {
			this.next = next;
		}
		public int getStartLine() {
			return startLine;
		}
		public void setStartLine(int startLine) {
			this.startLine = startLine;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public int getStartPage() {
			return startPage;
		}
		public void setStartPage(int startPage) {
			this.startPage = startPage;
		}
		public int getEndPage() {
			return endPage;
		}
		public void setEndPage(int endPage) {
			this.endPage = endPage;
		}
		
		

		public List<User> getList() {
			return list;
		}
		public void setList(List<User> list) {
			this.list = list;
		}
		public Page(int pg,int rc,int sz) {
			p = pg;
			rowCount = rc;
			size = sz;
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

=======

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
	
	
>>>>>>> branch 'master' of git@github.com:zgx-rookie/woniuticket.git
}
