package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class choosecategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosecategory);

        ImageButton button = findViewById(R.id.imageButton9);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, chooseplace.class);

            startActivity(intent);
        });
    }
}