package com.example.hjc.ca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Choose_w_1 extends AppCompatActivity {

    public final static String wName1 = "vName";
    public final static String wUnit1 = "wUnit1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_w_1);

    }

    public void clickPS_1(View view) {
        Intent intent = new Intent(this, Input_1.class);
        intent.putExtra(wName1, "Pushup");
        intent.putExtra(wUnit1, "Reps");
        startActivity(intent);
    }

    public void clickSU_1(View view) {
        Intent intent = new Intent(this, Input_1.class);
        intent.putExtra(wName1, "Situp");
        intent.putExtra(wUnit1, "Reps");
        startActivity(intent);
    }

    public void clickjj_1(View view) {
        Intent intent = new Intent(this, Input_1.class);
        intent.putExtra(wName1, "Jumping Jacks");
        intent.putExtra(wUnit1, "Minutes");
        startActivity(intent);
    }

    public void clickJ_1(View view) {
        Intent intent = new Intent(this, Input_1.class);
        intent.putExtra(wName1, "Jogging");
        intent.putExtra(wUnit1, "Minutes");
        startActivity(intent);
    }





    public void clickSq_1(View view) {
        Intent intent = new Intent(this, Input_1.class);
        intent.putExtra(wName1, "Squats");
        intent.putExtra(wUnit1, "Reps");
        startActivity(intent);
    }

    public void clickLL_1(View view) {
        Intent intent = new Intent(this, Input_1.class);
        intent.putExtra(wName1, "Leg-lift");
        intent.putExtra(wUnit1, "Minutes");
        startActivity(intent);
    }

    public void clickPl_1(View view) {
        Intent intent = new Intent(this, Input_1.class);
        intent.putExtra(wName1, "Plank");
        intent.putExtra(wUnit1, "Minutes");
        startActivity(intent);
    }

    public void clickPu_1(View view) {
        Intent intent = new Intent(this, Input_1.class);
        intent.putExtra(wName1, "Pullup");
        intent.putExtra(wUnit1, "Reps");
        startActivity(intent);
    }

    public void clickCy_1(View view) {
        Intent intent = new Intent(this, Input_1.class);
        intent.putExtra(wName1, "Cycling");
        intent.putExtra(wUnit1, "Minutes");
        startActivity(intent);
    }

    public void clickW_1(View view) {
        Intent intent = new Intent(this, Input_1.class);
        intent.putExtra(wName1, "Walking");
        intent.putExtra(wUnit1, "Minutes");
        startActivity(intent);
    }

    public void clickSw_1(View view) {
        Intent intent = new Intent(this, Input_1.class);
        intent.putExtra(wName1, "Swimming");
        intent.putExtra(wUnit1, "Minutes");
        startActivity(intent);
    }

    public void clickSC_1(View view) {
        Intent intent = new Intent(this, Input_1.class);
        intent.putExtra(wName1, "Stair-Climbing");
        intent.putExtra(wUnit1, "Minutes");
        startActivity(intent);
    }
}
