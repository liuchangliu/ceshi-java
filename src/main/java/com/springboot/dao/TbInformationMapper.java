package com.springboot.dao;

import com.springboot.entity.TbInformation;

public interface TbInformationMapper {
    int deleteByPrimaryKey(Long tiId);

    int insert(TbInformation record);

    int insertSelective(TbInformation record);

    TbInformation selectByPrimaryKey(Long tiId);

    int updateByPrimaryKeySelective(TbInformation record);

    int updateByPrimaryKeyWithBLOBs(TbInformation record);

    int updateByPrimaryKey(TbInformation record);
}