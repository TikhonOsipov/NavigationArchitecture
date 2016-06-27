package com.tixon.navigationtest.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.tixon.navigationtest.R;
import com.tixon.navigationtest.dagger.components.DaggerILoginActivityComponent;
import com.tixon.navigationtest.dagger.components.IAppComponent;
import com.tixon.navigationtest.dagger.components.ILoginActivityComponent;
import com.tixon.navigationtest.dagger.modules.LoginActivityModule;
import com.tixon.navigationtest.presenters.LoginPresenterImpl;
import com.tixon.navigationtest.views.ILoginView;

import javax.inject.Inject;

/**
 * Created by Tikhon on 25.06.2016
 */
public class LoginActivity extends BaseActivity implements ILoginView {

    ILoginActivityComponent component;

    @Inject
    LoginPresenterImpl presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = (Button) findViewById(R.id.buttonLogin);
        assert loginButton != null;

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.doLogin();
            }
        });
    }

    @Override
    public void setupComponent(IAppComponent appComponent) {
        component = DaggerILoginActivityComponent.builder()
                .iAppComponent(appComponent)
                .loginActivityModule(new LoginActivityModule(this))
                .build();
        component.inject(this);
    }

    @Override
    public void onBackPressed() {
        presenter.back();
    }

    @Override
    public void back() {
        super.onBackPressed();
    }

    @Override
    public void startActivity(Class<?> cls) {
        startActivity(new Intent(LoginActivity.this, cls));
    }
}
