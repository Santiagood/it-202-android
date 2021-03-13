package com.example.midtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Question1 extends AppCompatActivity {

    EditText input1, input2, input3, input4, input5;

    public String user_;
    public String inputAns1, inputAns2, inputAns3, inputAns4, inputAns5;
    public String[] TRUEQ1Ans = {"Servant-Leadership", "Christ-Centeredness", "Excellence", "Passion", "Integrity"};
    int countClick = 0;
    public int Score = 0;
    public int tempScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        Intent Home = getIntent();
        user_ = getIntent().getStringExtra("UserName");

        input1 = findViewById(R.id.inputQ1Ans1);
        input2 = findViewById(R.id.inputQ1Ans2);
        input3 = findViewById(R.id.inputQ1Ans3);
        input4 = findViewById(R.id.inputQ1Ans4);
        input5 = findViewById(R.id.inputQ1Ans5);
    }

    public void submit() {

        //val 1
        inputAns1 = input1.getText().toString();
        for (String val: TRUEQ1Ans) {
            if(inputAns1.equalsIgnoreCase(val)==true) {
                tempScore += 1;
            }
            else {
                tempScore += 0;
            }
        }

        //val 2
        inputAns2 = input2.getText().toString();
        for (String val: TRUEQ1Ans) {
            if(inputAns2.equalsIgnoreCase(val)==true) {
                tempScore += 1;
            }
            else {
                tempScore += 0;
            }
        }

        //val 3
        inputAns3 = input3.getText().toString();
        for (String val: TRUEQ1Ans) {
            if(inputAns3.equalsIgnoreCase(val)==true) {
                tempScore += 1;
            }
            else {
                tempScore += 0;
            }
        }

        //val 4
        inputAns4 = input4.getText().toString();
        for (String val: TRUEQ1Ans) {
            if(inputAns4.equalsIgnoreCase(val)==true) {
                tempScore += 1;
            }
            else {
                tempScore += 0;
            }
        }

        //val 5
        inputAns5 = input5.getText().toString();
        for (String val: TRUEQ1Ans) {
            if(inputAns5.equalsIgnoreCase(val)==true) {
                tempScore += 1;
            }
            else {
                tempScore += 0;
            }
        }
        input1.setEnabled(false);
        input2.setEnabled(false);
        input3.setEnabled(false);
        input4.setEnabled(false);
        input5.setEnabled(false);
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
        Intent Home = new Intent(Question1.this,Question2.class);
        Home.putExtra("UserName",user_);
        Home.putExtra("Score", Score);
        Home.putExtra("Quiz1", tempScore);
        startActivity(Home);
    }
}