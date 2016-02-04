package com.example.hjc.ca;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class output_4 extends AppCompatActivity {
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
        setContentView(R.layout.activity_output_4);
        Intent intent=getIntent();
        wName = intent.getStringExtra(Choose_4.wName1);
        wUnit = intent.getStringExtra(Choose_4.wUnit1);
        outstr = intent.getStringExtra(Choose_4.outstr);
        double cal = Double.parseDouble(outstr);

        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        int weight = sp.getInt("weight", 150);

        for (int i = 0; i < 12; i ++){
            String t1 = new String(wName);
            String t2 = new String(workouts[i]);
            if (t1.equals(t2)){
                outnum = cal/((cals[i] / 150) * (double) weight);
                break;
            }
        }
        outstr = String.format("%.2f", outnum);


        TextView name = (TextView) findViewById(R.id.work_4);
        TextView unit = (TextView) findViewById(R.id.unit_4);
        TextView times = (TextView) findViewById(R.id.cal_num);


        name.append(wName);
        unit.append(wUnit);
        times.append(outstr);
    }




    public void backtomain(View view) {
        Intent intent = new Intent(this, Welcome.class);
        startActivity(intent);


    }
}
