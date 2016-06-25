package com.tixon.navigationcommands.dagger.components;

import com.tixon.navigationcommands.activities.MainActivity;
import com.tixon.navigationcommands.dagger.ActivityScope;
import com.tixon.navigationcommands.dagger.modules.MainActivityModule;

import dagger.Component;

/**
 * Created by tikhon on 24.06.16
 */
@ActivityScope
@Component(dependencies = IAppComponent.class, modules = MainActivityModule.class)
public interface IMainActivityComponent {
    void inject(MainActivity activity);
}
