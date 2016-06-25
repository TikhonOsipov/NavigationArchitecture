package com.tixon.navigationcommands.dagger.modules;

import com.tixon.navigationcommands.presenters.IMainPresenter;
import com.tixon.navigationcommands.presenters.MainPresenterImpl;
import com.tixon.navigationcommands.views.IMainView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tikhon on 24.06.16
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
    public IMainPresenter providePresenter() {
        return new MainPresenterImpl(view);
    }

}
