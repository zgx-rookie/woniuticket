package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.ViptableMapper;
import com.woniuxy.domain.Viptable;
import com.woniuxy.service.IViptableService;

@Service
@Transactional
public class ViptableService implements IViptableService {

	@Autowired
	private ViptableMapper mapper;
	
	@Override
	public void save(Viptable viptable) {
		mapper.insert(viptable);
	}

	@Override
	public void update(Viptable viptable) {
		mapper.updateByPrimaryKeySelective(viptable);

	}

	@Override
	public void delete(Integer vid) {
		mapper.deleteByPrimaryKey(vid);
	}

	@Override
	public Viptable findOne(Integer vid) {
		Viptable viptable = mapper.selectByPrimaryKey(vid);
		return viptable;
	}

	@Override
	public List<Viptable> findAll() {
		List<Viptable> list = mapper.selectByExample(null);
		return list;
	}

}
