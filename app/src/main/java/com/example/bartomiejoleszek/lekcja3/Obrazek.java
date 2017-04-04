package com.example.bartomiejoleszek.lekcja3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.bartomiejoleszek.lekcja3.R.id.imageView2;

/**
 * Created by Bartłomiej Oleszek on 01.04.2017.
 */

public class Obrazek extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obrazek);


    }

    public void zmien(View v)
    {
        ImageView imageView = (ImageView) findViewById(imageView2);
        imageView.setImageResource(R.mipmap.android2);

    }

    public void poprzedni(View v)
    {
        ImageView imageView = (ImageView) findViewById(imageView2);
        imageView.setImageResource(R.mipmap.android);

    }

    public void powrót(View v)
    {
        Context context;
        context = getApplicationContext();
        Intent intent = new Intent(context,MainActivity.class);
        startActivity(intent);

    }

}

