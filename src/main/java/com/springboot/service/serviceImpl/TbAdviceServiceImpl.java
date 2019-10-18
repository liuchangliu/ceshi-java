package com.springboot.service.serviceImpl;

import com.springboot.dao.TbAdviseInfoMapper;
import com.springboot.entity.TbAdviseInfo;
import com.springboot.service.TbAdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author LC
 * @data 2019/10/8 - 14:11
 */
@Service
public class TbAdviceServiceImpl implements TbAdviceService {
    @Autowired
    TbAdviseInfoMapper tbAdviseInfoMapper;

    @Override
    public TbAdviseInfo selectByPrimaryKey(Long taiId){
        TbAdviseInfo tbAdviseInfo = tbAdviseInfoMapper.selectByPrimaryKey(taiId);
        return tbAdviseInfo;
    }
}
