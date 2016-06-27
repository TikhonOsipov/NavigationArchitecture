package com.tixon.navigationtest.dagger.components;

import com.tixon.navigationtest.dagger.modules.AppModule;
import com.tixon.navigationtest.dagger.modules.NavigationModule;
import com.tixon.navigationtest.dagger.modules.UserModule;
import com.tixon.navigationtest.model.User;
import com.tixon.navigationtest.navigation.Navigation;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Tikhon on 25.06.2016
 */
@Singleton
@Component(modules = {AppModule.class, NavigationModule.class, UserModule.class})
public interface IAppComponent {
    Navigation navigation();
    User user();
}
