package com.woniuxy.dao;
    
import com.woniuxy.domain.Administrator;
import com.woniuxy.domain.AdministratorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
     
public interface AdministratorMapper {
	//fsfsf  asdasdasd    
    long countByExample(AdministratorExample example);

    int deleteByExample(AdministratorExample example);

    int deleteByPrimaryKey(Integer adid);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    List<Administrator> selectByExample(AdministratorExample example);

    Administrator selectByPrimaryKey(Integer adid);

    int updateByExampleSelective(@Param("record") Administrator record, @Param("example") AdministratorExample example);

    int updateByExample(@Param("record") Administrator record, @Param("example") AdministratorExample example);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);
}