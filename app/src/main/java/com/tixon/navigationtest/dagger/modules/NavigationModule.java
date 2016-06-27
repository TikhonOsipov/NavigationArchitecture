package com.tixon.navigationtest.dagger.modules;

import com.tixon.navigationtest.navigation.Navigation;
import com.tixon.navigationtest.navigation.NavigationFlow;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tikhon on 25.06.2016
 */
@Module
public class NavigationModule {

    @Provides
    @Singleton
    public Navigation provideNavigation() {
        return new NavigationFlow();
    }
}
