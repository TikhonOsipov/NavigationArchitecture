package com.tixon.navigationtest.navigation;

import com.tixon.navigationtest.activities.TermsActivity;
import com.tixon.navigationtest.views.IBaseView;

/**
 * Created by Tikhon on 26.06.2016
 */
public class NavigateToTermsCommand implements Command {

    IBaseView view;

    public NavigateToTermsCommand(IBaseView view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.startActivity(TermsActivity.class);
    }
}
