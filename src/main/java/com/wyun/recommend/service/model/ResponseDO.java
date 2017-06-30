package com.wyun.recommend.service.model;

import java.util.Map;

/**
 * @author Miller
 * 返回结果类
 * @param <T>
 */
public class ResponseDO<T> {
    private int resultCode;
    private T data;
    private String message;
    private Map extras;

    public ResponseDO(){};
    public ResponseDO(int resultCode, T data) {
        this.resultCode = resultCode;
        this.data = data;
    }

    public ResponseDO(int resultCode, T data, String message) {
        this.resultCode = resultCode;
        this.data = data;
        this.message = message;
    }

    public ResponseDO(int resultCode, T data, String message, Map extras) {
        this.resultCode = resultCode;
        this.data = data;
        this.message = message;
        this.extras = extras;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map getExtras() {
        return extras;
    }

    public void setExtras(Map extras) {
        this.extras = extras;
    }
}
