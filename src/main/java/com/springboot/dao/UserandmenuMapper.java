package com.springboot.dao;

import com.springboot.entity.Userandmenu;

public interface UserandmenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Userandmenu record);

    int insertSelective(Userandmenu record);

    Userandmenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Userandmenu record);

    int updateByPrimaryKey(Userandmenu record);
}