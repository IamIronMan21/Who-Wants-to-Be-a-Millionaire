package com.example.haquee_millionaireapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz2 extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        // Initialize buttons
        btn1 = findViewById(R.id.buttonA);
        btn2 = findViewById(R.id.buttonB);
        btn3 = findViewById(R.id.buttonC);
        btn4 = findViewById(R.id.buttonD);

        // Button click listeners
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Wrong Answer for btn1
                Toast.makeText(Quiz2.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Quiz2.this, Result.class);
                i.putExtra("question", "2");
                i.putExtra("won", "0");
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Correct Answer for btn2
                Toast.makeText(Quiz2.this, "Correct Answer! you won 200$", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Quiz2.this, Quiz3.class);
                startActivity(i);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Wrong Answer for btn3
                Toast.makeText(Quiz2.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Quiz2.this, Result.class);
                i.putExtra("question", "2");
                i.putExtra("won", "0");
                startActivity(i);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Wrong Answer for btn4
                Toast.makeText(Quiz2.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Quiz2.this, Result.class);
                i.putExtra("question", "2");
                i.putExtra("won", "0");
                startActivity(i);
            }
        });
    }
}
