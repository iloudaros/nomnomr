package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class AddNewAddress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_address);

        ImageButton button = findViewById(R.id.imageButton1);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, Findaddress.class);

            startActivity(intent);
        });
    }
}