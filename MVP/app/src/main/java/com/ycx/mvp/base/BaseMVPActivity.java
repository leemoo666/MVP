package com.ycx.mvp.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.ycx.mvp.mvp.presenter.IPresenter;

/**
 * Created by 李小明 on 17/6/14.
 * 邮箱:287907160@qq.com
 */

public abstract class BaseMVPActivity<P extends IPresenter> extends Activity {

    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onCreateView(savedInstanceState);
        mPresenter = createPresenter();

    }

    public abstract void onCreateView(Bundle savedInstanceState);

    public abstract P createPresenter();


    public P getPresenter() {
        return mPresenter;
    }
}
