package com.example.melaton;

import static com.example.melaton.R.id.diet1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class exercise extends AppCompatActivity {
    TextView week;
    TextView sleep,dietq;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
    week=findViewById(R.id.week);
    sleep=findViewById(R.id.sleep);
    dietq=findViewById(diet1);

    week.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i= new Intent(exercise.this,weeklyact.class);
            startActivity(i);
        }

    });
    sleep.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(exercise.this,sleep.class));
        }
    });
    dietq.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(exercise.this,diet.class));
        }
    });

    }
}