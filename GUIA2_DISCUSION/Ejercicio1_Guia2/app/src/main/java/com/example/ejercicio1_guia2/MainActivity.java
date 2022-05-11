package com.example.ejercicio1_guia2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int mCount;
    private TextView mShowCount;
    Button Contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCount = 0;
        setContentView(R.layout.activity_main);
        Contador =  findViewById(R.id.button_count);
        Contador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            mCount++;
            if(mCount==10)
            { mCount=0;}
            mShowCount.setText(Integer.toString(mCount));

            }
        });
        mShowCount = findViewById(R.id.show_count);
        mShowCount.setText(Integer.toString(mCount));


    }

    public void CountUp(View view) {
    }
}