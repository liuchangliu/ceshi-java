package com.springboot.dao;

import com.springboot.entity.TbTaskLocationHistory;

public interface TbTaskLocationHistoryMapper {
    int deleteByPrimaryKey(Long ttlhId);

    int insert(TbTaskLocationHistory record);

    int insertSelective(TbTaskLocationHistory record);

    TbTaskLocationHistory selectByPrimaryKey(Long ttlhId);

    int updateByPrimaryKeySelective(TbTaskLocationHistory record);

    int updateByPrimaryKey(TbTaskLocationHistory record);
}