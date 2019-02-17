package com.pla.simplerecyclerviewandlistview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.pla.simplerecyclerviewandlistview.R;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {

    Context context;
    List<String> strings;

    public ListViewAdapter(Context context, List<String> strings) {
        this.context = context;
        this.strings = strings;
    }

    @Override
    public int getCount() {
        return strings.size();
    }

    @Override
    public Object getItem(int i) {
        return strings.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null){

            view = LayoutInflater.from(context).inflate(R.layout.listitemview,viewGroup,false);

        }


        TextView textView = view.findViewById(R.id.txt_view);

        textView.setText(strings.get(position));


        return view;
    }
}
