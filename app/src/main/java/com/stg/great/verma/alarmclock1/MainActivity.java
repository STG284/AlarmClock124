package com.stg.great.verma.alarmclock1;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "the id  is " , Toast.LENGTH_SHORT).show();

        Button but_start = (Button)findViewById(R.id.button_start);
        ColorDrawable buttoncolor = (ColorDrawable)but_start.getBackground();
        int colorid = buttoncolor.getColor();
        Toast.makeText(getApplicationContext(), "the id  is " + colorid, Toast.LENGTH_SHORT).show();
        but_start.setOnClickListener(StartButtonListener);
    }

    View.OnClickListener StartButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ColorDrawable buttonColor = (ColorDrawable)v.getBackground();
            int ColorId = buttonColor.getColor();
            if(ColorId != R.color.colorDarkGrey)
                v.setBackgroundColor(getResources().getColor(R.color.colorDarkGrey));
            else
                v.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        }
    };
}
