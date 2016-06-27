package com.tixon.navigationtest.presenters;

import android.util.Log;

import com.tixon.navigationtest.model.User;
import com.tixon.navigationtest.navigation.Navigation;
import com.tixon.navigationtest.views.ILoginView;

import javax.inject.Inject;

/**
 * Created by Tikhon on 25.06.2016
 */
public class LoginPresenterImpl implements ILoginPresenter {

    private final ILoginView view;

    @Inject
    Navigation navigation;

    @Inject
    User user;

    @Inject
    public LoginPresenterImpl(ILoginView view) {
        this.view = view;
    }

    @Override
    public void doLogin() {
        Log.d("myLogs", "Login: navigation: " + navigation.hashCode());
        Log.d("myLogs", "user injection: hashcode = " + user.hashCode());
        navigation.navigateNext(view);
    }

    @Override
    public void back() {
        Log.d("myLogs", "Login: navigation: " + navigation.hashCode());
        Log.d("myLogs", "user injection: hashcode = " + user.hashCode());
        view.back();
    }
}
