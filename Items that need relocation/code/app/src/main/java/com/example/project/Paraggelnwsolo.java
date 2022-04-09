package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class Paraggelnwsolo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paraggelnwsolo);

        ImageButton button = findViewById(R.id.imageButton7);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, newchoosecategory.class);

            startActivity(intent);
        });


    }
}