package com.woniuxy.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.SeatMapper;
import com.woniuxy.domain.Seat;
import com.woniuxy.service.ISeatService;

@Service
@Transactional
public class SeatServiceImpl implements ISeatService {
 
	@Autowired
	private SeatMapper mapper;

	@Override
	public void save(Seat seat) {
		mapper.insert(seat);
		
	}

	@Override
	public void delete(Integer sid) {

		mapper.deleteByPrimaryKey(sid);
	}

	@Override
	public void find(Integer sid) {

		mapper.selectByPrimaryKey(sid);
	}


	@Override
	public void update(Seat seat) {
		mapper.updateByPrimaryKeySelective(seat);
	}


	@Override
	public void delByRid(Integer rid) {
		mapper.delByRid(rid);
	}

	@Override
	public List<Map> select(Integer rid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seat> findSeats(Integer rid) {
		System.out.println("1111111111111111111111111");
		List<Seat> list=mapper.findByRid(rid);
		for (Seat seat : list) {
//			System.out.println(seat);
		}
		System.out.println(list);
		return list;
	}

	
	
	



}
