package com.springboot.controller;

import com.springboot.dao.TbAdviseInfoMapper;
import com.springboot.entity.TbAdviseInfo;
import com.springboot.service.TbAdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author LC
 * @data 2019/9/30 - 9:07
 */
@Controller
public class TestController {
    @Autowired
    TbAdviceService tbAdviceService;
    @Autowired
    TbAdviseInfoMapper tbAdviseInfoMapper;
    @ResponseBody
    @RequestMapping(value = "/show")
    public TbAdviseInfo getIndex(String taiId) {
        TbAdviseInfo tbAdviseInfo = tbAdviceService.selectByPrimaryKey(Long.valueOf(taiId));
        String taiDesc = tbAdviseInfo.getTaiDesc();
        return tbAdviseInfo;
    }
    @ResponseBody
    @RequestMapping(value = "/updateInfo")
    public String updateInfo(String taiId,String desc) {
        TbAdviseInfo tbAdviseInfo = tbAdviseInfoMapper.selectByPrimaryKey(Long.valueOf(taiId));
        tbAdviseInfo.setTaiDesc(desc);
        tbAdviseInfoMapper.updateByPrimaryKeySelective(tbAdviseInfo);
        return "更新成功";
    }
    @RequestMapping(value = "/login")
    public String login() {
        return "login/login.jsp";
    }

    @RequestMapping(value = "/vuedemo")
    public String vuedemo() {
        return "login/lcx.vue";
    }
}
