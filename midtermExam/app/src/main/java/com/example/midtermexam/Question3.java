package com.example.midtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Question3 extends AppCompatActivity {
    RadioGroup Q3;
    RadioButton Q3UserAns, Q3Ch1, Q3Ch2, Q3Ch3, Q3Ch4;

    String user_;
    String TRUEQ3AnsID = "Facebook.com";
    String Q3UserAnswer;
    int Q3UserAnsID;
    int Score;
    int countClick = 0;
    int tempScore = 0;
    int Quiz1, Quiz2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        Intent Home = getIntent();
        user_ = getIntent().getStringExtra("UserName");
        Score = getIntent().getIntExtra("Score", Score);
        Quiz1 = getIntent().getIntExtra("Quiz1", Quiz1);
        Quiz2 = getIntent().getIntExtra("Quiz2", Quiz2);
        Q3 = findViewById(R.id.inputQ3Ans);
        Q3Ch1 = findViewById(R.id.inputQ3Choice1);
        Q3Ch2 = findViewById(R.id.inputQ3Choice2);
        Q3Ch3 = findViewById(R.id.inputQ3Choice3);
        Q3Ch4 = findViewById(R.id.inputQ3Choice4);
    }

    public void submit() {
        Q3UserAnsID = Q3.getCheckedRadioButtonId();
        Q3UserAns = findViewById(Q3UserAnsID);
        Q3UserAnswer = Q3UserAns.getText().toString();
        if(Q3UserAnswer.equalsIgnoreCase(TRUEQ3AnsID)==true) {
            tempScore += 2;
        }
        Q3Ch1.setClickable(false);
        Q3Ch2.setClickable(false);
        Q3Ch3.setClickable(false);
        Q3Ch4.setClickable(false);
        Toast.makeText(this, "Answers Locked", Toast.LENGTH_SHORT).show();
    }

    public void proceedNext(View view) {
        countClick += 1;
        if(countClick<= 1) {
            submit();
            Score += tempScore;
        }
        else {
            NEXTSCREEN();
        }
    }

    public void NEXTSCREEN() {
        Intent Home = new Intent(Question3.this,ScorePage.class);
        Home.putExtra("UserName",user_);
        Home.putExtra("Score", Score);
        Home.putExtra("Quiz1", Quiz1);
        Home.putExtra("Quiz2", Quiz2);
        Home.putExtra("Quiz3", tempScore);
        startActivity(Home);
    }
}