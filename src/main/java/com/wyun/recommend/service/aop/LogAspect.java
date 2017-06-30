package com.wyun.recommend.service.aop;

import com.alibaba.fastjson.JSON;
import com.wyun.recommend.service.utils.LoggerUtil;
import com.wyun.recommend.service.model.ResponseDO;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Miller
 * 切面编程类，用于埋点
 */
@Aspect
@Component
public class LogAspect {

    @AfterReturning(pointcut = "execution(* com.wyun.recommend.service.controller.*.*(..))", returning = "object")
    public void log(Object object) {
        if(object == null) {
            LoggerUtil.logger.info("result is null");
        } else {
            LoggerUtil.logger.info("result type: " + object.getClass());
            if (object instanceof ResponseDO) {
                ResponseDO result = (ResponseDO) object;
                LoggerUtil.logger.info("resultCode: " + result.getResultCode());
                LoggerUtil.logger.info("data: " + JSON.toJSONString(result));
            }
            if(object instanceof String) {
                LoggerUtil.logger.info("String: " + object.toString());
            }
        }
    }
}
