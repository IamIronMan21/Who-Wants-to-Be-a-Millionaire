package com.example.haquee_millionaireapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz7 extends AppCompatActivity {

    // Buttons for answer options
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz7);

        // Initialize buttons by finding their IDs
        btn1 = findViewById(R.id.buttonA);
        btn2 = findViewById(R.id.buttonB);
        btn3 = findViewById(R.id.buttonC);
        btn4 = findViewById(R.id.buttonD);

        // Button click listeners for each answer option
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Display toast for a wrong answer
                Toast.makeText(Quiz7.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                // Start Result activity with information about the question and winnings
                Intent i = new Intent(Quiz7.this, Result.class);
                i.putExtra("question", "7");
                i.putExtra("won", "$1,000");
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Display toast for a wrong answer
                Toast.makeText(Quiz7.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                // Start Result activity with information about the question and winnings
                Intent i = new Intent(Quiz7.this, Result.class);
                i.putExtra("question", "7");
                i.putExtra("won", "$1,000");
                startActivity(i);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Display toast for a wrong answer
                Toast.makeText(Quiz7.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                // Start Result activity with information about the question and winnings
                Intent i = new Intent(Quiz7.this, Result.class);
                i.putExtra("question", "7");
                i.putExtra("won", "$1,000");
                startActivity(i);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Display toast for a correct answer with winning amount
                Toast.makeText(Quiz7.this, "Correct Answer! You won $2,000", Toast.LENGTH_SHORT).show();
                // Start Quiz8 activity
                Intent i = new Intent(Quiz7.this, Quiz8.class);
                startActivity(i);
            }
        });
    }
}
