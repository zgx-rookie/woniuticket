package com.woniuxy.web.controller;

import java.util.ArrayList;
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
		System.out.println("====================");
		
		System.out.println(map);
		
		service.delByRid((Integer)map.get("rid"));
		
//		service.delByRid((Integer)map.get("rid"));
		System.out.println(map.get("rid"));
		List<Map> list = (List<Map>) map.get("xb");
		for (Map map2 : list) {
			Seat seat = new Seat();
			seat.setSrow(map2.get("srow")+"");
			seat.setScolumn(map2.get("scolumn")+"");
			seat.setSstate(map.get("sstate"));
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
	
	/*
	 * @GetMapping
	 * 
	 * @ResponseBody public String findSeats(Integer rid) {
	 * System.out.println("@@@@@@@@@@@@@@@@@@@@@"); System.out.println(rid);
	 * 
	 * List<Seat> seats = service.findSeats(rid);
	 * 
	 * System.out.println("controller++++++++++++++++++++++++++++++++++"+seats);
	 * 
	 * System.out.println(seats.size());
	 * 
	 * 
	 * if(seats.size()!=0) {
	 * 
	 * StringBuilder oldJson = new StringBuilder();
	 * 
	 * oldJson.append("["); for (Seat seat : seats) {
	 * oldJson.append("{\"index\":["+seat.getSrow()+","+seat.getScolumn()+"]},");
	 * 
	 * }
	 * 
	 * StringBuilder newJson = new StringBuilder( oldJson.substring(0,
	 * oldJson.length()-1));
	 * 
	 * newJson.append("]"); System.out.println(newJson);
	 * 
	 * return newJson.toString(); }else { return "[]"; }
	 * 
	 * }
	 */
		
		
		@GetMapping
		@ResponseBody   
		public String findSeats(Integer rid) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@" + rid);
			List<Seat> seats = service.findSeats(rid);
			
			System.out.println("controller++++++++++++++++++++++++++++++++++");
			System.out.println(seats);
			for (Seat seat : seats) {
				System.out.println(seat);
			}
			StringBuilder oldJson = new StringBuilder();
			oldJson.append("[");
			for (Seat seat : seats) {
				oldJson.append("{\"index\":["+seat.getSrow()+","+seat.getScolumn()+"]},");
			}
			
			StringBuilder newJson = new StringBuilder( oldJson.substring(0, oldJson.length()-1));
			
			newJson.append("]");
			System.out.println(newJson);
			
			return newJson.toString();
			
		}
		 
		
			
	@PutMapping
	@ResponseBody
	
	public void update(@RequestBody Map map) {
		System.out.println(map);
		//service.update(map);
	}
}
