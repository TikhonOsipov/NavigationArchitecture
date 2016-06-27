package com.tixon.navigationtest.dagger.components;

import com.tixon.navigationtest.dagger.scopes.ActivityScope;
import com.tixon.navigationtest.activities.MainActivity;
import com.tixon.navigationtest.dagger.modules.MainActivityModule;

import dagger.Component;

/**
 * Created by Tikhon on 25.06.2016
 */
@ActivityScope
@Component(dependencies = IAppComponent.class, modules = {MainActivityModule.class})
public interface IMainActivityComponent {
    void inject(MainActivity activity);
}
