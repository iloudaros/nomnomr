package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Paraggeliesmou extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paraggeliesmou);

        TextView button = findViewById(R.id.textView3);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, MainActivity.class);

            startActivity(intent);
        });

        ImageButton imagebutton = findViewById(R.id.imageButton11);

        imagebutton.setOnClickListener(view -> {

            Intent intent = new Intent( this, Review.class);

            startActivity(intent);
        });
    }
}