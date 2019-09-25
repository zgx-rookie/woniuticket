package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.CashticketMapper;
import com.woniuxy.domain.Cashticket;
import com.woniuxy.service.ICashticketService;

@Service
@Transactional
public class CashticketService implements ICashticketService {

	@Autowired
	private CashticketMapper mapper;

	@Override
	public void save(Cashticket cashticket) {
		mapper.insert(cashticket);	
	}

	@Override
	public void update(Cashticket cashticket) {
		mapper.updateByPrimaryKey(cashticket);
	}

	@Override
	public void delete(Integer ctid) {
		mapper.deleteByPrimaryKey(ctid);
		
	}

	@Override
	public Cashticket findOne(Integer ctid) {
		Cashticket cashticket = mapper.selectByPrimaryKey(ctid);
		return cashticket;
	}

	@Override
	public List<Cashticket> findAll(){
		List<Cashticket> list = mapper.selectByExample(null);
		return list;
	}
	
	

}
