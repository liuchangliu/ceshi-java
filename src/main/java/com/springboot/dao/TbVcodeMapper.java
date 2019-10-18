package com.springboot.dao;

import com.springboot.entity.TbVcode;

public interface TbVcodeMapper {
    int deleteByPrimaryKey(Long tvId);

    int insert(TbVcode record);

    int insertSelective(TbVcode record);

    TbVcode selectByPrimaryKey(Long tvId);

    int updateByPrimaryKeySelective(TbVcode record);

    int updateByPrimaryKey(TbVcode record);
}