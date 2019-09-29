package com.woniuxy.service;
/**
 * 田普旭123
 */
import java.util.List;
import java.util.Map;

import com.woniuxy.domain.DaysResult;
import com.woniuxy.domain.Orders;
import com.woniuxy.domain.Page;

public interface IOrdersService {
	Page findByPage(int startLine,int size);
	List<Orders> findByForm(int oid);
	
	//查30天
	List<DaysResult> findByDays();
}
