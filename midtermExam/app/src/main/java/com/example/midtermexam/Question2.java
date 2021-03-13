package com.example.midtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Question2 extends AppCompatActivity {

    CheckBox Choice1, Choice2, Choice3, Choice4, Choice5, Choice6;

    String user_;
    int Score;
    int tempScore;
    int countClick = 0;
    int Quiz1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        Intent Home = getIntent();
        user_ = getIntent().getStringExtra("UserName");
        Score = getIntent().getIntExtra("Score", Score);
        Quiz1 = getIntent().getIntExtra("Quiz1",Quiz1);


        Choice1 = findViewById(R.id.inputQ2Ans1);
        Choice2 = findViewById(R.id.inputQ2Ans2);
        Choice3 = findViewById(R.id.inputQ2Ans3);
        Choice4 = findViewById(R.id.inputQ2Ans4);
        Choice5 = findViewById(R.id.inputQ2Ans5);
        Choice6 = findViewById(R.id.inputQ2Ans6);

    }

    public void submit() {
        if(Choice2.isChecked()==true) {
            tempScore += 1;
        }
        if(Choice3.isChecked()==true) {
            tempScore += 1;
        }
        if(Choice6.isChecked()==true) {
            tempScore += 1;
        }

        Choice1.setEnabled(false);
        Choice2.setEnabled(false);
        Choice3.setEnabled(false);
        Choice4.setEnabled(false);
        Choice5.setEnabled(false);
        Choice6.setEnabled(false);

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
        Intent Home = new Intent(Question2.this,Question3.class);
        Home.putExtra("UserName",user_);
        Home.putExtra("Score", Score);
        Home.putExtra("Quiz1", Quiz1);
        Home.putExtra("Quiz2", tempScore);
        startActivity(Home);
    }
}