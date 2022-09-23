package com.example.melaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class sleep extends AppCompatActivity {
    TextView num,health;
    int n=25;
    ImageView minus,plus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);
        num=findViewById(R.id.num);
        health=findViewById(R.id.textView15);
        minus=findViewById(R.id.imageView9);
        plus=findViewById(R.id.imageView10);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=n-1;
                num.setText(n);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n+=1;
                num.setText(n);
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sleep.this,weeklyact.class));
            }
        });
    }
}