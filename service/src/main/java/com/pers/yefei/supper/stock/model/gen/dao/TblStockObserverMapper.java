package com.pers.yefei.supper.stock.model.gen.dao;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockObserver;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockObserverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblStockObserverMapper {
    long countByExample(TblStockObserverExample example);

    int deleteByExample(TblStockObserverExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblStockObserver record);

    int insertSelective(TblStockObserver record);

    List<TblStockObserver> selectByExample(TblStockObserverExample example);

    TblStockObserver selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblStockObserver record, @Param("example") TblStockObserverExample example);

    int updateByExample(@Param("record") TblStockObserver record, @Param("example") TblStockObserverExample example);

    int updateByPrimaryKeySelective(TblStockObserver record);

    int updateByPrimaryKey(TblStockObserver record);
}