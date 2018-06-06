package com.imooc.demo.dao;

import com.imooc.demo.pojo.ActiInfo;
import com.imooc.demo.pojo.ActiInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActiInfoMapper {
    int countByExample(ActiInfoExample example);

    int deleteByExample(ActiInfoExample example);

    int deleteByPrimaryKey(String actiId);

    int insert(ActiInfo record);

    int insertSelective(ActiInfo record);

    List<ActiInfo> selectByExample(ActiInfoExample example);

    ActiInfo selectByPrimaryKey(String actiId);

    int updateByExampleSelective(@Param("record") ActiInfo record, @Param("example") ActiInfoExample example);

    int updateByExample(@Param("record") ActiInfo record, @Param("example") ActiInfoExample example);

    int updateByPrimaryKeySelective(ActiInfo record);

    int updateByPrimaryKey(ActiInfo record);
}