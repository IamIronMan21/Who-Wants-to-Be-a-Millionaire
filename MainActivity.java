package com.example.haquee_millionaireapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declare buttons for answer options
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the layout for the activity
        setContentView(R.layout.activity_main);

        // Initialize buttons using their IDs
        btn1 = findViewById(R.id.buttonA);
        btn2 = findViewById(R.id.buttonB);
        btn3 = findViewById(R.id.buttonC);
        btn4 = findViewById(R.id.buttonD);

        // Set onClickListener for button A
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Display a toast message for a wrong answer
                Toast.makeText(MainActivity.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                // Create an intent to start the Result activity with relevant data
                Intent i = new Intent(MainActivity.this, Result.class);
                i.putExtra("question", "1");
                i.putExtra("won", "0");
                // Start the Result activity
                startActivity(i);
            }
        });

        // Set onClickListener for button B (similar logic for other buttons)
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, Result.class);
                i.putExtra("question", "1");
                i.putExtra("won", "0");
                startActivity(i);
            }
        });

        // Set onClickListener for button C (correct answer)
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Display a toast message for a correct answer
                Toast.makeText(MainActivity.this, "Correct Answer! You won $100", Toast.LENGTH_SHORT).show();
                // Create an intent to start the next quiz activity
                Intent i = new Intent(MainActivity.this, Quiz2.class);
                // Start the Quiz2 activity
                startActivity(i);
            }
        });

        // Set onClickListener for button D (similar logic for other buttons)
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, Result.class);
                i.putExtra("question", "1");
                i.putExtra("won", "0");
                startActivity(i);
            }
        });
    }
}
