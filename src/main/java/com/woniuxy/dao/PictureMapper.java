package com.woniuxy.dao;

<<<<<<< HEAD
import com.woniuxy.domain.Picture;
import com.woniuxy.domain.PictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PictureMapper {
    long countByExample(PictureExample example);

    int deleteByExample(PictureExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Picture record);

    int insertSelective(Picture record);

    List<Picture> selectByExample(PictureExample example);

    Picture selectByPrimaryKey(Integer pid);
=======
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.woniuxy.domain.Picture;
import com.woniuxy.domain.PictureExample;

public interface PictureMapper {
	   
    long countByExample(PictureExample example);

    int deleteByExample(PictureExample example);

    int deleteByPrimaryKey(Integer pcid);

    int insert(Picture record);

    int insertSelective(Picture record);

    List<Picture> selectByExample(PictureExample example);

    Picture selectByPrimaryKey(Integer cid);
>>>>>>> branch 'master' of git@github.com:zgx-rookie/woniuticket.git

    int updateByExampleSelective(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByExample(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}