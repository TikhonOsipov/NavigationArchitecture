package com.tixon.navigationcommands.dagger.components;

import com.tixon.navigationcommands.activities.TermsAndConditionsActivity;
import com.tixon.navigationcommands.dagger.ActivityScope;
import com.tixon.navigationcommands.dagger.modules.TermsAndConditionsActivityModule;

import dagger.Component;

/**
 * Created by tikhon on 24.06.16
 */
@ActivityScope
@Component(dependencies = IAppComponent.class, modules = TermsAndConditionsActivityModule.class)
public interface ITermsAndConditionsComponent {
    void inject(TermsAndConditionsActivity activity);
}
