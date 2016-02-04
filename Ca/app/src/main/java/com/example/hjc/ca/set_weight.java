package com.example.hjc.ca;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class set_weight extends AppCompatActivity {
    public static String num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_weight);

        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        int display = sp.getInt("weight", 150);
        num = Integer.toString(display);
        TextView weight_display = (TextView) findViewById(R.id.weight_display);
        weight_display.append(num);
    }

    public void backtomain(View view) {

        Intent intent = new Intent(this, Welcome.class);
        startActivity(intent);
    }

    public void setweight(View view) {
        TextView weight_enter = (TextView) findViewById(R.id.weight_set);
        num = weight_enter.getText().toString();
        int new_weight = Integer.parseInt(num);
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("weight", new_weight);
        editor.commit();
        Intent intent = new Intent(this, Welcome.class);
        startActivity(intent);
    }
}
