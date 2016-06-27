package com.tixon.navigationtest.navigation;

import android.util.Log;

import com.tixon.navigationtest.views.IBaseView;

import javax.inject.Inject;

/**
 * Created by Tikhon on 25.06.2016
 */
public class NavigationFlow implements Navigation {

    enum Node {
        Main,
        Login,
        Terms;
    }

    Node currentNode;

    @Inject
    public NavigationFlow() {
        currentNode = Node.Main;
    }

    @Override
    public void navigateNext(IBaseView view) {
        Log.d("myLogs", "currentNode = " + currentNode.toString());
        switch (currentNode) {
            case Main:
                new NavigateToLoginCommand(view).execute();
                currentNode = Node.Login;
                break;
            case Login:
                new NavigateToTermsCommand(view).execute();
                currentNode = Node.Terms;
                break;
            case Terms:
                new NavigateToMainCommand(view).execute();
                currentNode = Node.Main;
                break;
            default: break;
        }
        Log.d("myLogs", "navigatedNode = " + currentNode.toString());
    }

    @Override
    public void navigatePrev() {

    }
}
