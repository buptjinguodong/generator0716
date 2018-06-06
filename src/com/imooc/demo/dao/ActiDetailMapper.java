package com.imooc.demo.dao;

import com.imooc.demo.pojo.ActiDetail;
import com.imooc.demo.pojo.ActiDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActiDetailMapper {
    int countByExample(ActiDetailExample example);

    int deleteByExample(ActiDetailExample example);

    int deleteByPrimaryKey(String actiId);

    int insert(ActiDetail record);

    int insertSelective(ActiDetail record);

    List<ActiDetail> selectByExample(ActiDetailExample example);

    ActiDetail selectByPrimaryKey(String actiId);

    int updateByExampleSelective(@Param("record") ActiDetail record, @Param("example") ActiDetailExample example);

    int updateByExample(@Param("record") ActiDetail record, @Param("example") ActiDetailExample example);

    int updateByPrimaryKeySelective(ActiDetail record);

    int updateByPrimaryKey(ActiDetail record);
}