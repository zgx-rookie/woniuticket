package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.AdministratorMapper;
import com.woniuxy.domain.Administrator;
import com.woniuxy.service.IAdministratorService;

@Service
@Transactional
public class AdministratorService implements IAdministratorService {

	@Autowired
	private AdministratorMapper mapper;
	
	@Override
	public void save(Administrator administrator) {
		mapper.insert(administrator);
	}

	@Override
	public void update(Administrator administrator) {
		mapper.updateByPrimaryKeySelective(administrator);

	}

	@Override
	public void delete(Integer adid) {
		mapper.deleteByPrimaryKey(adid);
	}

	@Override
	public Administrator findOne(Integer adid) {
		Administrator administrator = mapper.selectByPrimaryKey(adid);
		return administrator;
	}

	@Override
	public List<Administrator> findAll() {
		List<Administrator> list = mapper.selectByExample(null);
		return list;
	}

}
