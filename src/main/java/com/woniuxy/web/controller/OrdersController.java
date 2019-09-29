package com.woniuxy.web.controller;

/**
 * 田普旭123
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.DaysResult;
import com.woniuxy.domain.Orders;
import com.woniuxy.domain.Page;
import com.woniuxy.service.IOrdersService;

@Controller
@RequestMapping("/orders")
public class OrdersController {
	@Autowired
	private IOrdersService service;
	@Autowired
	private WebSocketServer ws;

	@GetMapping
	@ResponseBody
	public Page findByPage(Integer p) {
		System.out.println("****************");
		System.out.println(p);
		Page findByPage = service.findByPage(p, 6);

		return findByPage;
	}

	@GetMapping("form")
	@ResponseBody
	public Orders findByForm(Integer oid) {
		Orders or = new Orders();
		List<Orders> findByForm = service.findByForm(oid);
		for (Orders orders : findByForm) {
			or = orders;
		}
		return or;
	}

	@GetMapping("days")
	@ResponseBody
	public StringBuilder[] findByDays() {
		System.out.println("findByDays");
		List<DaysResult> findByDays = service.findByDays();
		StringBuilder movieName = new StringBuilder();

		StringBuilder data = new StringBuilder();
		data.append("[{");

		data.append("\"name\":\"今日购票人次\",\"data\":[");
		for (DaysResult daysResult : findByDays) {
			data.append(daysResult.getMovieCount() + ",");
		}
		StringBuilder newData = new StringBuilder(data.substring(0, data.length() - 1));

		newData.append("]},{\"name\":\"近30天购票人次\",\"data\":[");
		
		for (DaysResult daysResult : findByDays) {
			newData.append(daysResult.getMovieCountDays() + ",");
		}

		StringBuilder newsData = new StringBuilder(newData.substring(0, newData.length() - 1));
		newsData.append("]}]");
		System.out.println(newsData);

		StringBuilder[] arr = new StringBuilder[5];

		arr[0] = newsData;
		
		

		return arr;
	}

}
