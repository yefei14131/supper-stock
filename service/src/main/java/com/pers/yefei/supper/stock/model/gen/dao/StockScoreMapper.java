package com.pers.yefei.supper.stock.model.gen.dao;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;

public interface StockScoreMapper {

    @Select("select date from tbl_stock_score where date < #{currentDate} group by date order by date desc limit 1")
    TblStockScore selectPrevDate(@Param("currentDate") Date currentDate);

}