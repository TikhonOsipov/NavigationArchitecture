package com.tixon.navigationtest.dagger.components;

import com.tixon.navigationtest.dagger.scopes.ActivityScope;
import com.tixon.navigationtest.activities.LoginActivity;
import com.tixon.navigationtest.dagger.modules.LoginActivityModule;

import dagger.Component;

/**
 * Created by Tikhon on 25.06.2016
 */
@ActivityScope
@Component(dependencies = IAppComponent.class, modules = LoginActivityModule.class)
public interface ILoginActivityComponent {
    void inject(LoginActivity activity);
}
