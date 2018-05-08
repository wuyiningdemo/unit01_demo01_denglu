package com.bwie.denglu_demo.presenter;


import com.bwie.denglu_demo.model.IModel;
import com.bwie.denglu_demo.view.IMainView;
import com.bwie.denglu_demo.view.IRegView;

public interface Ipresenter {
    //    登录
    void loginPresenter(IModel iModel, IMainView iMainView);

    //    注册
    void regPresenter(IModel iModel, IRegView iRegView);

}
