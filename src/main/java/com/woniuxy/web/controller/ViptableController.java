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
import com.woniuxy.domain.Viptable;
import com.woniuxy.service.impl.ViptableService;

@Controller
@RequestMapping("viptables")
public class ViptableController {

	@Autowired
	private ViptableService service;
	
	
	@PutMapping
	@ResponseBody
	public void save(@RequestBody Viptable vip) {
		
		service.save(vip);
	}
	
	
	@PostMapping
	@ResponseBody
	public void update(@RequestBody Viptable viptable) {
		
		service.update(viptable);
	}
	
	@DeleteMapping
	@ResponseBody
	public void delete(Integer vid) {
		service.delete(vid);
	}
	
	@GetMapping("finOne")
	@ResponseBody
	public void findOne(Integer vid) {
		Viptable vip = service.findOne(1);
		
	}
	
	
	
	@GetMapping
	@ResponseBody
	public void findAll() {
		List<Viptable> list = service.findAll();
		for (Viptable viptable : list) {
			System.out.println(viptable);
		}
	}
	
	
	
	
	
	
}
