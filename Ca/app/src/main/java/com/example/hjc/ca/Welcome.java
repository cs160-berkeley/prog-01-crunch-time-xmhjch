package com.example.hjc.ca;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;


public class Welcome extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


    }

    public void openChooseW1(View view){
        Intent intent = new Intent(this, Choose_w_1.class);
        startActivity(intent);
    }

    public void openCompareW1(View view) {
        Intent intent = new Intent(this, Choose_w_2.class);
        startActivity(intent);
    }

    public void openTemp(View view) {
        Intent intent = new Intent(this, Input_3.class);
        startActivity(intent);
    }

    public void setweight(View view) {
        Intent intent = new Intent(this, set_weight.class);
        startActivity(intent);
    }
}
