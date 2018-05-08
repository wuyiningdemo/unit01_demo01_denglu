package com.bwie.denglu_demo.model;

public interface LoginListener {
    void loginSuccess(String json);

    void loginError(String error);
}
