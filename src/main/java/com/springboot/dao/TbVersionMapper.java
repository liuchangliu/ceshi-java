package com.springboot.dao;

import com.springboot.entity.TbVersion;

public interface TbVersionMapper {
    int deleteByPrimaryKey(Long tvId);

    int insert(TbVersion record);

    int insertSelective(TbVersion record);

    TbVersion selectByPrimaryKey(Long tvId);

    int updateByPrimaryKeySelective(TbVersion record);

    int updateByPrimaryKey(TbVersion record);
}