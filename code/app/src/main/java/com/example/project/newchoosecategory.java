package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class newchoosecategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newchoosecategory);

        ImageButton button = findViewById(R.id.imageButton1);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, katastimata.class);

            startActivity(intent);
        });

        ImageButton button2 = findViewById(R.id.imageButton2);

        button2.setOnClickListener(view -> {

            Intent intent = new Intent( this, katastimata.class);

            startActivity(intent);
        });

        ImageButton button3 = findViewById(R.id.imageButton3);

        button3.setOnClickListener(view -> {

            Intent intent = new Intent( this, katastimata.class);

            startActivity(intent);
        });
    }
}