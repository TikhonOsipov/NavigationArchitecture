package com.tixon.navigationtest.app;

import android.app.Application;

import com.tixon.navigationtest.dagger.components.DaggerIAppComponent;
import com.tixon.navigationtest.dagger.components.IAppComponent;
import com.tixon.navigationtest.dagger.components.IMainActivityComponent;
import com.tixon.navigationtest.dagger.modules.AppModule;
import com.tixon.navigationtest.dagger.modules.NavigationModule;

/**
 * Created by Tikhon on 25.06.2016
 */
public class App extends Application {

    private IAppComponent appComponent;
    private IMainActivityComponent mainActivityComponent;

    public IAppComponent getAppComponent() {
        return appComponent;
    }

    public IMainActivityComponent getMainActivityComponent() {
        return mainActivityComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerIAppComponent.builder()
                .appModule(new AppModule(this))
                .navigationModule(new NavigationModule())
                .build();
    }
}
