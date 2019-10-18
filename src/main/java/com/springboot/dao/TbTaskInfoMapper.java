package com.springboot.dao;

import com.springboot.entity.TbTaskInfo;

public interface TbTaskInfoMapper {
    int deleteByPrimaryKey(Long ttiId);

    int insert(TbTaskInfo record);

    int insertSelective(TbTaskInfo record);

    TbTaskInfo selectByPrimaryKey(Long ttiId);

    int updateByPrimaryKeySelective(TbTaskInfo record);

    int updateByPrimaryKey(TbTaskInfo record);
}