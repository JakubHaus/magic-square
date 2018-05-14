package com.example.magicsquare;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

enum ButtonStatus {
    ENABLED,
    DISABLED,
    SELECTED
}

public class Main3x3Activity extends AppCompatActivity {

    int x;
    int v1,v2,v3,v4,v5,v6,v7,v8,v9;
    boolean r1,r2,r3,s1,s2,s3,u1,u2;
    //int[][] answer = new int[3][3];
    Button[] buttons = new Button[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3x3);


        Button one = findViewById(R.id.one);
        buttons[0] = one;
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);
        Button four = findViewById(R.id.four);
        Button five = findViewById(R.id.five);
        Button six = findViewById(R.id.six);
        Button seven = findViewById(R.id.seven);
        Button eight = findViewById(R.id.eight);
        Button nine = findViewById(R.id.nine);


        Button Reset = findViewById(R.id.Reset);


         final Button onev = findViewById(R.id.onev);
         final Button twov = findViewById(R.id.twov);
         final Button threev = findViewById(R.id.threev);
         final Button fourv = findViewById(R.id.fourv);
         final Button fivev = findViewById(R.id.fivev);
         final Button sixv = findViewById(R.id.sixv);
         final Button sevenv = findViewById(R.id.sevenv);
         final Button eightv = findViewById(R.id.eightv);
         final Button ninev = findViewById(R.id.ninev);


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
            public void onClick(View view) {x=9;}
        });
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {x=0;}
        });

//x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
        onev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onev.setText(Integer.toString(x));
                v1=x;
                //buttons[x-1].setEnabled(false);
                applyButtonStatus(x, ButtonStatus.DISABLED);
                checkValues();

            }
        });
        twov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                twov.setText(Integer.toString(x));
                v2=x;
                checkValues();
            }
        });
        threev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                threev.setText(Integer.toString(x));
                v3=x;
                checkValues();
                //v3 = Integer.parseInt((String) threev.getText());
            }
        });
        fourv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fourv.setText(Integer.toString(x));
                v4=x;
                checkValues();
            }
        });
        fivev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fivev.setText(Integer.toString(x));
                v5=x;
                checkValues();
            }
        });sixv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sixv.setText(Integer.toString(x));
                v6=x;
                checkValues();
            }
        });
        sevenv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sevenv.setText(Integer.toString(x));
                v7=x;
                checkValues();
            }
        });
        eightv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eightv.setText(Integer.toString(x));
                v8=x;
                checkValues();
            }
        });
        ninev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ninev.setText(Integer.toString(x));
                v9=x;
                checkValues();
            }
        });


        //myButton.setEnabled(false);

    }

    public void checkValues() {
        if (v1+v2+v3==15) {
            r1=true;}
        if (v4+v5+v6==15) {
            r2=true;}
        if (v7+v8+v9==15) {
            r3=true;}
        if (v1+v4+v7==15) {
            s1=true;}
        if (v2+v5+v8==15) {
            s2 =true;}
        if (v3+v6+v9==15) {
            s3=true;}
        if (v3+v5+v7==15) {
            u1=true;}
        if (v1+v5+v9==15) {
            u2=true;}
    }


    public void applyButtonStatus(int position, ButtonStatus status) {
        switch (status) {
            case DISABLED:
                buttons[position-1].setEnabled(false);
                buttons[position-1].setTextColor(Color.RED);
                return;
            case ENABLED:
                buttons[position-1].setEnabled(true);
                return;
            case SELECTED:
                buttons[position-1].setBackgroundColor(Color.YELLOW);
                return;
            case DEFAULT:
                buttons[position-1].setEnabled(true);
                buttons[position-1].setBackgroundColor(Color.LTGRAY);
                return;
        }

    }






}



































