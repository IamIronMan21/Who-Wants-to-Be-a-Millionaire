package com.example.haquee_millionaireapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

    // Declare TextView and Button variables
    TextView question, won;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Initialize TextView and Button by finding their IDs
        question = findViewById(R.id.txtTotalQuestionsR);
        won = findViewById(R.id.txtQuesR);
        btn = findViewById(R.id.bt_play_again);

        // Get data from the Intent
        Intent intent = getIntent();
        String questionText = intent.getStringExtra("question");
        String wonAmount = intent.getStringExtra("won");

        // Set text for TextViews based on the data received
        question.setText("Total Questions are: " + questionText);
        won.setText("Won: " + wonAmount);

        // Set click listener for the play again button
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start MainActivity when the button is clicked
                Intent i = new Intent(Result.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
