package com.pers.yefei.supper.stock.model.gen.dao;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblStockInfoMapper {
    long countByExample(TblStockInfoExample example);

    int deleteByExample(TblStockInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblStockInfo record);

    int insertSelective(TblStockInfo record);

    List<TblStockInfo> selectByExample(TblStockInfoExample example);

    TblStockInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblStockInfo record, @Param("example") TblStockInfoExample example);

    int updateByExample(@Param("record") TblStockInfo record, @Param("example") TblStockInfoExample example);

    int updateByPrimaryKeySelective(TblStockInfo record);

    int updateByPrimaryKey(TblStockInfo record);
}