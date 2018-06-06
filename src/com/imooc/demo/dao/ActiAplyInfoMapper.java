package com.imooc.demo.dao;

import com.imooc.demo.pojo.ActiAplyInfo;
import com.imooc.demo.pojo.ActiAplyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActiAplyInfoMapper {
    int countByExample(ActiAplyInfoExample example);

    int deleteByExample(ActiAplyInfoExample example);

    int deleteByPrimaryKey(String aplyId);

    int insert(ActiAplyInfo record);

    int insertSelective(ActiAplyInfo record);

    List<ActiAplyInfo> selectByExample(ActiAplyInfoExample example);

    ActiAplyInfo selectByPrimaryKey(String aplyId);

    int updateByExampleSelective(@Param("record") ActiAplyInfo record, @Param("example") ActiAplyInfoExample example);

    int updateByExample(@Param("record") ActiAplyInfo record, @Param("example") ActiAplyInfoExample example);

    int updateByPrimaryKeySelective(ActiAplyInfo record);

    int updateByPrimaryKey(ActiAplyInfo record);
}