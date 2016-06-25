package com.tixon.navigationcommands.dagger.modules;

import com.tixon.navigationcommands.navigation.INavigationFlow;
import com.tixon.navigationcommands.presenters.ILoginPresenter;
import com.tixon.navigationcommands.presenters.LoginPresenterImpl;
import com.tixon.navigationcommands.views.ILoginView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tikhon on 24.06.16
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
    public ILoginPresenter providePresenter() {
        return new LoginPresenterImpl(view);
    }
}
