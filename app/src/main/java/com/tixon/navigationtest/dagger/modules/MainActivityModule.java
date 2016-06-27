package com.tixon.navigationtest.dagger.modules;

import com.tixon.navigationtest.presenters.IMainPresenter;
import com.tixon.navigationtest.views.IMainView;
import com.tixon.navigationtest.presenters.MainPresenterImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tikhon on 25.06.2016
 */
@Module
public class MainActivityModule {

    private IMainView view;

    public MainActivityModule(IMainView view) {
        this.view = view;
    }

    @Provides
    public IMainView provideView() {
        return view;
    }

    @Provides
    @Singleton
    public IMainPresenter providePresenter() {
        return new MainPresenterImpl(view);
    }
}
