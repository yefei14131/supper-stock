package com.pers.yefei.supper.stock.model.gen.dao;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblStockScoreMapper {
    long countByExample(TblStockScoreExample example);

    int deleteByExample(TblStockScoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblStockScore record);

    int insertSelective(TblStockScore record);

    List<TblStockScore> selectByExample(TblStockScoreExample example);

    TblStockScore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblStockScore record, @Param("example") TblStockScoreExample example);

    int updateByExample(@Param("record") TblStockScore record, @Param("example") TblStockScoreExample example);

    int updateByPrimaryKeySelective(TblStockScore record);

    int updateByPrimaryKey(TblStockScore record);
}