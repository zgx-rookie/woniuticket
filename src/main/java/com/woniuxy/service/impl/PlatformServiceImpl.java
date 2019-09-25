package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.dao.PlatformMapper;
import com.woniuxy.domain.Platform;
import com.woniuxy.domain.PlatformExample;
import com.woniuxy.service.IPlatformService;

@Service
public class PlatformServiceImpl implements IPlatformService {

	@Autowired
	PlatformMapper mapper;

	@Override
	public List<Platform> findAll() {
		
		return mapper.findAll();
	}

	@Override
	public long countByExample(PlatformExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(PlatformExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer pid) {
		mapper.deleteByPrimaryKey(pid);
		return 0;
	}

	@Override
	public int insert(Platform record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int save(Platform record) {
		mapper.insertSelective(record);
		return 0;
	}

	@Override
	public List<Platform> selectByExample(PlatformExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Platform findOne(Integer pid) {
		
		return mapper.selectByPrimaryKey(pid);
	}

	@Override
	public int updateByExampleSelective(Platform record, PlatformExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Platform record, PlatformExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Platform record) {
		mapper.updateByPrimaryKeySelective(record);
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Platform record) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
