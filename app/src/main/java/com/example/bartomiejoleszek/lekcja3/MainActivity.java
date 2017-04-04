package com.example.bartomiejoleszek.lekcja3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void Change(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Wcisnieto przycisk 1");
    }

    public void Change2(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Wcisnieto przycisk 2");
    }

    public void Change3(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Wcisnieto przycisk 3");
    }

    public void Change4(View view) {
        Context context;
        context = getApplicationContext();
        Intent intent = new Intent(context,Obrazek.class);
        startActivity(intent);
    }}
