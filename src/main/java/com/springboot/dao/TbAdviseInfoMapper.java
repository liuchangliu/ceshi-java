package com.springboot.dao;

import com.springboot.entity.TbAdviseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface TbAdviseInfoMapper {
    int deleteByPrimaryKey(Long taiId);

    int insert(TbAdviseInfo record);

    int insertSelective(TbAdviseInfo record);

    TbAdviseInfo selectByPrimaryKey(Long taiId);

    int updateByPrimaryKeySelective(TbAdviseInfo record);

    int updateByPrimaryKey(TbAdviseInfo record);
}