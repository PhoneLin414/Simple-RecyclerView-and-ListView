package com.pla.simplerecyclerviewandlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.pla.simplerecyclerviewandlistview.adapters.ListViewAdapter;
import com.pla.simplerecyclerviewandlistview.adapters.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> stringList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stringList.add("apple");
        stringList.add("ant");
        stringList.add("ball");
        stringList.add("bell");
        stringList.add("cup");


        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(stringList,this);
        ListViewAdapter listViewAdapter = new ListViewAdapter(this,stringList);

        RecyclerView recyclerView = findViewById(R.id.rv);
        ListView listView = findViewById(R.id.lv);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);

        listView.setAdapter(listViewAdapter);


    }
}
