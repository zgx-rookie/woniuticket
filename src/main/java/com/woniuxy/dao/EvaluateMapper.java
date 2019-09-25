package com.woniuxy.dao;

import com.woniuxy.domain.Evaluate;
import com.woniuxy.domain.EvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaluateMapper {
    long countByExample(EvaluateExample example);

    int deleteByExample(EvaluateExample example);

    int deleteByPrimaryKey(Integer eid);

    int insert(Evaluate record);

    int insertSelective(Evaluate record);

    List<Evaluate> selectByExample(EvaluateExample example);

    Evaluate selectByPrimaryKey(Integer eid);

    int updateByExampleSelective(@Param("record") Evaluate record, @Param("example") EvaluateExample example);

    int updateByExample(@Param("record") Evaluate record, @Param("example") EvaluateExample example);

    int updateByPrimaryKeySelective(Evaluate record);

    int updateByPrimaryKey(Evaluate record);
}