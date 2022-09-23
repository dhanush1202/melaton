package com.example.melaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class menu extends AppCompatActivity {
    TextView sl1,di1,ex1,hs1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        sl1=findViewById(R.id.sl12);
        di1=findViewById(R.id.di12);
        ex1=findViewById(R.id.ex12);
        hs1=findViewById(R.id.hs12);
        sl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menu.this,sleep.class));
            }
        });
        di1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menu.this,diet.class));
            }
        });
        ex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menu.this,exercise.class));
            }
        });
        hs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menu.this,weeklyact.class));
            }
        });
    }
}