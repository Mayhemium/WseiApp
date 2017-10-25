package com.example.matma123.wseiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.loginBtn)
    Button loginBtn;
    @BindView(R.id.loginInput)
    EditText loginInput;
    @BindView(R.id.passwordInput)
    EditText passwordInput;

    @OnClick(R.id.loginBtn)
    public void setLoginBtn() {
        startActivity(new Intent(MainActivity.this, MainScreen.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
