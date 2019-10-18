package com.springboot.dao;

import com.springboot.entity.TbTransportOrder;

public interface TbTransportOrderMapper {
    int deleteByPrimaryKey(Long ttoId);

    int insert(TbTransportOrder record);

    int insertSelective(TbTransportOrder record);

    TbTransportOrder selectByPrimaryKey(Long ttoId);

    int updateByPrimaryKeySelective(TbTransportOrder record);

    int updateByPrimaryKey(TbTransportOrder record);
}