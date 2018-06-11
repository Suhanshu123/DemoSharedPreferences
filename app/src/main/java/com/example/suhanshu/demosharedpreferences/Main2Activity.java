package com.example.suhanshu.demosharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText user;
    EditText passw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        user =findViewById(R.id.username);
        passw=findViewById(R.id.password);
    }

    public void load(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("MyData", MODE_PRIVATE);
        String name = sharedPreferences.getString("name", "");
        String pass = sharedPreferences.getString("password", "");

        user.setText(name);
        passw.setText(pass);

    }

    public void gotoActivityA(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    public void openRV(View view) {
        startActivity(new Intent(getApplicationContext(), RecyclerViewActivity.class));
    }
}
