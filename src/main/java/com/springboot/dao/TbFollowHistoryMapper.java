package com.springboot.dao;

import com.springboot.entity.TbFollowHistory;

public interface TbFollowHistoryMapper {
    int deleteByPrimaryKey(Long tfhId);

    int insert(TbFollowHistory record);

    int insertSelective(TbFollowHistory record);

    TbFollowHistory selectByPrimaryKey(Long tfhId);

    int updateByPrimaryKeySelective(TbFollowHistory record);

    int updateByPrimaryKey(TbFollowHistory record);
}