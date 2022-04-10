package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

TextView tv;
String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button1);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, Paraggelnwsolo.class);

            startActivity(intent);
        });

            ImageButton newbutton = findViewById(R.id.imageButton4);

            newbutton.setOnClickListener(view -> {

                Intent intent = new Intent( this, EditAddress.class);

                startActivity(intent);

        });

        Button nextbutton = findViewById(R.id.button3);

        nextbutton.setOnClickListener(view -> {

            Intent intent = new Intent( this, CreateRoom.class);

            startActivity(intent);
        });

        Button nexttbutton = findViewById(R.id.button5);

        nexttbutton.setOnClickListener(view -> {

            Intent intent = new Intent( this, JoinRoom.class);

            startActivity(intent);
        });

}

};