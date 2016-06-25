package com.tixon.navigationcommands.navigation;

import com.tixon.navigationcommands.activities.MainActivity;
import com.tixon.navigationcommands.views.BaseView;

/**
 * Created by tikhon on 24.06.16
 */
public class NavigateHomeCommand implements NavigationCommand {

    BaseView view;

    public NavigateHomeCommand(BaseView view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.startActivity(MainActivity.class);
    }
}
