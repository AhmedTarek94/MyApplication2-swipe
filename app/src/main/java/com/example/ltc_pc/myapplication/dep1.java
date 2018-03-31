package com.example.ltc_pc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class dep1 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dep1);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("...dep");

       // TextView p1=(TextView)findViewById(R.id.textView8);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.textView8:
                Intent intent = new Intent(this,Viewer.class);
                intent.putExtra("url", " https://drive.google.com/file/d/1Glq0Ede9KKStaEQDiI9Lrc1VfTFeWXUB/view");
                startActivity(intent);
        }
    }
}
