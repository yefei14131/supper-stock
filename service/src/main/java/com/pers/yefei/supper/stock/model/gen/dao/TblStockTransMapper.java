package com.pers.yefei.supper.stock.model.gen.dao;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockTrans;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockTransExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblStockTransMapper {
    long countByExample(TblStockTransExample example);

    int deleteByExample(TblStockTransExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblStockTrans record);

    int insertSelective(TblStockTrans record);

    List<TblStockTrans> selectByExample(TblStockTransExample example);

    TblStockTrans selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblStockTrans record, @Param("example") TblStockTransExample example);

    int updateByExample(@Param("record") TblStockTrans record, @Param("example") TblStockTransExample example);

    int updateByPrimaryKeySelective(TblStockTrans record);

    int updateByPrimaryKey(TblStockTrans record);
}