package com.springboot.dao;

import com.springboot.entity.Sysmenu;

public interface SysmenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sysmenu record);

    int insertSelective(Sysmenu record);

    Sysmenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sysmenu record);

    int updateByPrimaryKey(Sysmenu record);
}