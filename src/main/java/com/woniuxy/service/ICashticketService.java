package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Cashticket;


public interface ICashticketService {
	
	void save(Cashticket cashticket);
	void update(Cashticket cashticket);
	void delete(Integer ctid);
	Cashticket findOne(Integer ctid);
	List<Cashticket> findAll();	
	
}
