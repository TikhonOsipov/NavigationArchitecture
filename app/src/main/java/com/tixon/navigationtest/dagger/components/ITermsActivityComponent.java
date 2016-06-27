package com.tixon.navigationtest.dagger.components;

import com.tixon.navigationtest.activities.TermsActivity;
import com.tixon.navigationtest.dagger.modules.TermsActivityModule;
import com.tixon.navigationtest.dagger.scopes.ActivityScope;

import dagger.Component;

/**
 * Created by Tikhon on 26.06.2016
 */
@ActivityScope
@Component(dependencies = IAppComponent.class, modules = TermsActivityModule.class)
public interface ITermsActivityComponent {
    void inject(TermsActivity activity);
}
