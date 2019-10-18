package com.springboot.dao;

import com.springboot.entity.TbShipperToAddress;

public interface TbShipperToAddressMapper {
    int deleteByPrimaryKey(Long tstaId);

    int insert(TbShipperToAddress record);

    int insertSelective(TbShipperToAddress record);

    TbShipperToAddress selectByPrimaryKey(Long tstaId);

    int updateByPrimaryKeySelective(TbShipperToAddress record);

    int updateByPrimaryKey(TbShipperToAddress record);
}