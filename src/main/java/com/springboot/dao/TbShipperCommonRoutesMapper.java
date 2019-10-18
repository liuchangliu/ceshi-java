package com.springboot.dao;

import com.springboot.entity.TbShipperCommonRoutes;

public interface TbShipperCommonRoutesMapper {
    int deleteByPrimaryKey(Long tscrId);

    int insert(TbShipperCommonRoutes record);

    int insertSelective(TbShipperCommonRoutes record);

    TbShipperCommonRoutes selectByPrimaryKey(Long tscrId);

    int updateByPrimaryKeySelective(TbShipperCommonRoutes record);

    int updateByPrimaryKey(TbShipperCommonRoutes record);
}