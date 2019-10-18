package com.springboot.dao;

import com.springboot.entity.Groupandmenu;

public interface GroupandmenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Groupandmenu record);

    int insertSelective(Groupandmenu record);

    Groupandmenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Groupandmenu record);

    int updateByPrimaryKey(Groupandmenu record);
}