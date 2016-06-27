package com.tixon.navigationtest.dagger.modules;

import com.tixon.navigationtest.presenters.ITermsPresenter;
import com.tixon.navigationtest.presenters.TermsPresenterImpl;
import com.tixon.navigationtest.views.ITermsView;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Tikhon on 26.06.2016
 */
@Module
public class TermsActivityModule {

    ITermsView view;

    public TermsActivityModule(ITermsView view) {
        this.view = view;
    }

    @Provides
    public ITermsView provideView() {
        return view;
    }

    @Provides
    @Singleton
    public ITermsPresenter providePresenter() {
        return new TermsPresenterImpl(view);
    }
}
