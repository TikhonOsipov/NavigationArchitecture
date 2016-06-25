package com.tixon.navigationcommands.app;

import android.app.Application;
import android.content.Context;

import com.tixon.navigationcommands.dagger.components.DaggerIAppComponent;
import com.tixon.navigationcommands.dagger.components.IAppComponent;
import com.tixon.navigationcommands.dagger.modules.AppModule;

/**
 * Created by tikhon on 24.06.16
 */
public class App extends Application {

    private IAppComponent appComponent;

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        buildGraphAndInject();
    }

    public IAppComponent getAppComponent() {
        return appComponent;
    }

    public void buildGraphAndInject() {
        appComponent = DaggerIAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        appComponent.inject(this);
    }
}
