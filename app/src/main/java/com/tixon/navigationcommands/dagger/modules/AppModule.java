package com.tixon.navigationcommands.dagger.modules;

import android.app.Application;

import com.tixon.navigationcommands.app.App;
import com.tixon.navigationcommands.navigation.INavigationFlow;
import com.tixon.navigationcommands.navigation.NavigationFlowImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tikhon on 24.06.16
 */
@Module
public class AppModule {

    private final App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public Application provideApplication() {
        return app;
    }

    @Provides
    @Singleton
    public INavigationFlow provideNavigationFlow() {
        return new NavigationFlowImpl();
    }
}
