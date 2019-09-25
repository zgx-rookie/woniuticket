package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Administrator;


public interface IAdministratorService {
	
	void save(Administrator administrator);
	void update(Administrator administrator);
	void delete(Integer adid);
	Administrator findOne(Integer adid);
	List<Administrator> findAll();		
	
}
