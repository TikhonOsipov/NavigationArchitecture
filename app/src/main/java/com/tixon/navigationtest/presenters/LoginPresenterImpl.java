package com.tixon.navigationtest.presenters;

import android.util.Log;

import com.tixon.navigationtest.views.ILoginView;
import com.tixon.navigationtest.navigation.Navigation;

import javax.inject.Inject;

/**
 * Created by Tikhon on 25.06.2016
 */
public class LoginPresenterImpl implements ILoginPresenter {

    private final ILoginView view;

    @Inject
    Navigation navigation;

    @Inject
    public LoginPresenterImpl(ILoginView view) {
        this.view = view;
    }

    @Override
    public void doLogin() {
        Log.d("myLogs", "Login: navigation: " + navigation.hashCode());
        navigation.navigateNext(view);
    }

    @Override
    public void back() {
        Log.d("myLogs", "Login: navigation: " + navigation.hashCode());
        view.back();
    }
}
