package com.woniuxy.dao;

import com.woniuxy.domain.Seat;
import com.woniuxy.domain.SeatExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SeatMapper {
    long countByExample(SeatExample example);

    int deleteByExample(SeatExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Seat record);

    int insertSelective(Seat record);

    List<Seat> selectByExample(SeatExample example);

    Seat selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Seat record, @Param("example") SeatExample example);

    int updateByExample(@Param("record") Seat record, @Param("example") SeatExample example);

    int updateByPrimaryKeySelective(Seat record);

    int updateByPrimaryKey(Seat record);
    
    int save(Seat seat);
    
    List<Seat> findByRid(Integer rid);
    
    int delByRid(Integer rid);

}