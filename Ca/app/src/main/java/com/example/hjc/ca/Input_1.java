package com.example.hjc.ca;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Input_1 extends AppCompatActivity {
    public static double outnum = 0;
    public static String outstr = "";
    public static String wName;
    public static String wUnit;

    String[] workouts = {"Pushup", "Situp", "Jumping Jacks", "Jogging", "Squats", "Leg-lift",
                            "Plank", "Pullup", "Cycling", "Walking", "Swimming", "Stair-Climbing"};
    double[] cals = {0.28571429, 0.5, 10, 8.33333, 0.44444, 4, 4, 1, 8.33333, 5, 7.6923077, 6.66667};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_1);

        Intent intent=getIntent();
        wName = intent.getStringExtra(Choose_w_1.wName1);
        wUnit = intent.getStringExtra(Choose_w_1.wUnit1);


        TextView name = (TextView) findViewById(R.id.input_w_1);
        TextView unit = (TextView) findViewById(R.id.input_u_1);


        name.append(wName);
        unit.append(wUnit);
    }


    public void output1(View view) {
        Intent intent = new Intent(this, output_1.class);
        EditText editText = (EditText) findViewById(R.id.input_1);
        String num = editText.getText().toString();
        double times = Double.parseDouble(num);

        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        int weight = sp.getInt("weight", 150);


        for (int i = 0; i < 12; i ++){
            String t1 = new String(wName);
            String t2 = new String(workouts[i]);
            if (t1.equals(t2)){
                outnum = ((cals[i] * times) / 150) * (double) weight;
                break;
            }
        }

        outstr = String.format("%.2f", outnum);

        intent.putExtra(outstr, outstr);

        startActivity(intent);
    }
}
