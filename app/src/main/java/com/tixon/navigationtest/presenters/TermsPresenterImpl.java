package com.tixon.navigationtest.presenters;

import android.util.Log;

import com.tixon.navigationtest.navigation.Navigation;
import com.tixon.navigationtest.views.ITermsView;

import javax.inject.Inject;

/**
 * Created by Tikhon on 26.06.2016
 */
public class TermsPresenterImpl implements ITermsPresenter {

    ITermsView view;

    @Inject
    Navigation navigation;

    @Inject
    public TermsPresenterImpl(ITermsView view) {
        this.view = view;
    }

    @Override
    public void accept() {
        Log.d("myLogs", "Terms: navigation: " + navigation.hashCode());
        navigation.navigateNext(view);
    }
}
