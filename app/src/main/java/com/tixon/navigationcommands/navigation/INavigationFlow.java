package com.tixon.navigationcommands.navigation;

import com.tixon.navigationcommands.views.BaseView;

/**
 * Created by tikhon on 24.06.16
 */
public interface INavigationFlow {
    void navigateNext(BaseView view);
    void navigatePrev(BaseView view);
}
