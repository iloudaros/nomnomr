package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class EnterAddress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_address);

        Button button = findViewById(R.id.button2);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, Findaddress.class);

            startActivity(intent);
        });
    }
}