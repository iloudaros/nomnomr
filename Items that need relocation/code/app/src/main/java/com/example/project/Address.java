package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Address extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        Button button = findViewById(R.id.button8);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, Newaddress.class);

            startActivity(intent);
        });
    }
}