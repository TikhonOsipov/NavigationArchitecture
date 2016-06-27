package com.tixon.navigationtest.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tixon.navigationtest.views.IMainView;
import com.tixon.navigationtest.presenters.MainPresenterImpl;
import com.tixon.navigationtest.R;
import com.tixon.navigationtest.dagger.components.DaggerIMainActivityComponent;
import com.tixon.navigationtest.dagger.components.IAppComponent;
import com.tixon.navigationtest.dagger.components.IMainActivityComponent;
import com.tixon.navigationtest.dagger.modules.MainActivityModule;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements IMainView {

    private IMainActivityComponent component;

    @Inject
    MainPresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.buttonGoToLogin);
        assert button != null;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.startLogin();
            }
        });
    }

    @Override
    public void setupComponent(IAppComponent appComponent) {
        component = DaggerIMainActivityComponent.builder()
                .iAppComponent(appComponent)
                .mainActivityModule(new MainActivityModule(this))
                .build();
        component.inject(this);
    }

    @Override
    public void startActivity(Class<?> cls) {
        startActivity(new Intent(MainActivity.this, cls));
    }
}
