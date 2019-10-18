package com.springboot.dao;

import com.springboot.entity.ChinaProvince;

public interface ChinaProvinceMapper {
    int deleteByPrimaryKey(Long pid);

    int insert(ChinaProvince record);

    int insertSelective(ChinaProvince record);

    ChinaProvince selectByPrimaryKey(Long pid);

    int updateByPrimaryKeySelective(ChinaProvince record);

    int updateByPrimaryKey(ChinaProvince record);
}