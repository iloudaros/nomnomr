package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class DecidePayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decide_payment);

        Spinner mySpiner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(DecidePayment.this,android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Pliromi));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mySpiner.setAdapter(myAdapter);

        Button button = findViewById(R.id.button7);

        button.setOnClickListener(view -> {

            Intent intent = new Intent( this, OrderAccepted.class);

            startActivity(intent);
        });
    }
}