package com.example.matma123.wseiapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainScreen extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @BindView(R.id.addFab)
    FloatingActionButton addFab;

    List<Post> postList = new ArrayList<>();

    @OnClick(R.id.addFab)
    public void setAddFab(){
        startActivity(new Intent(MainScreen.this,AddScreen.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        ButterKnife.bind(this);

        Post p = new Post("title", "content");
        postList.add(p);

        CustomAdapter adapter = new CustomAdapter(postList);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(lm);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }
}
