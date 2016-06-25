package com.tixon.navigationcommands.dagger.components;

import com.tixon.navigationcommands.app.App;
import com.tixon.navigationcommands.dagger.modules.AppModule;

import dagger.Component;

/**
 * Created by tikhon on 24.06.16
 */
@Component(modules = AppModule.class)
public interface IAppComponent {
    void inject(App app);
}
