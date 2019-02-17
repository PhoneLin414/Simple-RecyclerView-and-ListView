package com.pla.simplerecyclerviewandlistview.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.pla.simplerecyclerviewandlistview.R;
import com.pla.simplerecyclerviewandlistview.ViewHolder;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {


    List<String> stringList;
    Context context;

    public RecyclerViewAdapter(List<String> stringList, Context context) {
        this.stringList = stringList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.listitemview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textView.setText(stringList.get(position));

    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

}
