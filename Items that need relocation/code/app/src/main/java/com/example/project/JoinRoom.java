package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class JoinRoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_room);

        Button button = findViewById(R.id.button1);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, Peoplejoin.class);

            startActivity(intent);
        });
    }
}