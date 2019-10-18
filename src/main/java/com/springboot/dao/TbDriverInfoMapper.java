package com.springboot.dao;

import com.springboot.entity.TbDriverInfo;

public interface TbDriverInfoMapper {
    int deleteByPrimaryKey(Long tdiId);

    int insert(TbDriverInfo record);

    int insertSelective(TbDriverInfo record);

    TbDriverInfo selectByPrimaryKey(Long tdiId);

    int updateByPrimaryKeySelective(TbDriverInfo record);

    int updateByPrimaryKey(TbDriverInfo record);
}