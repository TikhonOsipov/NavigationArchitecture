package com.tixon.navigationtest.navigation;

import com.tixon.navigationtest.activities.MainActivity;
import com.tixon.navigationtest.views.IBaseView;

/**
 * Created by Tikhon on 26.06.2016
 */
public class NavigateToMainCommand implements Command {

    IBaseView view;

    public NavigateToMainCommand(IBaseView view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.startActivity(MainActivity.class);
    }
}
