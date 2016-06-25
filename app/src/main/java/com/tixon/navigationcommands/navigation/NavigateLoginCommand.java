package com.tixon.navigationcommands.navigation;

import com.tixon.navigationcommands.activities.LoginActivity;
import com.tixon.navigationcommands.views.BaseView;

/**
 * Created by tikhon on 25.06.16
 */
public class NavigateLoginCommand implements NavigationCommand {

    BaseView view;

    public NavigateLoginCommand(BaseView view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.startActivity(LoginActivity.class);
    }
}
