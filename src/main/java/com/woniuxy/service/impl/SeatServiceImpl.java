package com.woniuxy.service.impl;

import java.util.List;

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
		mapper.insertSelective(seat);
		
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
	public List<Seat> findAll() {
		return mapper.selectByExample(null);
		
	}

	@Override
	public void update(Seat seat) {
		mapper.updateByPrimaryKeySelective(seat);
	}

}
