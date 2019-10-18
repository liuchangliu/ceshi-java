package com.springboot.dao;

import com.springboot.entity.TbShipperMoney;

public interface TbShipperMoneyMapper {
    int deleteByPrimaryKey(Long tsmId);

    int insert(TbShipperMoney record);

    int insertSelective(TbShipperMoney record);

    TbShipperMoney selectByPrimaryKey(Long tsmId);

    int updateByPrimaryKeySelective(TbShipperMoney record);

    int updateByPrimaryKey(TbShipperMoney record);
}