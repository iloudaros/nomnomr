package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Matchfound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matchfound);

        TextView button = findViewById(R.id.textView3);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, Payment.class);

            startActivity(intent);
        });
        TextView newbutton = findViewById(R.id.textView8);

        newbutton.setOnClickListener(view -> {

            Intent intent = new Intent( this, Payment.class);

            startActivity(intent);
        });


    }
};