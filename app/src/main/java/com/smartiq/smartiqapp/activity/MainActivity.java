package com.smartiq.smartiqapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.smartiq.smartiqapp.R;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.wizardFrame) FrameLayout wizardFrame;

    @Override
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        super.onViewReady(savedInstanceState, intent);

    }

    @Override
    protected int getContentView() {
        return R.layout.wizard;
    }
}
