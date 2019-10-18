package com.springboot.dao;

import com.springboot.entity.TbShipperDiverRelation;

public interface TbShipperDiverRelationMapper {
    int deleteByPrimaryKey(Long tsdrId);

    int insert(TbShipperDiverRelation record);

    int insertSelective(TbShipperDiverRelation record);

    TbShipperDiverRelation selectByPrimaryKey(Long tsdrId);

    int updateByPrimaryKeySelective(TbShipperDiverRelation record);

    int updateByPrimaryKey(TbShipperDiverRelation record);
}