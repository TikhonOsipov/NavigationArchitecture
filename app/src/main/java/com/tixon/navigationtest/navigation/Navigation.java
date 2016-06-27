package com.tixon.navigationtest.navigation;

import com.tixon.navigationtest.views.IBaseView;

/**
 * Created by Tikhon on 26.06.2016
 */
public interface Navigation {
    void navigateNext(IBaseView view);
    void navigatePrev();
}
