package com.woniuxy.web.controller;
/**
 * 田普旭
 */
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
public Orders findByForm(Integer oid){
	Orders or = new Orders();
	List<Orders> findByForm = service.findByForm(oid);
	for (Orders orders : findByForm) {
		or=orders;
	}
	return or;
}
@GetMapping("days")
@ResponseBody
public List<DaysResult> findByDays(){
	List<DaysResult> findByDays = service.findByDays();
	return findByDays;
}

}
