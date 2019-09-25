package com.woniuxy.service;

import java.util.List;
import java.util.Map;

import com.woniuxy.domain.Seat;

public interface ISeatService {

	 void save(Seat seat);
	 void delete(Integer sid);
	 void find(Integer sid);
	 Seat findByRid(Integer rid);
	 void update(Seat seat);
	void delByRid(Integer rid);
	
	List<Map> select(Integer rid);
	 

}
