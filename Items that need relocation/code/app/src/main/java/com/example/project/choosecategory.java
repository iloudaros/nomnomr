package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.ImageButton;

public class choosecategory extends AppCompatActivity {
float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosecategory);

        ImageButton button = findViewById(R.id.imageButton8);

        button.setOnClickListener(view -> {

            Intent intent = new Intent(this, chooseplace.class);

            startActivity(intent);
        });
    }

        public boolean onTouchEvent(MotionEvent touchEvent){
            switch(touchEvent.getAction()){
                case MotionEvent.ACTION_DOWN:
                    x1 = touchEvent.getX();
                    y1 = touchEvent.getY();
                    break;
                case MotionEvent.ACTION_UP:
                    x2 = touchEvent.getX();
                    y2 = touchEvent.getY();
                    if(x1<x2){

                        Intent i = new Intent(choosecategory.this,choosecategoryasian.class);
                        startActivity(i);

                    } else if (x1>x2){
                        Intent i = new Intent(choosecategory.this, choosecategoryasian.class);
                        startActivity(i);
                    }
                    break;
            }
            return false;
        }
    }
