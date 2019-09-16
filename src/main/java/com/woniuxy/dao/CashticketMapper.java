package com.woniuxy.dao;

import com.woniuxy.domain.Cashticket;
import com.woniuxy.domain.CashticketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CashticketMapper {
    long countByExample(CashticketExample example);

    int deleteByExample(CashticketExample example);

    int deleteByPrimaryKey(Integer ctid);

    int insert(Cashticket record);

    int insertSelective(Cashticket record);

    List<Cashticket> selectByExample(CashticketExample example);

    Cashticket selectByPrimaryKey(Integer ctid);

    int updateByExampleSelective(@Param("record") Cashticket record, @Param("example") CashticketExample example);

    int updateByExample(@Param("record") Cashticket record, @Param("example") CashticketExample example);

    int updateByPrimaryKeySelective(Cashticket record);

    int updateByPrimaryKey(Cashticket record);
}