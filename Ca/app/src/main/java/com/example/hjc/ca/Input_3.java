package com.example.hjc.ca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Input_3 extends AppCompatActivity {
    public static double outnum = 0;
    public static String outstr = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_3);

    }


    public void Choose4(View view) {
        Intent intent = new Intent(this, Choose_4.class);
        EditText editText = (EditText) findViewById(R.id.cal_input_1);
        String num = editText.getText().toString();
        double cal = Double.parseDouble(num);

        outnum = cal;

        outstr = String.format("%.2f", outnum);

        intent.putExtra(outstr, outstr);

        startActivity(intent);
    }
}
