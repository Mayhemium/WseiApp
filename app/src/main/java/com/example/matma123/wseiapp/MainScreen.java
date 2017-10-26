package com.example.matma123.wseiapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainScreen extends AppCompatActivity {

    @BindView(R.id.addFab)
    FloatingActionButton addFab;

    @OnClick(R.id.addFab)
    public void setAddFab(){
        startActivity(new Intent(MainScreen.this,AddScreen.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        ButterKnife.bind(this);
    }
}
