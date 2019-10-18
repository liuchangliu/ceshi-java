package com.springboot.dao;

import com.springboot.entity.TbWords;

public interface TbWordsMapper {
    int deleteByPrimaryKey(Long twId);

    int insert(TbWords record);

    int insertSelective(TbWords record);

    TbWords selectByPrimaryKey(Long twId);

    int updateByPrimaryKeySelective(TbWords record);

    int updateByPrimaryKey(TbWords record);
}