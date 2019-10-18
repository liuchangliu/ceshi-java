package com.springboot.dao;

import com.springboot.entity.TbInformationCata;

public interface TbInformationCataMapper {
    int deleteByPrimaryKey(Long ticId);

    int insert(TbInformationCata record);

    int insertSelective(TbInformationCata record);

    TbInformationCata selectByPrimaryKey(Long ticId);

    int updateByPrimaryKeySelective(TbInformationCata record);

    int updateByPrimaryKey(TbInformationCata record);
}