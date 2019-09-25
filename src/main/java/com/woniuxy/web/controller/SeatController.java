package com.woniuxy.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.Seat;
import com.woniuxy.service.ISeatService;
import com.woniuxy.service.impl.SeatServiceImpl;

@Controller
@RequestMapping("seats")
public class SeatController {
	
	@Autowired
	private ISeatService service;
	 
	@PostMapping
	@ResponseBody
	public void save(@RequestBody Map map) {
		System.out.println("rid:" + map.get("rid"));
		List<Map> list = (List<Map>) map.get("xb");
		for (Map map2 : list) {
			Seat seat = new Seat();
			seat.setSrow(map2.get("srow")+"");
			seat.setScolumn(map2.get("scolumn")+"");
			seat.setSstate(map.get("rid"));
			seat.setRid(map.get("rid"));
			System.out.println(seat);
			service.save(seat);
		}
	}
	
		@DeleteMapping
		@ResponseBody
		public void delByRid(Integer rid) {
			service.delByRid(rid);
		}
		
	
		
		
	
			
		@GetMapping
		@ResponseBody
		public Seat findByRid(Integer rid) {
			System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa");
			System.out.println(service.findByRid(rid));
			return null;
			
		}
			
			
		
		
	@PutMapping
	@ResponseBody
	
	public void update(@RequestBody Map map) {
		System.out.println(map);
		//service.update(map);
	}
}
