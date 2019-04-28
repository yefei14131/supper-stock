package com.pers.yefei.supper.stock.model.gen.dao;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface StockMapper {

    @Select("select date from tbl_stock_score where date < #{currentDate} group by date order by date desc limit 1")
    TblStockScore selectPrevDate(@Param("currentDate") Date currentDate);

    @Select("select * from tbl_stock_info where isActive = 1 and stockCode not in (select stockCode from tbl_stock_score where `date` = #{currentDate} )")
    List<TblStockInfo> getStockListNeedConllectScore(@Param("currentDate") Date currentDate);

    @Select("select * from tbl_stock_info where isActive = 0 and updateTime > #{lessDate} ")
    List<TblStockInfo> getNewUnActiveStockList(@Param("lessDate") Date lessDate);

}