package com.woniuxy.service;
<<<<<<< HEAD
/**
 * 田普旭123
 */
import java.util.List;

import com.woniuxy.domain.Page;
import com.woniuxy.domain.User;

public interface IUserService {
	List<User> find();
	void delete(Integer id);
	void update(User user);
	void insert(User user);
	
	Page findByPage(int startLine,int size);
=======

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.woniuxy.domain.User;
import com.woniuxy.domain.UserExample;

public interface IUserService {
	List<User> findAll();
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int delete(Integer uid);

    int insert(User record);

    int save(User record);

    List<User> selectByExample(UserExample example);

    User findOne(Integer uid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int update(User record);

    int updateByPrimaryKey(User record);
>>>>>>> branch 'master' of git@github.com:zgx-rookie/woniuticket.git
}
