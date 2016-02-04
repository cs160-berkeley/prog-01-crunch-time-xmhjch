package com.example.hjc.ca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Input_2 extends AppCompatActivity {
    public static double outnum = 0;
    public static String outstr = "";
    public static String wName;
    public static String wUnit;
    public static String wTime;
    String[] workouts = {"Pushup", "Situp", "Jumping Jacks", "Jogging", "Squats", "Leg-lift",
            "Plank", "Pullup", "Cycling", "Walking", "Swimming", "Stair-Climbing"};
    double[] cals = {0.28571429, 0.5, 10, 8.33333, 0.44444, 4, 4, 1, 8.33333, 5, 7.6923077, 6.66667};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_2);

        Intent intent=getIntent();
        wName = intent.getStringExtra(Choose_w_2.wName1);
        wUnit = intent.getStringExtra(Choose_w_2.wUnit1);


        TextView name = (TextView) findViewById(R.id.input_w_2);
        TextView unit = (TextView) findViewById(R.id.input_u_2);


        name.append(wName);
        unit.append(wUnit);
    }


    public void choose3(View view) {
        Intent intent = new Intent(this, Choose_w_3.class);
        EditText editText = (EditText) findViewById(R.id.input_2);
        String num = editText.getText().toString();
        wTime = num;
        double times = Double.parseDouble(num);

        for (int i = 0; i < 12; i ++){
            String t1 = new String(wName);
            String t2 = new String(workouts[i]);
            if (t1.equals(t2)){
                outnum = cals[i] * times;
                break;
            }
        }

        outstr = String.format("%.2f", outnum);

        intent.putExtra(outstr, outstr);
        intent.putExtra(wName, wName);
        intent.putExtra(wUnit, wUnit);
        intent.putExtra(wTime, wTime);

        startActivity(intent);
    }
}
