package com.springboot.dao;

import com.springboot.entity.TbCheckOrder;

public interface TbCheckOrderMapper {
    int deleteByPrimaryKey(Long tcoId);

    int insert(TbCheckOrder record);

    int insertSelective(TbCheckOrder record);

    TbCheckOrder selectByPrimaryKey(Long tcoId);

    int updateByPrimaryKeySelective(TbCheckOrder record);

    int updateByPrimaryKey(TbCheckOrder record);
}