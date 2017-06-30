package com.wyun.recommend.service.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author Miller
 * DAO 接口
 */
@Repository
public interface UserDAO {
    List<Map<String,Object>> queryUser(@Param("userName") String userName, @Param("password") String password);
    int addUser(@Param("userName") String userName, @Param("password") String password);
}
