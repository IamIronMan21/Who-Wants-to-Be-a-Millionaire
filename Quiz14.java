package com.example.haquee_millionaireapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz14 extends AppCompatActivity {

    // Declare buttons for each answer option
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz14);

        // Initialize buttons with corresponding IDs from the layout
        btn1 = findViewById(R.id.buttonA);
        btn2 = findViewById(R.id.buttonB);
        btn3 = findViewById(R.id.buttonC);
        btn4 = findViewById(R.id.buttonD);

// Button 1 (Correct Answer)
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz14.this, "Correct Answer! You won $1,000,000", Toast.LENGTH_SHORT).show();

                // Navigate to CelebrationActivity instead of Result
                Intent i = new Intent(Quiz14.this, CelebrationActivity.class);
                startActivity(i);
            }
        });


        // Button 2 (Incorrect Answer)
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz14.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                // Proceed to Result activity with the current question number and the corresponding won amount
                Intent i = new Intent(Quiz14.this, Result.class);
                i.putExtra("question", "14");
                i.putExtra("won", "$500,000");
                startActivity(i);
            }
        });

        // Button 3 (Incorrect Answer)
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz14.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                // Proceed to Result activity with the current question number and the corresponding won amount
                Intent i = new Intent(Quiz14.this, Result.class);
                i.putExtra("question", "14");
                i.putExtra("won", "$500,000");
                startActivity(i);
            }
        });

        // Button 4 (Incorrect Answer)
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Quiz14.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                // Proceed to Result activity with the current question number and the corresponding won amount
                Intent i = new Intent(Quiz14.this, Result.class);
                i.putExtra("question", "14");
                i.putExtra("won", "$500,000");
                startActivity(i);
            }
        });
    }
}
