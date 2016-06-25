package com.tixon.navigationcommands.presenters;

import com.tixon.navigationcommands.navigation.NavigationFlowImpl;
import com.tixon.navigationcommands.views.ITermsAndConditionsView;

import javax.inject.Inject;

/**
 * Created by tikhon on 24.06.16
 */
public class TermsAndConditionsPresenterImpl implements ITermsAndConditionsPresenter {

    ITermsAndConditionsView view;

    @Inject
    NavigationFlowImpl navigationFlow;

    @Inject
    public TermsAndConditionsPresenterImpl(ITermsAndConditionsView view) {
        this.view = view;
    }

    @Override
    public void accept() {
        navigationFlow.navigateNext(view);
    }
}
