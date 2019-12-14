package com.pers.yefei.supper.stock.model.gen.dao;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockPublicNotice;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockPublicNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblStockPublicNoticeMapper {
    long countByExample(TblStockPublicNoticeExample example);

    int deleteByExample(TblStockPublicNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblStockPublicNotice record);

    int insertSelective(TblStockPublicNotice record);

    List<TblStockPublicNotice> selectByExample(TblStockPublicNoticeExample example);

    TblStockPublicNotice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblStockPublicNotice record, @Param("example") TblStockPublicNoticeExample example);

    int updateByExample(@Param("record") TblStockPublicNotice record, @Param("example") TblStockPublicNoticeExample example);

    int updateByPrimaryKeySelective(TblStockPublicNotice record);

    int updateByPrimaryKey(TblStockPublicNotice record);
}