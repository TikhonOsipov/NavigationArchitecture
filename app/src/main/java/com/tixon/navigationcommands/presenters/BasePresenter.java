package com.tixon.navigationcommands.presenters;

import com.tixon.navigationcommands.navigation.INavigationFlow;

/**
 * Created by tikhon on 24.06.16
 */
public class BasePresenter <T> {
    protected T view;
    protected INavigationFlow navigationFlow;

    public BasePresenter(T view, INavigationFlow flow) {
        this.view = view;
        this.navigationFlow = flow;
    }
}
