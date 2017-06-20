package com.ycx.mvp.login;

import com.ycx.mvp.base.BaseModel;

/**
 * Created by 李小明 on 17/6/14.
 * 邮箱:287907160@qq.com
 */

public class LoginModel extends BaseModel<LoginPresenter> {

    public LoginModel(LoginPresenter presenter) {
        super(presenter);
    }

    public void login(String phone, String password) {

        getPresenter().onSuccess();

        getPresenter().onFailure();
    }

}
