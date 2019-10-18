package com.springboot.dao;

import com.springboot.entity.TbShipperInfo;

public interface TbShipperInfoMapper {
    int deleteByPrimaryKey(Long tsiId);

    int insert(TbShipperInfo record);

    int insertSelective(TbShipperInfo record);

    TbShipperInfo selectByPrimaryKey(Long tsiId);

    int updateByPrimaryKeySelective(TbShipperInfo record);

    int updateByPrimaryKey(TbShipperInfo record);
}