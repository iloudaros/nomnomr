package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class Searchrestaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchrestaurant);

        ImageView button = findViewById(R.id.imageView28);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, Chosenshop.class);

            startActivity(intent);
        });
    }
}