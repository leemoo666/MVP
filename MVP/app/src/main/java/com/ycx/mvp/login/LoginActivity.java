package com.ycx.mvp.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.ycx.mvp.R;
import com.ycx.mvp.base.BaseMVPActivity;

/**
 * Created by 李小明 on 17/6/14.
 * 邮箱:287907160@qq.com
 */

public class LoginActivity extends BaseMVPActivity<LoginPresenter> implements LoginView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        findViewById(R.id.tvMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().login();

            }
        });

    }

    @Override
    public void onCreateView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
    }

    @Override
    public LoginPresenter createPresenter() {
        return new LoginPresenter(this);
    }


    @Override
    public void setAdapter(String s) {
        Log.i("lxm", "setAdapter = " + s);
    }
}
