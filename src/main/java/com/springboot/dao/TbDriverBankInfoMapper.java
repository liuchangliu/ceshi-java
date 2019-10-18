package com.springboot.dao;

import com.springboot.entity.TbDriverBankInfo;

public interface TbDriverBankInfoMapper {
    int deleteByPrimaryKey(Long tdbiId);

    int insert(TbDriverBankInfo record);

    int insertSelective(TbDriverBankInfo record);

    TbDriverBankInfo selectByPrimaryKey(Long tdbiId);

    int updateByPrimaryKeySelective(TbDriverBankInfo record);

    int updateByPrimaryKey(TbDriverBankInfo record);
}