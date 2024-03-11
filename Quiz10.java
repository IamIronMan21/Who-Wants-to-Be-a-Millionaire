package com.example.haquee_millionaireapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz10 extends AppCompatActivity {
    // Declare buttons for answer choices
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz10);

        // Initialize buttons by finding them in the layout
        btn1 = findViewById(R.id.buttonA);
        btn2 = findViewById(R.id.buttonB);
        btn3 = findViewById(R.id.buttonC);
        btn4 = findViewById(R.id.buttonD);

        // Button click listeners
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Incorrect Answer for btn1
                Toast.makeText(Quiz10.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                // Navigate to the Result activity with relevant data
                Intent i = new Intent(Quiz10.this, Result.class);
                i.putExtra("question", "10");
                i.putExtra("won", "$10,000");
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Correct Answer for btn2
                Toast.makeText(Quiz10.this, "Correct Answer! you won $20,000", Toast.LENGTH_SHORT).show();
                // Navigate to the next quiz activity (Quiz11)
                Intent i = new Intent(Quiz10.this, Quiz11.class);
                startActivity(i);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Incorrect Answer for btn3
                Toast.makeText(Quiz10.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Quiz10.this, Result.class);
                i.putExtra("question", "10");
                i.putExtra("won", "$10,000");
                startActivity(i);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Incorrect Answer for btn4
                Toast.makeText(Quiz10.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Quiz10.this, Result.class);
                i.putExtra("question", "10");
                i.putExtra("won", "$10,000");
                startActivity(i);
            }
        });
    }
}
