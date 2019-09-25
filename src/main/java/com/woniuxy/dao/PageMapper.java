package com.woniuxy.dao;

import com.woniuxy.domain.Page;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PageMapper {


    int deleteByPrimaryKey(Integer rid);

    int insert(Page record);

    int insertSelective(Page record);


    Page selectByPrimaryKey(Integer rid);


    int updateByPrimaryKeySelective(Page record);

    int updateByPrimaryKey(Page record);
    
    
    int save(Page record);
    
    int findByPage(int startLine, int size);
}