package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class chooseplace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseplace);

        ImageButton button = findViewById(R.id.imageButton2);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, Matchfound.class);

            startActivity(intent);
        });
    }
    };


