package com.example.suhanshu.demosharedpreferences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView = findViewById(R.id.recycler_view);

        SharedPreferences sharedPreferences = getSharedPreferences("MyData", MODE_PRIVATE);
        String name = sharedPreferences.getString("name", "");
        String pass = sharedPreferences.getString("password", "");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        List<ModelClass> model_list=new ArrayList<>();
        ModelClass modelClass =new ModelClass(name,pass);
        model_list.add(modelClass);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(model_list);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);





        recyclerViewAdapter.notifyDataSetChanged();


    }
}
