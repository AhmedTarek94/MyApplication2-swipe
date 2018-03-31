package com.example.ltc_pc.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class dep4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dep4);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("...dep");
    }
}
