package com.springboot.dao;

import com.springboot.entity.Usergroup;

public interface UsergroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Usergroup record);

    int insertSelective(Usergroup record);

    Usergroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Usergroup record);

    int updateByPrimaryKey(Usergroup record);
}