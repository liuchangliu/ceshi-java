package com.springboot.dao;

import com.springboot.entity.TbSystemLogs;

public interface TbSystemLogsMapper {
    int deleteByPrimaryKey(Long tslId);

    int insert(TbSystemLogs record);

    int insertSelective(TbSystemLogs record);

    TbSystemLogs selectByPrimaryKey(Long tslId);

    int updateByPrimaryKeySelective(TbSystemLogs record);

    int updateByPrimaryKey(TbSystemLogs record);
}