package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Nolikes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nolikes);

        TextView newbutton = findViewById(R.id.textView3);

        newbutton.setOnClickListener(view -> {

            Intent intent = new Intent( this, Paraggelnwsolo.class);

            startActivity(intent);
        });
    }
}