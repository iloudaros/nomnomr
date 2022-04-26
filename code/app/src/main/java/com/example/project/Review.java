package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Review extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        Button button = findViewById(R.id.button6);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, MainActivity.class);

            startActivity(intent);
        });
    }
}