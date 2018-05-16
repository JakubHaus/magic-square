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

    int x = 0;
    int v1,v2,v3,v4,v5,v6,v7,v8,v9;
    boolean r1,r2,r3,s1,s2,s3,u1,u2;
    //int[][] answer = new int[3][3];
    Button[] buttons = new Button[9];
    Button[] views = new Button[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3x3);


        Button one = findViewById(R.id.one);
        buttons[0] = one;
        final Button two = findViewById(R.id.two);
        buttons[1] = two;
        final Button three = findViewById(R.id.three);
        buttons[2] = three;
        Button four = findViewById(R.id.four);
        buttons[3] = four;
        Button five = findViewById(R.id.five);
        buttons[4] = five;
        final Button six = findViewById(R.id.six);
        buttons[5] = six;
        Button seven = findViewById(R.id.seven);
        buttons[6] = seven;
        final Button eight = findViewById(R.id.eight);
        buttons[7] = eight;
        Button nine = findViewById(R.id.nine);
        buttons[8] = nine;

        Button reset = findViewById(R.id.Reset);

        final Button onev = findViewById(R.id.onev);
        views[0] = onev;
        final Button twov = findViewById(R.id.twov);
        views[1] = twov;
        final Button threev = findViewById(R.id.threev);
        views[2] = threev;
        final Button fourv = findViewById(R.id.fourv);
        views[3] = fourv;
        final Button fivev = findViewById(R.id.fivev);
        views[4] = fivev;
        final Button sixv = findViewById(R.id.sixv);
        views[5] = sixv;
        final Button sevenv = findViewById(R.id.sevenv);
        views[6] = sevenv;
        final Button eightv = findViewById(R.id.eightv);
        views[7] = eightv;
        final Button ninev = findViewById(R.id.ninev);
        views[8] = ninev;


        one.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                x=1;
                applyButtonStatus(x, ButtonStatus.SELECTED);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x=2;
                applyButtonStatus(x, ButtonStatus.SELECTED);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x=3;
                applyButtonStatus(x, ButtonStatus.SELECTED);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               x=4;
                applyButtonStatus(x, ButtonStatus.SELECTED);

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x=5;
                applyButtonStatus(x, ButtonStatus.SELECTED);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x=6;
                applyButtonStatus(x, ButtonStatus.SELECTED);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 x=7;
                applyButtonStatus(x, ButtonStatus.SELECTED);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x=8;
                applyButtonStatus(x, ButtonStatus.SELECTED);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {x=9;
                applyButtonStatus(x, ButtonStatus.SELECTED);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
//                for(int i=0; i<buttons.length; i++){
//
//                }

                for (Button item : buttons) {
                    setStatus(item, ButtonStatus.ENABLED);
                }

                for (Button item : views) {
                    item.setText("");
                }

            }
        });

//x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
        onev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (x > 0 && onev.getText() == "") {
                    onev.setText(Integer.toString(x));
                    v1 = x;
                    applyButtonStatus(x, ButtonStatus.DISABLED);
                    checkValues();
                    x = 0;
                } else if (onev.getText() != "") {
                    int x = Integer.parseInt((String) onev.getText());
                    onev.setText("");
                    applyButtonStatus(x, ButtonStatus.ENABLED);
                }
            }
        });
        twov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (x > 0 && twov.getText() == "") {
                    twov.setText(Integer.toString(x));
                    v2 = x;
                    applyButtonStatus(x, ButtonStatus.DISABLED);
                    checkValues();
                    x = 0;
                } else if (twov.getText() != "") {
                    int x = Integer.parseInt((String) twov.getText());
                    twov.setText("");
                    applyButtonStatus(x, ButtonStatus.ENABLED);
                }
            }
        });
        threev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (x > 0 && threev.getText() == "") {
                    threev.setText(Integer.toString(x));
                    v3 = x;
                    applyButtonStatus(x, ButtonStatus.DISABLED);
                    checkValues();
                    x = 0;
                } else if (threev.getText() != "") {
                    int x = Integer.parseInt((String) threev.getText());
                    threev.setText("");
                    applyButtonStatus(x, ButtonStatus.ENABLED);
                }
            }
        });
        fourv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (x > 0 && fourv.getText() == "") {
                    fourv.setText(Integer.toString(x));
                    v4 = x;
                    applyButtonStatus(x, ButtonStatus.DISABLED);
                    checkValues();
                    x = 0;
                } else if (fourv.getText() != "") {
                    int x = Integer.parseInt((String) fourv.getText());
                    fourv.setText("");
                    applyButtonStatus(x, ButtonStatus.ENABLED);
                }
            }
        });
        fivev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (x > 0 && fivev.getText() == "") {
                    fivev.setText(Integer.toString(x));
                    v5 = x;
                    applyButtonStatus(x, ButtonStatus.DISABLED);
                    checkValues();
                    x = 0;
                } else if (fivev.getText() != "") {
                    int x = Integer.parseInt((String) fivev.getText());
                    fivev.setText("");
                    applyButtonStatus(x, ButtonStatus.ENABLED);
                }
            }
        });
        sixv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (x > 0 && sixv.getText() == "") {
                    sixv.setText(Integer.toString(x));
                    v6 = x;
                    applyButtonStatus(x, ButtonStatus.DISABLED);
                    checkValues();
                    x = 0;
                } else if (sixv.getText() != "") {
                    int x = Integer.parseInt((String) sixv.getText());
                    sixv.setText("");
                    applyButtonStatus(x, ButtonStatus.ENABLED);
                }
            }
        });
        sevenv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (x > 0 && sevenv.getText() == "") {
                    sevenv.setText(Integer.toString(x));
                    v7 = x;
                    applyButtonStatus(x, ButtonStatus.DISABLED);
                    checkValues();
                    x = 0;
                } else if (sevenv.getText() != "") {
                    int x = Integer.parseInt((String) sevenv.getText());
                    sevenv.setText("");
                    applyButtonStatus(x, ButtonStatus.ENABLED);
                }
            }
        });
        eightv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (x > 0 && eightv.getText() == "") {
                    eightv.setText(Integer.toString(x));
                    v8 = x;
                    applyButtonStatus(x, ButtonStatus.DISABLED);
                    checkValues();
                    x = 0;
                } else if (eightv.getText() != "") {
                    int x = Integer.parseInt((String) eightv.getText());
                    eightv.setText("");
                    applyButtonStatus(x, ButtonStatus.ENABLED);
                }
            }
        });
        ninev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (x > 0 && ninev.getText() == "") {
                    ninev.setText(Integer.toString(x));
                    v9 = x;
                    applyButtonStatus(x, ButtonStatus.DISABLED);
                    checkValues();
                    x = 0;
                } else if (ninev.getText() != "") {
                    int x = Integer.parseInt((String) ninev.getText());
                    ninev.setText("");
                    //applyButtonStatus(x, ButtonStatus.ENABLED);
                    applyButtonStatus(x, ButtonStatus.ENABLED);
                }
            }
        });


        //myButton.setEnabled(false);

    }

    private void checkValues() {
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
        if (r1 && r2 && r3 && s1&& s2&& s3&& u1 && u2) {
            Button reset = findViewById(R.id.Reset);
            reset.setText("Hura");
        }
    }

    public void applyButtonStatus(int position, ButtonStatus status) {
        if (buttons.length >= position) {
            switch (status) {
                case DISABLED:
                    buttons[position - 1].setEnabled(false);
                    buttons[position - 1].setTextColor(Color.RED);
                    return;
                case ENABLED:
                    buttons[position - 1].setEnabled(true);
                    buttons[position - 1].setTextColor(Color.BLACK);
                    return;
                case SELECTED:
                    buttons[position - 1].setTextColor(Color.GREEN);
                    return;
            }
        }
    }

    public void setStatus(Button button, ButtonStatus status) {
        switch (status) {
            case DISABLED:
                button.setEnabled(false);
                button.setTextColor(Color.RED);
                return;
            case ENABLED:
                button.setEnabled(true);
                button.setTextColor(Color.BLACK);
                return;
            case SELECTED:
                button.setTextColor(Color.GREEN);
                return;
        }
    }

}



































