package com.tixon.navigationcommands.dagger.modules;

import com.tixon.navigationcommands.presenters.ITermsAndConditionsPresenter;
import com.tixon.navigationcommands.presenters.TermsAndConditionsPresenterImpl;
import com.tixon.navigationcommands.views.ITermsAndConditionsView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tikhon on 24.06.16
 */
@Module
public class TermsAndConditionsActivityModule {

    ITermsAndConditionsView view;

    public TermsAndConditionsActivityModule(ITermsAndConditionsView view) {
        this.view = view;
    }

    @Provides
    public ITermsAndConditionsView provideView() {
        return view;
    }

    @Provides
    public ITermsAndConditionsPresenter providePresenter() {
        return new TermsAndConditionsPresenterImpl(view);
    }
}
