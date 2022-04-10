package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.nio.channels.SelectionKey;

public class chooseplace extends AppCompatActivity {

float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseplace);




        ImageButton button = findViewById(R.id.imageButton2);

        button.setOnClickListener(view -> {

            Intent intent = new Intent(this, Matchfound.class);

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

                    Intent i = new Intent(chooseplace.this,Chooseplace2.class);
                    startActivity(i);

                } else if (x1>x2){
                   Intent i = new Intent(chooseplace.this, Matchfound.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }


}


