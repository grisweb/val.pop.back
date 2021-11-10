package com.example.laba1;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRecyclerViewAdapter extends
        RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {

    private List<String> mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public MyViewHolder(View v) {
            super(v);
            mTextView = v.findViewById(R.id.my_text_view);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Log.i("Click", "on item click");
                }
            });
        }
    }

    public MyRecyclerViewAdapter(List<String> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public MyRecyclerViewAdapter.MyViewHolder
    onCreateViewHolder(ViewGroup parent,
                       int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_item, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mTextView.setText(mDataset.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}