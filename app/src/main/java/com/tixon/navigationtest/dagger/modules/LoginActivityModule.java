package com.tixon.navigationtest.dagger.modules;

import com.tixon.navigationtest.presenters.ILoginPresenter;
import com.tixon.navigationtest.views.ILoginView;
import com.tixon.navigationtest.presenters.LoginPresenterImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tikhon on 25.06.2016
 */
@Module
public class LoginActivityModule {

    private final ILoginView view;

    public LoginActivityModule(ILoginView view) {
        this.view = view;
    }

    @Provides
    public ILoginView provideView() {
        return view;
    }

    @Provides
    @Singleton
    public ILoginPresenter providePresenter() {
        return new LoginPresenterImpl(view);
    }
}
