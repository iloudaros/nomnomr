package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class chosencategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosencategory);

        Button button = findViewById(R.id.button1);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, chooseplace.class);

            startActivity(intent);
        });
    }
}