package com.bwie.denglu_demo.presenter;





import com.bwie.denglu_demo.http.HttpConfig;
import com.bwie.denglu_demo.model.IModel;
import com.bwie.denglu_demo.model.LoginListener;
import com.bwie.denglu_demo.model.RegListener;
import com.bwie.denglu_demo.view.IMainView;
import com.bwie.denglu_demo.view.IRegView;

import java.util.HashMap;
import java.util.Map;


public class Presenter implements Ipresenter {
    private static final String TAG = "Presenter-----";
    //登录
    @Override
    public void loginPresenter(IModel iModel, final IMainView iMainView) {
        //调用m请求数据
        Map<String, String> map = new HashMap<>();
        map.put("mobile", iMainView.getMobile());
        map.put("password", iMainView.getPassword());
        iModel.login(HttpConfig.login_url, map, new LoginListener() {
            //根据回调结果，决定view的显示效果
            @Override
            public void loginSuccess(String json) {
                iMainView.loginSuccess();
            }

            @Override
            public void loginError(String error) {
                iMainView.loginError();
            }
        });

    }

    //注册
    @Override
    public void regPresenter(IModel iModel, final IRegView iRegView) {
        //调用m请求数据
        Map<String, String> map = new HashMap<>();
        map.put("mobile", iRegView.getMobile());
        map.put("password", iRegView.getPassword());
        iModel.reg(HttpConfig.reg_url, map, new RegListener() {
            @Override
            public void regSuccess(String json) {
                iRegView.regSuccess();
            }

            @Override
            public void regError(String error) {
                iRegView.regError();
            }
        });
    }


}
