package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txt;
   Button btn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.TextView);
        btn = findViewById(R.id.btnRand);
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextT18n")
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int val =random.nextInt();
                txt.setText(Integer.toString(val));

            }
        });


    }
}