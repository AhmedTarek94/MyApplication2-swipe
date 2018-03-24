package com.example.ltc_pc.myapplication;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class sample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Paper Viewer");
    }
}
