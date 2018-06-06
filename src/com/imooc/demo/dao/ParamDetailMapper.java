package com.imooc.demo.dao;

import com.imooc.demo.pojo.ParamDetail;
import com.imooc.demo.pojo.ParamDetailExample;
import com.imooc.demo.pojo.ParamDetailKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParamDetailMapper {
    int countByExample(ParamDetailExample example);

    int deleteByExample(ParamDetailExample example);

    int deleteByPrimaryKey(ParamDetailKey key);

    int insert(ParamDetail record);

    int insertSelective(ParamDetail record);

    List<ParamDetail> selectByExample(ParamDetailExample example);

    ParamDetail selectByPrimaryKey(ParamDetailKey key);

    int updateByExampleSelective(@Param("record") ParamDetail record, @Param("example") ParamDetailExample example);

    int updateByExample(@Param("record") ParamDetail record, @Param("example") ParamDetailExample example);

    int updateByPrimaryKeySelective(ParamDetail record);

    int updateByPrimaryKey(ParamDetail record);
}