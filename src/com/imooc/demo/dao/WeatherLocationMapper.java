package com.imooc.demo.dao;

import com.imooc.demo.pojo.WeatherLocation;
import com.imooc.demo.pojo.WeatherLocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeatherLocationMapper {
    int countByExample(WeatherLocationExample example);

    int deleteByExample(WeatherLocationExample example);

    int deleteByPrimaryKey(String id);

    int insert(WeatherLocation record);

    int insertSelective(WeatherLocation record);

    List<WeatherLocation> selectByExample(WeatherLocationExample example);

    WeatherLocation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WeatherLocation record, @Param("example") WeatherLocationExample example);

    int updateByExample(@Param("record") WeatherLocation record, @Param("example") WeatherLocationExample example);

    int updateByPrimaryKeySelective(WeatherLocation record);

    int updateByPrimaryKey(WeatherLocation record);
}