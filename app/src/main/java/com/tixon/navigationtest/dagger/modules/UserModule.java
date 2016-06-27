package com.tixon.navigationtest.dagger.modules;

import com.tixon.navigationtest.model.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tikhon on 27.06.2016
 */
@Module
public class UserModule {
    @Provides
    @Singleton
    public User provideUser() {
        return new User();
    }
}
