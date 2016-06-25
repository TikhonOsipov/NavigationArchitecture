package com.tixon.navigationcommands.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.tixon.navigationcommands.R;
import com.tixon.navigationcommands.dagger.components.DaggerILoginActivityComponent;
import com.tixon.navigationcommands.dagger.components.IAppComponent;
import com.tixon.navigationcommands.dagger.components.ILoginActivityComponent;
import com.tixon.navigationcommands.dagger.modules.LoginActivityModule;
import com.tixon.navigationcommands.databinding.ActivityLoginBinding;
import com.tixon.navigationcommands.presenters.LoginPresenterImpl;
import com.tixon.navigationcommands.views.ILoginView;

import javax.inject.Inject;

/**
 * Created by tikhon on 24.06.16
 */
public class LoginActivity extends BaseActivity implements ILoginView {

    @Inject
    LoginPresenterImpl presenter;

    ILoginActivityComponent component;

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void setupComponent(IAppComponent appComponent) {
        component = DaggerILoginActivityComponent.builder()
                .iAppComponent(appComponent)
                .loginActivityModule(new LoginActivityModule(this))
                .build();
        component.inject(this);
    }

    @Override
    public void startActivity(Class<?> cls) {
        startActivity(new Intent(LoginActivity.this, cls));
    }
}
