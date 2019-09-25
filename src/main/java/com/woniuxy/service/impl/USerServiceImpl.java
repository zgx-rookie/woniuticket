package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.dao.UserMapper;
import com.woniuxy.domain.User;
import com.woniuxy.domain.UserExample;
import com.woniuxy.service.IUserService;

@Service
public class USerServiceImpl implements IUserService {

	@Autowired
	UserMapper mapper;
	@Override
	public List<User> findAll() {
		
		return mapper.findAll();
	}

	@Override
	public long countByExample(UserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(UserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer uid) {
		mapper.deleteByPrimaryKey(uid);
		return 0;
	}

	@Override
	public int insert(User record) {
		
		return 0;
	}

	@Override
	public int save(User record) {
		mapper.insertSelective(record);
		return 0;
	}

	@Override
	public List<User> selectByExample(UserExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findOne(Integer uid) {
		
		return mapper.selectByPrimaryKey(uid);
	}

	@Override
	public int updateByExampleSelective(User record, UserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(User record, UserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User record) {
		mapper.updateByPrimaryKeySelective(record);
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		return 0;
	}

}
