package com.example.hjc.ca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Choose_4 extends AppCompatActivity {

    public static String wName1 = "vName";
    public static String wUnit1 = "wUnit1";
    public static String outstr = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_4);

        Intent intent=getIntent();
        outstr = intent.getStringExtra(Input_3.outstr);

    }

    public void clickPS_1(View view) {
        Intent intent = new Intent(this, output_4.class);
        intent.putExtra(wName1, "Pushup");
        intent.putExtra(wUnit1, "Reps");
        intent.putExtra(outstr, outstr);
        startActivity(intent);
    }

    public void clickSU_1(View view) {
        Intent intent = new Intent(this, output_4.class);
        intent.putExtra(wName1, "Situp");
        intent.putExtra(wUnit1, "Reps");
        intent.putExtra(outstr, outstr);
        startActivity(intent);
    }

    public void clickjj_1(View view) {
        Intent intent = new Intent(this, output_4.class);
        intent.putExtra(wName1, "Jumping Jacks");
        intent.putExtra(wUnit1, "Minutes");
        intent.putExtra(outstr, outstr);
        startActivity(intent);
    }

    public void clickJ_1(View view) {
        Intent intent = new Intent(this, output_4.class);
        intent.putExtra(wName1, "Jogging");
        intent.putExtra(wUnit1, "Minutes");
        intent.putExtra(outstr, outstr);
        startActivity(intent);
    }





    public void clickSq_1(View view) {
        Intent intent = new Intent(this, output_4.class);
        intent.putExtra(wName1, "Squats");
        intent.putExtra(wUnit1, "Reps");
        intent.putExtra(outstr, outstr);
        startActivity(intent);
    }

    public void clickLL_1(View view) {
        Intent intent = new Intent(this, output_4.class);
        intent.putExtra(wName1, "Leg-lift");
        intent.putExtra(wUnit1, "Minutes");
        intent.putExtra(outstr, outstr);
        startActivity(intent);
    }

    public void clickPl_1(View view) {
        Intent intent = new Intent(this, output_4.class);
        intent.putExtra(wName1, "Plank");
        intent.putExtra(wUnit1, "Minutes");
        intent.putExtra(outstr, outstr);
        startActivity(intent);
    }

    public void clickPu_1(View view) {
        Intent intent = new Intent(this, output_4.class);
        intent.putExtra(wName1, "Pullup");
        intent.putExtra(wUnit1, "Reps");
        intent.putExtra(outstr, outstr);
        startActivity(intent);
    }

    public void clickCy_1(View view) {
        Intent intent = new Intent(this, output_4.class);
        intent.putExtra(wName1, "Cycling");
        intent.putExtra(wUnit1, "Minutes");
        intent.putExtra(outstr, outstr);
        startActivity(intent);
    }

    public void clickW_1(View view) {
        Intent intent = new Intent(this, output_4.class);
        intent.putExtra(wName1, "Walking");
        intent.putExtra(wUnit1, "Minutes");
        intent.putExtra(outstr, outstr);
        startActivity(intent);
    }

    public void clickSw_1(View view) {
        Intent intent = new Intent(this, output_4.class);
        intent.putExtra(wName1, "Swimming");
        intent.putExtra(wUnit1, "Minutes");
        intent.putExtra(outstr, outstr);
        startActivity(intent);
    }

    public void clickSC_1(View view) {
        Intent intent = new Intent(this, output_4.class);
        intent.putExtra(wName1, "Stair-Climbing");
        intent.putExtra(wUnit1, "Minutes");
        intent.putExtra(outstr, outstr);
        startActivity(intent);
    }
}
