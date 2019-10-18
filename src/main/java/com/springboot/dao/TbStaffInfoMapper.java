package com.springboot.dao;

import com.springboot.entity.TbStaffInfo;

public interface TbStaffInfoMapper {
    int deleteByPrimaryKey(Long tsiId);

    int insert(TbStaffInfo record);

    int insertSelective(TbStaffInfo record);

    TbStaffInfo selectByPrimaryKey(Long tsiId);

    int updateByPrimaryKeySelective(TbStaffInfo record);

    int updateByPrimaryKey(TbStaffInfo record);
}