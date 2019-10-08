package com.woniuxy.dao;

import com.woniuxy.domain.Movie;
import com.woniuxy.domain.MovieExample;
import com.woniuxy.domain.Page;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MovieMapper {
    long countByExample(MovieExample example);

    int deleteByExample(MovieExample example);

    int deleteByPrimaryKey(Integer movid);

    int insert(Movie record);

    int insertSelective(Movie record);

    List<Movie> selectByExample(MovieExample example);

    Movie selectByPrimaryKey(Integer movid);

    int updateByExampleSelective(@Param("record") Movie record, @Param("example") MovieExample example);

    int updateByExample(@Param("record") Movie record, @Param("example") MovieExample example);

    int updateByPrimaryKeySelective(Movie record);

    int updateByPrimaryKey(Movie record);
    
    
    List<Movie> selectByLimitQuery(Page<Movie> page);
    
    int selectBySearchName(String name,String mtype);
    
    List<String> selectByType();
    
    
    
}