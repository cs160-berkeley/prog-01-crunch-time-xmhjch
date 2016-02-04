package com.example.hjc.ca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Choose_w_3 extends AppCompatActivity {

    public static String wName1;
    public static String wUnit1;
    public static String wName2 = "";
    public static String wUnit2;
    public static String wTime1;
    public static String wTime2;
    public static String outstr;
    public static double num;
    String[] workouts = {"Pushup", "Situp", "Jumping Jacks", "Jogging", "Squats", "Leg-lift",
            "Plank", "Pullup", "Cycling", "Walking", "Swimming", "Stair-Climbing"};
    double[] cals = {0.28571429, 0.5, 10, 8.33333, 0.44444, 4, 4, 1, 8.33333, 5, 7.6923077, 6.66667};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_w_3);

        Intent intent1=getIntent();
        outstr = intent1.getStringExtra(Input_2.outstr);
        wName1 = intent1.getStringExtra(Input_2.wName);
        wUnit1 = intent1.getStringExtra(Input_2.wUnit);
        wTime1 = intent1.getStringExtra(Input_2.wTime);


    }

    public void clickPS_1(View view) {


        double ts =  Double.parseDouble(outstr);
        for (int i = 0; i < 12; i ++){
            String t1 = new String("Pushup");
            String t2 = new String(workouts[i]);
            if (t1.equals(t2)){
                num = ts/cals[i];
                break;
            }
        }
        wTime2 = String.format("%.2f", num);
        Intent intent = new Intent(this, output_2.class);
        intent.putExtra(wName1, wName1);
        intent.putExtra(wUnit1, wUnit1);
        intent.putExtra(wTime1, wTime1);
        intent.putExtra(wName2, "Pushup");
        intent.putExtra(wUnit2, "Reps");
        intent.putExtra(wTime2, wTime2);

        startActivity(intent);
    }

    public void clickSU_1(View view) {

        double ts =  Double.parseDouble(outstr);
        for (int i = 0; i < 12; i ++){
            String t1 = new String("Situp");
            String t2 = new String(workouts[i]);
            if (t1.equals(t2)){
                num = ts/cals[i];
                break;
            }
        }
        wTime2 = String.format("%.2f", num);
        Intent intent = new Intent(this, output_2.class);
        intent.putExtra(wName1, wName1);
        intent.putExtra(wUnit1, wUnit1);
        intent.putExtra(wTime1, wTime1);

        intent.putExtra(wName2, "Situp");
        intent.putExtra(wUnit2, "Reps");
        intent.putExtra(wTime2, wTime2);
        startActivity(intent);
    }

    public void clickjj_1(View view) {

        double ts =  Double.parseDouble(outstr);
        for (int i = 0; i < 12; i ++){
            String t1 = new String("Jumping Jacks");
            String t2 = new String(workouts[i]);
            if (t1.equals(t2)){
                num = ts/cals[i];
                break;
            }
        }
        wTime2 = String.format("%.2f", num);
        Intent intent = new Intent(this, output_2.class);
        intent.putExtra(wName1, wName1);
        intent.putExtra(wUnit1, wUnit1);
        intent.putExtra(wTime1, wTime1);

        intent.putExtra(wName2, "Jumping Jacks");
        intent.putExtra(wUnit2, "Minutes");
        intent.putExtra(wTime2, wTime2);
        startActivity(intent);

    }

    public void clickJ_1(View view) {

        double ts =  Double.parseDouble(outstr);
        for (int i = 0; i < 12; i ++){
            String t1 = new String("Jogging");
            String t2 = new String(workouts[i]);
            if (t1.equals(t2)){
                num = ts/cals[i];
                break;
            }
        }
        wTime2 = String.format("%.2f", num);
        Intent intent = new Intent(this, output_2.class);
        intent.putExtra(wName1, wName1);
        intent.putExtra(wUnit1, wUnit1);
        intent.putExtra(wTime1, wTime1);

        intent.putExtra(wName2, "Jogging");
        intent.putExtra(wUnit2, "Minutes");
        intent.putExtra(wTime2, wTime2);
        startActivity(intent);
    }




    public void clickSq_1(View view) {
        double ts =  Double.parseDouble(outstr);
        for (int i = 0; i < 12; i ++){
            String t1 = new String("Squats");
            String t2 = new String(workouts[i]);
            if (t1.equals(t2)){
                num = ts/cals[i];
                break;
            }
        }
        wTime2 = String.format("%.2f", num);
        Intent intent = new Intent(this, output_2.class);
        intent.putExtra(wName1, wName1);
        intent.putExtra(wUnit1, wUnit1);
        intent.putExtra(wTime1, wTime1);
        intent.putExtra(wName2, "Squats");
        intent.putExtra(wUnit2, "Reps");
        intent.putExtra(wTime2, wTime2);
        startActivity(intent);
    }

    public void clickLL_1(View view) {
        double ts =  Double.parseDouble(outstr);
        for (int i = 0; i < 12; i ++){
            String t1 = new String("Leg-lift");
            String t2 = new String(workouts[i]);
            if (t1.equals(t2)){
                num = ts/cals[i];
                break;
            }
        }
        wTime2 = String.format("%.2f", num);
        Intent intent = new Intent(this, output_2.class);
        intent.putExtra(wName1, wName1);
        intent.putExtra(wUnit1, wUnit1);
        intent.putExtra(wTime1, wTime1);
        intent.putExtra(wName2, "Leg-lift");
        intent.putExtra(wUnit2, "Minutes");
        intent.putExtra(wTime2, wTime2);
        startActivity(intent);
    }

    public void clickPl_1(View view) {
        double ts =  Double.parseDouble(outstr);
        for (int i = 0; i < 12; i ++){
            String t1 = new String("Plank");
            String t2 = new String(workouts[i]);
            if (t1.equals(t2)){
                num = ts/cals[i];
                break;
            }
        }
        wTime2 = String.format("%.2f", num);
        Intent intent = new Intent(this, output_2.class);
        intent.putExtra(wName1, wName1);
        intent.putExtra(wUnit1, wUnit1);
        intent.putExtra(wTime1, wTime1);
        intent.putExtra(wName2, "Plank");
        intent.putExtra(wUnit2, "Minutes");
        intent.putExtra(wTime2, wTime2);
        startActivity(intent);
    }

    public void clickPu_1(View view) {
        double ts =  Double.parseDouble(outstr);
        for (int i = 0; i < 12; i ++){
            String t1 = new String("Pullup");
            String t2 = new String(workouts[i]);
            if (t1.equals(t2)){
                num = ts/cals[i];
                break;
            }
        }
        wTime2 = String.format("%.2f", num);
        Intent intent = new Intent(this, output_2.class);
        intent.putExtra(wName1, wName1);
        intent.putExtra(wUnit1, wUnit1);
        intent.putExtra(wTime1, wTime1);
        intent.putExtra(wName2, "Pullup");
        intent.putExtra(wUnit2, "Reps");
        intent.putExtra(wTime2, wTime2);
        startActivity(intent);
    }

    public void clickCy_1(View view) {
        double ts =  Double.parseDouble(outstr);
        for (int i = 0; i < 12; i ++){
            String t1 = new String("Cycling");
            String t2 = new String(workouts[i]);
            if (t1.equals(t2)){
                num = ts/cals[i];
                break;
            }
        }
        wTime2 = String.format("%.2f", num);
        Intent intent = new Intent(this, output_2.class);
        intent.putExtra(wName1, wName1);
        intent.putExtra(wUnit1, wUnit1);
        intent.putExtra(wTime1, wTime1);
        intent.putExtra(wName2, "Cycling");
        intent.putExtra(wUnit2, "Minutes");
        intent.putExtra(wTime2, wTime2);
        startActivity(intent);
    }

    public void clickW_1(View view) {
        double ts =  Double.parseDouble(outstr);
        for (int i = 0; i < 12; i ++){
            String t1 = new String("Walking");
            String t2 = new String(workouts[i]);
            if (t1.equals(t2)){
                num = ts/cals[i];
                break;
            }
        }
        wTime2 = String.format("%.2f", num);
        Intent intent = new Intent(this, output_2.class);
        intent.putExtra(wName1, wName1);
        intent.putExtra(wUnit1, wUnit1);
        intent.putExtra(wTime1, wTime1);
        intent.putExtra(wName2, "Walking");
        intent.putExtra(wUnit2, "Minutes");
        intent.putExtra(wTime2, wTime2);
        startActivity(intent);
    }

    public void clickSw_1(View view) {
        double ts =  Double.parseDouble(outstr);
        for (int i = 0; i < 12; i ++){
            String t1 = new String("Swimming");
            String t2 = new String(workouts[i]);
            if (t1.equals(t2)){
                num = ts/cals[i];
                break;
            }
        }
        wTime2 = String.format("%.2f", num);
        Intent intent = new Intent(this, output_2.class);
        intent.putExtra(wName1, wName1);
        intent.putExtra(wUnit1, wUnit1);
        intent.putExtra(wTime1, wTime1);
        intent.putExtra(wName2, "Swimming");
        intent.putExtra(wUnit2, "Minutes");
        intent.putExtra(wTime2, wTime2);
        startActivity(intent);
    }

    public void clickSC_1(View view) {
        double ts =  Double.parseDouble(outstr);
        for (int i = 0; i < 12; i ++){
            String t1 = new String("Stair-Climbing");
            String t2 = new String(workouts[i]);
            if (t1.equals(t2)){
                num = ts/cals[i];
                break;
            }
        }
        wTime2 = String.format("%.2f", num);
        Intent intent = new Intent(this, output_2.class);
        intent.putExtra(wName1, wName1);
        intent.putExtra(wUnit1, wUnit1);
        intent.putExtra(wTime1, wTime1);
        intent.putExtra(wName2, "Stair-Climbing");
        intent.putExtra(wUnit2, "Minutes");
        intent.putExtra(wTime2, wTime2);
        startActivity(intent);
    }
}