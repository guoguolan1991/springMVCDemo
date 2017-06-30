package com.wyun.recommend.service.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Miller on 2017/6/29 0029.
 */
public interface NewsDAO {
    List<Map<String,Object>> queryUser(@Param("userName") String userName, @Param("password") String password);
    int addUser(@Param("userName") String userName, @Param("password") String password);
}
