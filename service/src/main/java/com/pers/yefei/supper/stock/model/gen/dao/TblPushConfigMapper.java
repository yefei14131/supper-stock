package com.pers.yefei.supper.stock.model.gen.dao;

import com.pers.yefei.supper.stock.model.gen.pojo.TblPushConfig;
import com.pers.yefei.supper.stock.model.gen.pojo.TblPushConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblPushConfigMapper {
    long countByExample(TblPushConfigExample example);

    int deleteByExample(TblPushConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblPushConfig record);

    int insertSelective(TblPushConfig record);

    List<TblPushConfig> selectByExample(TblPushConfigExample example);

    TblPushConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblPushConfig record, @Param("example") TblPushConfigExample example);

    int updateByExample(@Param("record") TblPushConfig record, @Param("example") TblPushConfigExample example);

    int updateByPrimaryKeySelective(TblPushConfig record);

    int updateByPrimaryKey(TblPushConfig record);
}