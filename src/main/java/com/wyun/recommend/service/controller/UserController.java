package com.wyun.recommend.service.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wyun.recommend.service.dao.UserDAO;
import com.wyun.recommend.service.model.ResponseDO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Miller
 * UserController 用户注册登录类
 */
@Controller
@RequestMapping(value = "/test")
public class UserController {

    @Resource
    private UserDAO userDAO;

    /**
     * 用户注册
     * @param jsonstr
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String register(String jsonstr) {

        JSONObject param = JSON.parseObject(jsonstr);
        String userName = param.getString("userName");
        String password = param.getString("password");
        ResponseDO responseDO = new ResponseDO();
        if(password != null && userName != null){
            userDAO.addUser(userName, password);
            responseDO.setMessage("success");
        }
        else{
            responseDO.setMessage("failure");
        }

        return JSON.toJSONString(responseDO);
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    /**
     * 用户登录
     * @param jsonstr
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String login(String jsonstr) {
        JSONObject param = JSON.parseObject(jsonstr);
        String userName = param.getString("userName");
        String password = param.getString("password");

        ResponseDO responseDO = null;
        try {
            List<Map<String,Object>> userList = userDAO.queryUser(userName, password);
            if(userList.size() > 0){
                responseDO.setMessage("success");
            }else{
                responseDO.setMessage("failure");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return JSON.toJSONString(responseDO);
    }

}
