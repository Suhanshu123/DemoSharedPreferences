package com.example.suhanshu.demosharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText username_edit;
    private EditText password_edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username_edit = findViewById(R.id.username);
        password_edit = findViewById(R.id.password);
    }

    public void saveData(View view) {

        SharedPreferences sharedPreferences=getSharedPreferences("MyData",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("name",username_edit.getText().toString());
        editor.putString("password",password_edit.getText().toString());
        editor.commit();

    }

    public void gotoActivityB(View view) {
        startActivity(new Intent(getApplicationContext(), Main2Activity.class));
    }
}
