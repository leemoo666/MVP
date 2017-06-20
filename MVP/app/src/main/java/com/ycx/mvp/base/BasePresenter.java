package com.ycx.mvp.base;

import com.ycx.mvp.mvp.presenter.IPresenter;

/**
 * Created by 李小明 on 17/6/14.
 * 邮箱:287907160@qq.com
 */

public abstract class BasePresenter<V, M> implements IPresenter {

    public V view;
    public M model;

    public M getModel() {
        return model;
    }

    public V getView() {
        return view;
    }

    public BasePresenter(V view) {
        model = createModel();
        this.view = view;

    }

    public abstract M createModel();


}
