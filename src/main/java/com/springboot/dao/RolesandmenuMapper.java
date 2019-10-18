package com.springboot.dao;

import com.springboot.entity.Rolesandmenu;

public interface RolesandmenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Rolesandmenu record);

    int insertSelective(Rolesandmenu record);

    Rolesandmenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Rolesandmenu record);

    int updateByPrimaryKey(Rolesandmenu record);
}