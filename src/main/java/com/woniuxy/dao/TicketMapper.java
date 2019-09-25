package com.woniuxy.dao;

import com.woniuxy.domain.Ticket;
import com.woniuxy.domain.TicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketMapper {
    long countByExample(TicketExample example);

    int deleteByExample(TicketExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Ticket record);

    int insertSelective(Ticket record);

    List<Ticket> selectByExample(TicketExample example);

    Ticket selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Ticket record, @Param("example") TicketExample example);

    int updateByExample(@Param("record") Ticket record, @Param("example") TicketExample example);

    int updateByPrimaryKeySelective(Ticket record);

    int updateByPrimaryKey(Ticket record);
}