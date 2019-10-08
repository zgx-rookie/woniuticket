package com.woniuxy.service.impl;
/**
 * 田普旭11
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.UserMapper;
import com.woniuxy.dao.UsersMapper;
import com.woniuxy.domain.Page;
import com.woniuxy.domain.User;
import com.woniuxy.domain.Users;
import com.woniuxy.service.IUsersService;

@Service
@Transactional
public class UsersServiceImpl implements IUsersService{

	@Autowired
	private UsersMapper mapper;

	@Override
	public List<Users> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Users user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Users user) {
		mapper.insertSelective(user);
	}
	
	
}
