package com.springboot.dao;

import com.springboot.entity.TbShipperFromAddress;

public interface TbShipperFromAddressMapper {
    int deleteByPrimaryKey(Long tsfaId);

    int insert(TbShipperFromAddress record);

    int insertSelective(TbShipperFromAddress record);

    TbShipperFromAddress selectByPrimaryKey(Long tsfaId);

    int updateByPrimaryKeySelective(TbShipperFromAddress record);

    int updateByPrimaryKey(TbShipperFromAddress record);
}