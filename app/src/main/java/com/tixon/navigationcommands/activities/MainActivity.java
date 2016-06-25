package com.tixon.navigationcommands.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.tixon.navigationcommands.R;
import com.tixon.navigationcommands.dagger.components.DaggerIMainActivityComponent;
import com.tixon.navigationcommands.dagger.components.IAppComponent;
import com.tixon.navigationcommands.dagger.components.IMainActivityComponent;
import com.tixon.navigationcommands.dagger.modules.MainActivityModule;
import com.tixon.navigationcommands.databinding.ActivityMainBinding;
import com.tixon.navigationcommands.presenters.MainPresenterImpl;
import com.tixon.navigationcommands.views.IMainView;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements IMainView {

    @Inject
    MainPresenterImpl presenter;

    IMainActivityComponent component;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void setupComponent(IAppComponent appComponent) {
        component = DaggerIMainActivityComponent.builder()
                .iAppComponent(appComponent)
                .mainActivityModule(new MainActivityModule(this))
                .build();
        component.inject(this);
    }

    @Override
    public void startActivity(Class<?> cls) {
        startActivity(new Intent(MainActivity.this, cls));
    }
}
