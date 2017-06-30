package com.wyun.recommend.service.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wyun.recommend.service.dao.NewsDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Miller on 2017/6/29 0029.
 */
@Controller
@RequestMapping(value = "/rec")
public class RecController {

    @Resource
    private NewsDAO newsDAO;

    /**
     * 获取推荐列表
     * @param jsonstr
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String register(String jsonstr) {

        JSONObject param = JSON.parseObject(jsonstr);
        String userName = param.getString("userName");
        String password = param.getString("password");

        newsDAO.queryUser("","");
    }
}
