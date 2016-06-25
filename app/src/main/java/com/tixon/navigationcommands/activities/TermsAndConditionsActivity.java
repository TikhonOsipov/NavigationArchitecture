package com.tixon.navigationcommands.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.tixon.navigationcommands.R;
import com.tixon.navigationcommands.dagger.components.DaggerITermsAndConditionsComponent;
import com.tixon.navigationcommands.dagger.components.IAppComponent;
import com.tixon.navigationcommands.dagger.components.ITermsAndConditionsComponent;
import com.tixon.navigationcommands.dagger.modules.TermsAndConditionsActivityModule;
import com.tixon.navigationcommands.databinding.ActivityTermsAndConditionsBinding;
import com.tixon.navigationcommands.presenters.TermsAndConditionsPresenterImpl;
import com.tixon.navigationcommands.views.ITermsAndConditionsView;

import javax.inject.Inject;

/**
 * Created by tikhon on 24.06.16
 */
public class TermsAndConditionsActivity extends BaseActivity implements ITermsAndConditionsView {

    @Inject
    TermsAndConditionsPresenterImpl presenter;

    ActivityTermsAndConditionsBinding binding;

    ITermsAndConditionsComponent component;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_terms_and_conditions);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void setupComponent(IAppComponent appComponent) {
        component = DaggerITermsAndConditionsComponent.builder()
                .iAppComponent(appComponent)
                .termsAndConditionsActivityModule(new TermsAndConditionsActivityModule(this))
                .build();
        component.inject(this);
    }

    @Override
    public void startActivity(Class<?> cls) {
        startActivity(new Intent(TermsAndConditionsActivity.this, cls));
    }
}
