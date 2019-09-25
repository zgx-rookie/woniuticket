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
import com.woniuxy.domain.Administrator;
import com.woniuxy.service.impl.AdministratorService;

@Controller
@RequestMapping("administrator")
public class AdministratorController {

	@Autowired
	private AdministratorService service;
	
	
	@PutMapping
	@ResponseBody
	public void save(@RequestBody Administrator administrator) {
		
		service.save(administrator);
	}
	
	
	@PostMapping
	@ResponseBody
	public void update(@RequestBody Administrator administrator) {
		
		service.update(administrator);
	}
	
	@DeleteMapping
	@ResponseBody
	public void delete(Integer adid) {
		service.delete(adid);
	}
	
	@GetMapping("finOne")
	@ResponseBody
	public void findOne(Integer adid) {
		Administrator administrator = service.findOne(adid);
		
	}
	
	
	
	@GetMapping
	@ResponseBody
	public void findAll() {
		List<Administrator> list = service.findAll();
		for (Administrator administrator : list) {
			System.out.println(administrator);
		}
	}
	
	
}
