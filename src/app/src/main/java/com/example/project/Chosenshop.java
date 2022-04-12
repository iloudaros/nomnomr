package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Chosenshop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosenshop);

        Button button = findViewById(R.id.button11);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, DecidePayment.class);

            startActivity(intent);
        });

    }
}