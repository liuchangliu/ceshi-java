package com.springboot.dao;

import com.springboot.entity.TbTakeMoneyHistory;

public interface TbTakeMoneyHistoryMapper {
    int deleteByPrimaryKey(Long ttmhId);

    int insert(TbTakeMoneyHistory record);

    int insertSelective(TbTakeMoneyHistory record);

    TbTakeMoneyHistory selectByPrimaryKey(Long ttmhId);

    int updateByPrimaryKeySelective(TbTakeMoneyHistory record);

    int updateByPrimaryKey(TbTakeMoneyHistory record);
}