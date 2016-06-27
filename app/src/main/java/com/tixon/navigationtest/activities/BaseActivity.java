package com.tixon.navigationtest.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tixon.navigationtest.app.App;
import com.tixon.navigationtest.dagger.components.IAppComponent;

/**
 * Created by Tikhon on 25.06.2016
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupComponent(((App) getApplication()).getAppComponent());
    }

    public abstract void setupComponent(IAppComponent appComponent);
}
