package com.example.melaton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
    }
}