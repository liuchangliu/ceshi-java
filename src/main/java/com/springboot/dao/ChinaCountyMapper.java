package com.springboot.dao;

import com.springboot.entity.ChinaCounty;

public interface ChinaCountyMapper {
    int deleteByPrimaryKey(Long oid);

    int insert(ChinaCounty record);

    int insertSelective(ChinaCounty record);

    ChinaCounty selectByPrimaryKey(Long oid);

    int updateByPrimaryKeySelective(ChinaCounty record);

    int updateByPrimaryKey(ChinaCounty record);
}