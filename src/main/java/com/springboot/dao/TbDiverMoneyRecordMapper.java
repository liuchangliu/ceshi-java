package com.springboot.dao;

import com.springboot.entity.TbDiverMoneyRecord;

public interface TbDiverMoneyRecordMapper {
    int deleteByPrimaryKey(Long tdmrId);

    int insert(TbDiverMoneyRecord record);

    int insertSelective(TbDiverMoneyRecord record);

    TbDiverMoneyRecord selectByPrimaryKey(Long tdmrId);

    int updateByPrimaryKeySelective(TbDiverMoneyRecord record);

    int updateByPrimaryKey(TbDiverMoneyRecord record);
}