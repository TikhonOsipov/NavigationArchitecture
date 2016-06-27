package com.tixon.navigationtest.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.tixon.navigationtest.R;
import com.tixon.navigationtest.dagger.components.DaggerITermsActivityComponent;
import com.tixon.navigationtest.dagger.components.IAppComponent;
import com.tixon.navigationtest.dagger.components.ITermsActivityComponent;
import com.tixon.navigationtest.dagger.modules.TermsActivityModule;
import com.tixon.navigationtest.presenters.TermsPresenterImpl;
import com.tixon.navigationtest.views.ITermsView;

import javax.inject.Inject;

/**
 * Created by Tikhon on 26.06.2016
 */
public class TermsActivity extends BaseActivity implements ITermsView {

    ITermsActivityComponent component;

    @Inject
    TermsPresenterImpl presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

        Button acceptButton = (Button) findViewById(R.id.buttonAccept);
        assert acceptButton != null;

        acceptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.accept();
            }
        });
    }

    @Override
    public void setupComponent(IAppComponent appComponent) {
        component = DaggerITermsActivityComponent.builder()
                .iAppComponent(appComponent)
                .termsActivityModule(new TermsActivityModule(this))
                .build();
        component.inject(this);
    }

    @Override
    public void startActivity(Class<?> cls) {
        startActivity(new Intent(TermsActivity.this, cls));
    }
}
