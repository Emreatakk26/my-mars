package com.smartiq.smartiqapp.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    public SharedPreferences preferences;
    int width = 0, height = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN));
        //setContentView(getContentView());

        if (getSupportActionBar() != null)
            getSupportActionBar().hide();

        Display display = getWindowManager().getDefaultDisplay();
        width = display.getWidth();
        height = display.getHeight();

        ButterKnife.bind(this);

        onViewReady(savedInstanceState, getIntent());
    }

    @CallSuper
    protected  void onViewReady(Bundle savedInstanceState, Intent intent){

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    protected abstract int getContentView();
}
