package com.springboot.dao;

import com.springboot.entity.TbSystemBankInfo;

public interface TbSystemBankInfoMapper {
    int deleteByPrimaryKey(Long tsbiId);

    int insert(TbSystemBankInfo record);

    int insertSelective(TbSystemBankInfo record);

    TbSystemBankInfo selectByPrimaryKey(Long tsbiId);

    int updateByPrimaryKeySelective(TbSystemBankInfo record);

    int updateByPrimaryKey(TbSystemBankInfo record);
}