package com.woniuxy.service;

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
}
