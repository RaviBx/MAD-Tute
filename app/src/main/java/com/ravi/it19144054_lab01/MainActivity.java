package com.ravi.it19144054_lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button2;
    TextView textView3;
    TextView textView4;
    TextView textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = findViewById(R.id.button2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView3.setText(" IT19144054 ");
                textView4.setText(" Balasooriya B.R.G.R ");
                textView5.setText(" Batch 07 ");



            }
        });
    }
}