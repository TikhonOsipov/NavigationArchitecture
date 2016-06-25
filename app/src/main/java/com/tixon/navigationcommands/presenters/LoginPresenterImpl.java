package com.tixon.navigationcommands.presenters;

import com.tixon.navigationcommands.navigation.NavigationFlowImpl;
import com.tixon.navigationcommands.views.ILoginView;

import javax.inject.Inject;

/**
 * Created by tikhon on 24.06.16
 */
public class LoginPresenterImpl implements ILoginPresenter {

    ILoginView view;

    @Inject
    NavigationFlowImpl navigationFlow;

    @Inject
    public LoginPresenterImpl(ILoginView view) {
        this.view = view;
    }

    @Override
    public void doLogin() {
        navigationFlow.navigateNext(view);
    }
}
