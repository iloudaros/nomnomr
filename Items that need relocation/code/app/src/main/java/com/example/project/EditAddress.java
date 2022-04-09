package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class EditAddress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_address);

        Button nextbutto = findViewById(R.id.button8);

        nextbutto.setOnClickListener(view -> {

            Intent intent = new Intent( this, AddNewAddress.class);

            startActivity(intent);
        });
    }
}