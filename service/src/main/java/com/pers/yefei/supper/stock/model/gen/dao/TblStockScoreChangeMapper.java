package com.pers.yefei.supper.stock.model.gen.dao;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChangeExample;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChangeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblStockScoreChangeMapper {
    long countByExample(TblStockScoreChangeExample example);

    int deleteByExample(TblStockScoreChangeExample example);

    int deleteByPrimaryKey(TblStockScoreChangeKey key);

    int insert(TblStockScoreChange record);

    int insertSelective(TblStockScoreChange record);

    List<TblStockScoreChange> selectByExample(TblStockScoreChangeExample example);

    TblStockScoreChange selectByPrimaryKey(TblStockScoreChangeKey key);

    int updateByExampleSelective(@Param("record") TblStockScoreChange record, @Param("example") TblStockScoreChangeExample example);

    int updateByExample(@Param("record") TblStockScoreChange record, @Param("example") TblStockScoreChangeExample example);

    int updateByPrimaryKeySelective(TblStockScoreChange record);

    int updateByPrimaryKey(TblStockScoreChange record);
}