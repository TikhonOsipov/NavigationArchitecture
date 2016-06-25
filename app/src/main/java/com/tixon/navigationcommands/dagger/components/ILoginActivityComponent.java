package com.tixon.navigationcommands.dagger.components;

import com.tixon.navigationcommands.activities.LoginActivity;
import com.tixon.navigationcommands.dagger.ActivityScope;
import com.tixon.navigationcommands.dagger.modules.LoginActivityModule;

import dagger.Component;

/**
 * Created by tikhon on 24.06.16
 */
@ActivityScope
@Component(dependencies = IAppComponent.class, modules = LoginActivityModule.class)
public interface ILoginActivityComponent {
    void inject(LoginActivity activity);
}
