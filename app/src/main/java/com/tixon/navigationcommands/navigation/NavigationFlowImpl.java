package com.tixon.navigationcommands.navigation;

import com.tixon.navigationcommands.views.BaseView;

import javax.inject.Inject;

/**
 * Created by tikhon on 24.06.16
 */
public class NavigationFlowImpl implements INavigationFlow {

    private enum Node {
        Home,
        Login,
        TermsAndConditions
    }

    private Node currentNode;

    /*NavigateHomeCommand navigateHomeCommand;
    NavigateLoginCommand navigateLoginCommand;
    NavigateTermsAndConditionsCommand navigateTermsAndConditionsCommand;*/

    @Inject
    public NavigationFlowImpl() {
        currentNode = Node.Home;
        //navigateHomeCommand = new NavigateHomeCommand();
    }

    @Override
    public void navigateNext(BaseView view) {
        switch (currentNode) {
            case Home:
                new NavigateLoginCommand(view).execute();
                currentNode = Node.Login;
                break;
            case Login:
                new NavigateTermsAndConditionsCommand(view).execute();
                currentNode = Node.TermsAndConditions;
                break;
            case TermsAndConditions:
                new NavigateHomeCommand(view).execute();
                currentNode = Node.Home;
                break;
            default: break;
        }
    }

    @Override
    public void navigatePrev(BaseView view) {
        switch (currentNode) {
            case Home:
                break;
            case Login:
                new NavigateHomeCommand(view).execute();
                currentNode = Node.Home;
                break;
            case TermsAndConditions:
                new NavigateHomeCommand(view).execute();
                currentNode = Node.Home;
                break;
            default: break;
        }
    }
}
