package com.woniuxy.domain;


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
		private List<T> list;
		
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


}
