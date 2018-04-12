package com.example.magicsquare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3x3Activity extends AppCompatActivity {

    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3x3);


        Button one = (Button)findViewById(R.id.one);
        Button two = (Button)findViewById(R.id.two);
        Button three = (Button)findViewById(R.id.three);
        Button four = (Button)findViewById(R.id.four);
        Button five = (Button)findViewById(R.id.five);
        Button six = (Button)findViewById(R.id.six);
        Button seven = (Button)findViewById(R.id.seven);
        Button eight = (Button)findViewById(R.id.eight);
        Button nine = (Button)findViewById(R.id.nine);

        final Button onev = (Button)findViewById(R.id.onev);
        Button twov = (Button)findViewById(R.id.twov);
        Button threev = (Button)findViewById(R.id.threev);
        Button fourv = (Button)findViewById(R.id.fourv);
        Button fivev = (Button)findViewById(R.id.fivev);
        Button sixv = (Button)findViewById(R.id.sixv);
        Button sevenv = (Button)findViewById(R.id.sevenv);
        Button eightv = (Button)findViewById(R.id.eightv);
        Button ninev = (Button)findViewById(R.id.ninev);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x=1;
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x=2;
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x=3;
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               x=4;
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x=5;
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x=6;
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 x=7;
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x=8;
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x=9;
            }
        });

//x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
        onev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onev.setText(Integer.toString(x));
            }
        });










    }
}
