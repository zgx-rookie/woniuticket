package com.woniuxy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.Seat;
import com.woniuxy.service.ISeatService;

@Controller
@RequestMapping("seats")
public class SeatController {
	
	@Autowired
	private ISeatService service;
	 
	@PostMapping
	@ResponseBody
	public String save(Seat seat) {
		service.save(seat);
		return null;
	}
	

	@DeleteMapping
	@ResponseBody
	public String delete(Integer sid) {
		service.delete(sid);
		return null;
		
	}
	
	
	
//	@GetMapping
//	@ResponseBody
//	public String find(Integer sid) {
//		
//		service.find(3);
//		return "a";
//		
//	}
	
	@GetMapping
	@ResponseBody
	public List<Seat> findAll() {
		
		return service.findAll();
		
	}
	
	
	@PutMapping
	@ResponseBody
	
	public void update(Seat seat) {
		
		service.update(seat);
	}
}
