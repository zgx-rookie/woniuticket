package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.User;
import com.woniuxy.domain.Viptable;

public interface IViptableService {
	
	void save(Viptable viptable);
	void update(Viptable viptable);
	void delete(Integer vid);
	Viptable findOne(Integer vid);
	List<Viptable> findAll();
	
	
}
