package com.tixon.navigationtest.presenters;

import android.util.Log;

import com.tixon.navigationtest.model.User;
import com.tixon.navigationtest.navigation.Navigation;
import com.tixon.navigationtest.views.IMainView;

import javax.inject.Inject;

/**
 * Created by Tikhon on 25.06.2016
 */
public class MainPresenterImpl implements IMainPresenter {

    private IMainView view;

    @Inject
    Navigation navigation;

    @Inject
    User user;

    @Inject
    public MainPresenterImpl(IMainView view) {
        this.view = view;
    }

    @Override
    public void startLogin() {
        Log.d("myLogs", "Main: navigation: " + navigation.hashCode());
        Log.d("myLogs", "user injection: hashcode = " + user.hashCode());
        //view.startActivity(LoginActivity.class);
        navigation.navigateNext(view);
    }
}
