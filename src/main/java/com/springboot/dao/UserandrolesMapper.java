package com.springboot.dao;

import com.springboot.entity.Userandroles;

public interface UserandrolesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Userandroles record);

    int insertSelective(Userandroles record);

    Userandroles selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Userandroles record);

    int updateByPrimaryKey(Userandroles record);
}