package com.tixon.navigationtest.navigation;

import com.tixon.navigationtest.activities.LoginActivity;
import com.tixon.navigationtest.views.IBaseView;

/**
 * Created by Tikhon on 26.06.2016
 */
public class NavigateToLoginCommand implements Command {

    IBaseView view;

    public NavigateToLoginCommand(IBaseView view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.startActivity(LoginActivity.class);
    }
}
