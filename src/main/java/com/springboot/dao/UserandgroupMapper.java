package com.springboot.dao;

import com.springboot.entity.Userandgroup;

public interface UserandgroupMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Userandgroup record);

    int insertSelective(Userandgroup record);

    Userandgroup selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Userandgroup record);

    int updateByPrimaryKey(Userandgroup record);
}