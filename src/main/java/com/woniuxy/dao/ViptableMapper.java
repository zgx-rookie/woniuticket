package com.woniuxy.dao;

import com.woniuxy.domain.Viptable;
import com.woniuxy.domain.ViptableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViptableMapper {
    long countByExample(ViptableExample example);

    int deleteByExample(ViptableExample example);

    int deleteByPrimaryKey(Integer vid);

    int insert(Viptable record);

    int insertSelective(Viptable record);

    List<Viptable> selectByExample(ViptableExample example);

    Viptable selectByPrimaryKey(Integer vid);

    int updateByExampleSelective(@Param("record") Viptable record, @Param("example") ViptableExample example);

    int updateByExample(@Param("record") Viptable record, @Param("example") ViptableExample example);

    int updateByPrimaryKeySelective(Viptable record);

    int updateByPrimaryKey(Viptable record);
}