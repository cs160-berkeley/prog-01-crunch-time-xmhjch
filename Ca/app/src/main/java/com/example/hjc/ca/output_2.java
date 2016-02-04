package com.example.hjc.ca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class output_2 extends AppCompatActivity {
    public static String wName1;
    public static String wUnit1;
    public static String wName2;
    public static String wUnit2;
    public static String wTime1;
    public static String wTime2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output_2);

        Intent intent=getIntent();
        wName1 = intent.getStringExtra(Choose_w_3.wName1);
        wUnit1 = intent.getStringExtra(Choose_w_3.wUnit1);
        wTime1 = intent.getStringExtra(Choose_w_3.wTime1);
        wName2 = intent.getStringExtra(Choose_w_3.wName2);
        wUnit2 = intent.getStringExtra(Choose_w_3.wUnit2);
        wTime2 = intent.getStringExtra(Choose_w_3.wTime2);


        TextView name1 = (TextView) findViewById(R.id.compare_name1);
        TextView unit1 = (TextView) findViewById(R.id.compare_unit1);
        TextView name2 = (TextView) findViewById(R.id.compare_name2);
        TextView unit2 = (TextView) findViewById(R.id.compare_unit2);
        TextView time1 = (TextView) findViewById(R.id.compare_times1);
        TextView time2 = (TextView) findViewById(R.id.compare_times2);


        name1.append(wName1);
        unit1.append(wUnit1);
        name2.append(wName2);
        unit2.append(wUnit2);
        time1.append(wTime1);
        time2.append(wTime2);
    }

    public void backtomain(View view) {
        Intent intent = new Intent(this, Welcome.class);
        startActivity(intent);

    }
}
