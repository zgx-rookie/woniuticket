package com.woniuxy.service.impl;
/**
 * 田普旭11
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.UserMapper;
import com.woniuxy.domain.Page;
import com.woniuxy.domain.User;
import com.woniuxy.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserMapper mapper;
	@Override
	public List<User> find() {
		
		return mapper.selectByExample(null);
	}
	@Override
	public void delete(Integer id) {
		mapper.deleteByPrimaryKey(id);
		
	}
	@Override
	public void update(User user) {
		mapper.updateByPrimaryKey(user);
		
	}
	@Override
	public void insert(User user) {
		mapper.insert(user);
		
	}
	@Override
	public Page findByPage(int startLine,int size) {
		int rowCount = mapper.selectCount();
		
		Page page = new Page(startLine,rowCount,size);
		
		List<User> findBySize = mapper.findBySize(page.getStartLine(),page.getSize());
		for (User user : findBySize) {
			System.out.println(user);
		}
		page.setList(findBySize);
		return page;
	}
	
}
