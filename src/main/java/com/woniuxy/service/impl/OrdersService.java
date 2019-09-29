package com.woniuxy.service.impl;
/**
 * 田普旭11
 */
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.OrdersMapper;
import com.woniuxy.domain.DaysResult;
import com.woniuxy.domain.Orders;
import com.woniuxy.domain.Page;
import com.woniuxy.service.IOrdersService;

@Service
@Transactional
public class OrdersService implements IOrdersService{

	
	@Autowired
	private OrdersMapper mapper;

	


	@Override
	public Page findByPage(int startLine, int size) {
		int rowCount = mapper.findCount();
		Page page = new Page(startLine,rowCount,size);
		
		List<Orders> findBySize = mapper.findBySize(page.getStartLine(), page.getSize());
		System.out.println("service()......");
		for (Orders orders : findBySize) {
			System.out.println(orders);
		}
		page.setList(findBySize);
		return page;
	}




	@Override
	public List<Orders> findByForm(int oid) {
		List<Orders> findByForm = mapper.findByForm(oid);
		System.out.println("service()...");
		for (Orders orders : findByForm) {
			System.out.println(orders);
		}
		return findByForm;
	}




	@Override
	public List<DaysResult> findByDays() {
		List<DaysResult> findByDays = mapper.findByDays();
		for (DaysResult daysResult : findByDays) {
			System.out.println(daysResult);
		}
		
		return findByDays;
	}
	
	
}
