package com.example.houshuai.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //这两句为关键所在   第一个是使状态栏透明化    第二个是使窗体不受限制
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        //-----------------------------------------------------
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar viewById = (Toolbar) findViewById(R.id.toolbar);
        viewById.setTitle("nihao");
        setSupportActionBar(viewById);
    }
}
