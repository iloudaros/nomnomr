package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class EditAddress extends AppCompatActivity {

Button btn;
EditText et;
String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_address);

        Button button = findViewById(R.id.button8);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, AddNewAddress.class);

            startActivity(intent);
        });

        RadioButton button2 = findViewById(R.id.radioButton2);

        button2.setOnClickListener(view -> {

            Intent intent = new Intent( this, MainActivity.class);

            startActivity(intent);
        });

        RadioButton button3 = findViewById(R.id.radioButton3);

        button3.setOnClickListener(view -> {

            Intent intent = new Intent( this, MainActivity.class);

            startActivity(intent);
        });

        RadioButton button4 = findViewById(R.id.radioButton4);


        button4.setOnClickListener(view -> {
          Intent i= new Intent(EditAddress.this,MainActivity.class);

            Intent intent = new Intent( this, MainActivity.class);

            startActivity(intent);

        });

    }
}