package com.woniuxy.dao;

import com.woniuxy.domain.Paipian;
import com.woniuxy.domain.PaipianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaipianMapper {
    long countByExample(PaipianExample example);

    int deleteByExample(PaipianExample example);

    int deleteByPrimaryKey(Integer ppid);

    int insert(Paipian record);

    int insertSelective(Paipian record);

    List<Paipian> selectByExample(PaipianExample example);

    Paipian selectByPrimaryKey(Integer ppid);

    int updateByExampleSelective(@Param("record") Paipian record, @Param("example") PaipianExample example);

    int updateByExample(@Param("record") Paipian record, @Param("example") PaipianExample example);

    int updateByPrimaryKeySelective(Paipian record);

    int updateByPrimaryKey(Paipian record);
}