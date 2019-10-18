package com.springboot.dao;

import com.springboot.entity.TbBackstageStaffInfo;

public interface TbBackstageStaffInfoMapper {
    int deleteByPrimaryKey(Long tbsiId);

    int insert(TbBackstageStaffInfo record);

    int insertSelective(TbBackstageStaffInfo record);

    TbBackstageStaffInfo selectByPrimaryKey(Long tbsiId);

    int updateByPrimaryKeySelective(TbBackstageStaffInfo record);

    int updateByPrimaryKey(TbBackstageStaffInfo record);
}