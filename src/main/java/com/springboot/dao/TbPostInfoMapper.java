package com.springboot.dao;

import com.springboot.entity.TbPostInfo;

public interface TbPostInfoMapper {
    int deleteByPrimaryKey(Long tpiId);

    int insert(TbPostInfo record);

    int insertSelective(TbPostInfo record);

    TbPostInfo selectByPrimaryKey(Long tpiId);

    int updateByPrimaryKeySelective(TbPostInfo record);

    int updateByPrimaryKey(TbPostInfo record);
}