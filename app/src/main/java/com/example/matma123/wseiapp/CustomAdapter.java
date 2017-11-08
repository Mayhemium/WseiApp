package com.example.matma123.wseiapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by tomasz.matusik on 08.11.2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    List<Post> postList = new ArrayList<>();

    public CustomAdapter(List<Post> postList) {
        this.postList = postList;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.titleText)
        TextView titleText;
        @BindView(R.id.contentText)
        TextView contentText;

        public CustomViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row, parent, false);
        return new CustomViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

        holder.titleText.setText(postList.get(position).title);
        holder.contentText.setText(postList.get(position).content);
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }
}
