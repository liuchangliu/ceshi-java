package com.springboot.dao;

import com.springboot.entity.TbCashWithdrawal;

public interface TbCashWithdrawalMapper {
    int deleteByPrimaryKey(Long tcwId);

    int insert(TbCashWithdrawal record);

    int insertSelective(TbCashWithdrawal record);

    TbCashWithdrawal selectByPrimaryKey(Long tcwId);

    int updateByPrimaryKeySelective(TbCashWithdrawal record);

    int updateByPrimaryKey(TbCashWithdrawal record);
}