package com.bwie.denglu_demo.model;

import java.util.Map;

/**
 * Model
 */

public interface IModel {
    //    登录
    void login(String url, Map<String, String> params, LoginListener loginListener);

    //    注册
    void reg(String url, Map<String, String> params, RegListener regListener);


}
