package com.woniuxy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.woniuxy.domain.Cashticket;
import com.woniuxy.service.impl.CashticketService;

@Controller
@RequestMapping("cashtickets")
public class CashticketController {

	@Autowired
	private CashticketService service;
	
	@PutMapping
	@ResponseBody
	public void save(@RequestBody Cashticket cashticket) {
		
		service.save(cashticket);
	}
	
	
	@PostMapping
	@ResponseBody
	public void update(@RequestBody Cashticket cashticket) {
		
		service.update(cashticket);
	}
	
	@DeleteMapping
	@ResponseBody
	public void delete(Integer ctid) {
		service.delete(ctid);
	}
	
	@GetMapping("finOne")
	@ResponseBody
	public void findOne(Integer ctid) {
		Cashticket cashticket = service.findOne(ctid);
		
	}
	
	
	
	@GetMapping
	@ResponseBody
	public void findAll() {
		List<Cashticket> list = service.findAll();
		for (Cashticket cashticket : list) {
			System.out.println(cashticket);
		}
	}
	
}
