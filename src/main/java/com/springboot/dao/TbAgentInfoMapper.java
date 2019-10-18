package com.springboot.dao;

import com.springboot.entity.TbAgentInfo;

public interface TbAgentInfoMapper {
    int deleteByPrimaryKey(Long taiId);

    int insert(TbAgentInfo record);

    int insertSelective(TbAgentInfo record);

    TbAgentInfo selectByPrimaryKey(Long taiId);

    int updateByPrimaryKeySelective(TbAgentInfo record);

    int updateByPrimaryKey(TbAgentInfo record);
}