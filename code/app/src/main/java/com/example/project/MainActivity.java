package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button1);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, choosecategory.class);

            startActivity(intent);
        });

            ImageButton newbutton = findViewById(R.id.imageButton4);

            newbutton.setOnClickListener(view -> {

                Intent intent = new Intent( this, Address.class);

                startActivity(intent);


        });
}

};