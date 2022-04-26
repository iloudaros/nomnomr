package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Findaddress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findaddress);

        Button button2 = findViewById(R.id.button2);

        button2.setOnClickListener(view -> {

            Intent intent = new Intent( this, MainActivity.class);

            startActivity(intent);
        });

        Button button = findViewById(R.id.button1);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, EnterAddress.class);

            startActivity(intent);
        });
    }
}