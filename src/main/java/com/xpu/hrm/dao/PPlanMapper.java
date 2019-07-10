package com.xpu.hrm.dao;


import com.xpu.hrm.bean.PPlan;
import com.xpu.hrm.bean.PPlanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PPlanMapper {
    int countByExample(PPlanExample example);

    int deleteByExample(PPlanExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(PPlan record);

    int insertSelective(PPlan record);

    List<PPlan> selectByExample(PPlanExample example);

    PPlan selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") PPlan record, @Param("example") PPlanExample example);

    int updateByExample(@Param("record") PPlan record, @Param("example") PPlanExample example);

    int updateByPrimaryKeySelective(PPlan record);

    int updateByPrimaryKey(PPlan record);
}