package com.example.melaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView comm,non,miss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 comm=findViewById(R.id.comm);
 non=findViewById(R.id.non);
 miss=findViewById(R.id.miss);

 comm.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
//         startActivity(new Intent(MainActivity.this,menu.class));
         Toast.makeText(MainActivity.this, "Welcome Commander!!", Toast.LENGTH_SHORT).show();
     }
 });
    non.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,menu.class));
                Toast.makeText(MainActivity.this, "Welcome Scientist!!", Toast.LENGTH_SHORT).show();

            }
        });
    miss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,menu.class));
                Toast.makeText(MainActivity.this, "Welcome Astronaut!!", Toast.LENGTH_SHORT).show();

            }
        });

}}