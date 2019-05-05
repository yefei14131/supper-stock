package com.pers.yefei.supper.stock.model.gen.dao;

import com.pers.yefei.supper.stock.model.gen.pojo.TblHolidays;
import com.pers.yefei.supper.stock.model.gen.pojo.TblHolidaysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblHolidaysMapper {
    long countByExample(TblHolidaysExample example);

    int deleteByExample(TblHolidaysExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblHolidays record);

    int insertSelective(TblHolidays record);

    List<TblHolidays> selectByExample(TblHolidaysExample example);

    TblHolidays selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblHolidays record, @Param("example") TblHolidaysExample example);

    int updateByExample(@Param("record") TblHolidays record, @Param("example") TblHolidaysExample example);

    int updateByPrimaryKeySelective(TblHolidays record);

    int updateByPrimaryKey(TblHolidays record);
}