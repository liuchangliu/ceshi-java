package com.springboot.dao;

import com.springboot.entity.TbMessage;

public interface TbMessageMapper {
    int deleteByPrimaryKey(Long tmId);

    int insert(TbMessage record);

    int insertSelective(TbMessage record);

    TbMessage selectByPrimaryKey(Long tmId);

    int updateByPrimaryKeySelective(TbMessage record);

    int updateByPrimaryKey(TbMessage record);
}