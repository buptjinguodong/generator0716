package com.imooc.demo.dao;

import com.imooc.demo.pojo.WeatherDaily;
import com.imooc.demo.pojo.WeatherDailyExample;
import com.imooc.demo.pojo.WeatherDailyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeatherDailyMapper {
    int countByExample(WeatherDailyExample example);

    int deleteByExample(WeatherDailyExample example);

    int deleteByPrimaryKey(WeatherDailyKey key);

    int insert(WeatherDaily record);

    int insertSelective(WeatherDaily record);

    List<WeatherDaily> selectByExample(WeatherDailyExample example);

    WeatherDaily selectByPrimaryKey(WeatherDailyKey key);

    int updateByExampleSelective(@Param("record") WeatherDaily record, @Param("example") WeatherDailyExample example);

    int updateByExample(@Param("record") WeatherDaily record, @Param("example") WeatherDailyExample example);

    int updateByPrimaryKeySelective(WeatherDaily record);

    int updateByPrimaryKey(WeatherDaily record);
}