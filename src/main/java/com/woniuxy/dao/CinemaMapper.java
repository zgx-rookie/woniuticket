package com.woniuxy.dao;

import com.woniuxy.domain.Cinema;
import com.woniuxy.domain.CinemaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CinemaMapper {

	
	List<Cinema> findByPage(Cinema cinema);
	Integer getRow(Cinema cinema);
	

    long countByExample(CinemaExample example);

    int deleteByExample(CinemaExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Cinema record);

    int insertSelective(Cinema record);

    List<Cinema> selectByExample(CinemaExample example);

    Cinema selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Cinema record, @Param("example") CinemaExample example);

    int updateByExample(@Param("record") Cinema record, @Param("example") CinemaExample example);

    int updateByPrimaryKeySelective(Cinema record);

    int updateByPrimaryKey(Cinema record);
}