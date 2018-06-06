package com.imooc.demo.dao;

import com.imooc.demo.pojo.ActiAplyDetail;
import com.imooc.demo.pojo.ActiAplyDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActiAplyDetailMapper {
    int countByExample(ActiAplyDetailExample example);

    int deleteByExample(ActiAplyDetailExample example);

    int deleteByPrimaryKey(String aplyId);

    int insert(ActiAplyDetail record);

    int insertSelective(ActiAplyDetail record);

    List<ActiAplyDetail> selectByExample(ActiAplyDetailExample example);

    ActiAplyDetail selectByPrimaryKey(String aplyId);

    int updateByExampleSelective(@Param("record") ActiAplyDetail record, @Param("example") ActiAplyDetailExample example);

    int updateByExample(@Param("record") ActiAplyDetail record, @Param("example") ActiAplyDetailExample example);

    int updateByPrimaryKeySelective(ActiAplyDetail record);

    int updateByPrimaryKey(ActiAplyDetail record);
}