package com.woniuxy.service.impl;

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
	public Seat findByRid(Integer rid) {
		// TODO Auto-generated method stub
		return mapper.findByRid(rid);
	}

	@Override
	public List<Map> select(Integer rid) {
		// TODO Auto-generated method stub
		return mapper.findByRid1(rid);
	}
	
	
	


}
