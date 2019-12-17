package com.pers.yefei.supper.stock.model.gen.dao;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockPublicNoticeObserver;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockPublicNoticeObserverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblStockPublicNoticeObserverMapper {
    long countByExample(TblStockPublicNoticeObserverExample example);

    int deleteByExample(TblStockPublicNoticeObserverExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblStockPublicNoticeObserver record);

    int insertSelective(TblStockPublicNoticeObserver record);

    List<TblStockPublicNoticeObserver> selectByExample(TblStockPublicNoticeObserverExample example);

    TblStockPublicNoticeObserver selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblStockPublicNoticeObserver record, @Param("example") TblStockPublicNoticeObserverExample example);

    int updateByExample(@Param("record") TblStockPublicNoticeObserver record, @Param("example") TblStockPublicNoticeObserverExample example);

    int updateByPrimaryKeySelective(TblStockPublicNoticeObserver record);

    int updateByPrimaryKey(TblStockPublicNoticeObserver record);
}