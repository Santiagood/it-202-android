package com.example.midtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ScorePage extends AppCompatActivity {

    TextView _user, _score;
    TextView Q1, Q2, Q3;

    int Score;
    int Quiz1, Quiz2, Quiz3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_page);
        Intent Home = getIntent();
        _user = findViewById(R.id.outputUsername);
        _score = findViewById(R.id.outputScore);
        Q1 = findViewById(R.id.outputQuiz1);
        Q2 = findViewById(R.id.outputQuiz2);
        Q3 = findViewById(R.id.outputQuiz3);

        String user_ = getIntent().getStringExtra("UserName");
        Score = getIntent().getIntExtra("Score", Score);
        Quiz1 = getIntent().getIntExtra("Quiz1", Quiz1);
        Quiz2 = getIntent().getIntExtra("Quiz2", Quiz2);
        Quiz3 = getIntent().getIntExtra("Quiz3", Quiz3);


        _user.setText("Username: " + user_);
        _score.setText("Total Score: " + Score + "/10");
        Q1.setText("Quiz #1: " + Quiz1 + "/5");
        Q2.setText("Quiz #2: " + Quiz2 + "/3");
        Q3.setText("Quiz #3: " + Quiz3 + "/2");
    }
}