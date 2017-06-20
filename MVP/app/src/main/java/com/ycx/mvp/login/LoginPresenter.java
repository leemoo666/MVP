package com.ycx.mvp.login;

import com.ycx.mvp.base.BasePresenter;

/**
 * Created by 李小明 on 17/6/14.
 * 邮箱:287907160@qq.com
 */

public class LoginPresenter extends BasePresenter<LoginView, LoginModel> {


    public LoginPresenter(LoginView view) {
        super(view);
    }

    public void onSuccess() {
        getView().setAdapter("success");

    }

    public void onFailure() {
        getView().setAdapter("failure");
    }


    public void login() {
        getModel().login("15901038463", "123456");
    }

    @Override
    public LoginModel createModel() {
        return new LoginModel(this);
    }


}
