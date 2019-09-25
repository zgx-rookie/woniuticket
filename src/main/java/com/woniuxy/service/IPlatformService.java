package com.woniuxy.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.woniuxy.domain.Platform;
import com.woniuxy.domain.PlatformExample;

public interface IPlatformService {
	List<Platform> findAll();
	
    long countByExample(PlatformExample example);

    int deleteByExample(PlatformExample example);

    int delete(Integer pid);

    int insert(Platform record);

    int save(Platform record);

    List<Platform> selectByExample(PlatformExample example);

    Platform findOne(Integer pid);

    int updateByExampleSelective(@Param("record") Platform record, @Param("example") PlatformExample example);

    int updateByExample(@Param("record") Platform record, @Param("example") PlatformExample example);

    int update(Platform record);

    int updateByPrimaryKey(Platform record);
}
