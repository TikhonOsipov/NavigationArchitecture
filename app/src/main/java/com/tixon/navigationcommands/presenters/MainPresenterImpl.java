package com.tixon.navigationcommands.presenters;

import com.tixon.navigationcommands.navigation.NavigationFlowImpl;
import com.tixon.navigationcommands.views.IMainView;

import javax.inject.Inject;

/**
 * Created by tikhon on 24.06.16
 */
public class MainPresenterImpl implements IMainPresenter {
    private final IMainView view;

    @Inject
    NavigationFlowImpl navigationFlow;

    @Inject
    public MainPresenterImpl(IMainView view) {
        this.view = view;
    }

    @Override
    public void startLogin() {
        navigationFlow.navigateNext(view);
    }
}
