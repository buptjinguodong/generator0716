package com.imooc.demo.dao;

import com.imooc.demo.pojo.ParamDir;
import com.imooc.demo.pojo.ParamDirExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParamDirMapper {
    int countByExample(ParamDirExample example);

    int deleteByExample(ParamDirExample example);

    int deleteByPrimaryKey(String paramSeq);

    int insert(ParamDir record);

    int insertSelective(ParamDir record);

    List<ParamDir> selectByExample(ParamDirExample example);

    ParamDir selectByPrimaryKey(String paramSeq);

    int updateByExampleSelective(@Param("record") ParamDir record, @Param("example") ParamDirExample example);

    int updateByExample(@Param("record") ParamDir record, @Param("example") ParamDirExample example);

    int updateByPrimaryKeySelective(ParamDir record);

    int updateByPrimaryKey(ParamDir record);
}