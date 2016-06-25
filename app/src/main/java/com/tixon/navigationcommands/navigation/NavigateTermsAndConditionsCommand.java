package com.tixon.navigationcommands.navigation;

import com.tixon.navigationcommands.activities.TermsAndConditionsActivity;
import com.tixon.navigationcommands.views.BaseView;

/**
 * Created by tikhon on 25.06.16
 */
public class NavigateTermsAndConditionsCommand implements NavigationCommand {

    BaseView view;

    public NavigateTermsAndConditionsCommand(BaseView view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.startActivity(TermsAndConditionsActivity.class);
    }
}
