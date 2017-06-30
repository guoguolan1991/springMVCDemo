package com.wyun.recommend.service.service.impl;

import com.wyun.recommend.service.dao.UserDAO;
import com.wyun.recommend.service.model.ResponseDO;
import com.wyun.recommend.service.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Miller
 * service类实现接口模板
 */
@Service("testService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;


    public ResponseDO queryUser() throws Exception {
        return null;
    }
}
