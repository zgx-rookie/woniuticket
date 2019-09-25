package com.woniuxy.dao;
/**
 * 田普旭123
 */
import com.woniuxy.domain.DaysResult;
import com.woniuxy.domain.Orders;
import com.woniuxy.domain.OrdersExample;
import com.woniuxy.domain.User;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
	
	int OrdersSearch();
	
	List<Orders> searchAll();
	
    long countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
    
    List<Orders> findBySize(@Param("startLine") Integer startLine,@Param("size") Integer size);
    
    int findCount();
    
    List<Orders> findByForm(@Param("oid") Integer oid);
    
    List<DaysResult> findByDays();
}