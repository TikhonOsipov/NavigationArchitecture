package com.tixon.navigationcommands.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tixon.navigationcommands.app.App;
import com.tixon.navigationcommands.dagger.components.IAppComponent;

/**
 * Created by tikhon on 24.06.16
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupComponent(App.get(this).getAppComponent());
    }

    protected abstract void setupComponent(IAppComponent appComponent);;
}
