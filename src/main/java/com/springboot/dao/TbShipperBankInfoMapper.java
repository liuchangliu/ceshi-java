package com.springboot.dao;

import com.springboot.entity.TbShipperBankInfo;

public interface TbShipperBankInfoMapper {
    int deleteByPrimaryKey(Long tsbiId);

    int insert(TbShipperBankInfo record);

    int insertSelective(TbShipperBankInfo record);

    TbShipperBankInfo selectByPrimaryKey(Long tsbiId);

    int updateByPrimaryKeySelective(TbShipperBankInfo record);

    int updateByPrimaryKey(TbShipperBankInfo record);
}