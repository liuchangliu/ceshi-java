package com.springboot.service;

import com.springboot.entity.TbAdviseInfo;

/**
 * @author LC
 * @data 2019/10/8 - 14:10
 */
public interface TbAdviceService {
    TbAdviseInfo selectByPrimaryKey(Long taiId);
}
