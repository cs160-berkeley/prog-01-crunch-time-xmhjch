package com.example.hjc.ca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class output_1 extends AppCompatActivity {

    public static String num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output_1);


        Intent intent=getIntent();
        num = intent.getStringExtra(Input_1.outstr);

        TextView burn = (TextView) findViewById(R.id.result_1);

        burn.append(num);

    }

    public void backtomain(View view) {
        Intent intent = new Intent(this, Welcome.class);
        startActivity(intent);

    }

}
