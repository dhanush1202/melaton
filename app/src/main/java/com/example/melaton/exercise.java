package com.example.melaton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

public class exercise extends AppCompatActivity {
    CalendarView calendar;
    TextView week;
    TextView month;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
    week=findViewById(R.id.week);
    week.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i= new Intent(exercise.this,weeklyact.class);
            startActivity(i);
        }

    });
    month=findViewById(R.id.monthly);
    month.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(exercise.this,monthly.class));
        }
    });


    }
}