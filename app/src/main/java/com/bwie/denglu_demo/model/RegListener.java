package com.bwie.denglu_demo.model;

/**
 * 注册的回调接口
 */

public interface RegListener {
    void regSuccess(String json);

    void regError(String error);
}
