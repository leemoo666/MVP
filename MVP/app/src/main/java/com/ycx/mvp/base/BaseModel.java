package com.ycx.mvp.base;

/**
 * Created by 李小明 on 17/6/14.
 * 邮箱:287907160@qq.com
 */

public abstract class BaseModel<P> {

    public P presenter;

    public P getPresenter() {
        return presenter;
    }


    public BaseModel(P presenter) {
        this.presenter = presenter;
    }


}
