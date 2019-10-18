package com.springboot.dao;

import com.springboot.entity.ChinaCity;

public interface ChinaCityMapper {
    int deleteByPrimaryKey(Long cid);

    int insert(ChinaCity record);

    int insertSelective(ChinaCity record);

    ChinaCity selectByPrimaryKey(Long cid);

    int updateByPrimaryKeySelective(ChinaCity record);

    int updateByPrimaryKey(ChinaCity record);
}