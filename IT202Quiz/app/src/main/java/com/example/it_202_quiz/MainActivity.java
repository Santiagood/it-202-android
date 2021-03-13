package com.example.it_202_quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup q1, q2, q3, q4, q5, q6, q7;
    RadioButton q1UserAns, q2UserAns, q3UserAns, q4UserAns, q5UserAns, q6UserAns, q7UserAns;
    Button submit, output;
    TextView score;
    CardView Card1, Card2, Card3, Card4, Card5, Card6, Card7;

    public String Q1, Q2, Q3, Q4, Q5, Q6, Q7;
    public final String TrueQ1 = "15", TrueQ2 = "Rodrigo Duterte", TrueQ3 = "Green", TrueQ4 = "Emilio Aguinaldo", TrueQ5 = "14", TrueQ6 = "Bank Robber", TrueQ7 = "7";

    public int Score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //RadioGroup
        q1=findViewById(R.id.Q1);
        q2=findViewById(R.id.Q2);
        q3=findViewById(R.id.Q3);
        q4=findViewById(R.id.Q4);
        q5=findViewById(R.id.Q5);
        q6=findViewById(R.id.Q6);
        q7=findViewById(R.id.Q7);

        //Buttons
        submit=findViewById(R.id.submit);
        output=findViewById(R.id.output);

        //text
        score=findViewById(R.id.score);

        //cardview
        Card1=findViewById(R.id.cardQ1);
        Card2=findViewById(R.id.cardQ2);
        Card3=findViewById(R.id.cardQ3);
        Card4=findViewById(R.id.cardQ4);
        Card5=findViewById(R.id.cardQ5);
        Card6=findViewById(R.id.cardQ6);
        Card7=findViewById(R.id.cardQ7);

        //defaults
        output.setEnabled(false);
        score.setEnabled(false);
    }

    //q1
    public void Question1(View view) {
        int AnsQ1 = q1.getCheckedRadioButtonId();
        q1UserAns=findViewById(AnsQ1);
        Q1 = q1UserAns.getText().toString();
    }

    //q2
    public void Question2(View view) {
        int AnsQ2 = q2.getCheckedRadioButtonId();
        q2UserAns=findViewById(AnsQ2);
        Q2 = q2UserAns.getText().toString();
    }

    //q3
    public void Question3(View view) {
        int AnsQ3 = q3.getCheckedRadioButtonId();
        q3UserAns=findViewById(AnsQ3);
        Q3 = q3UserAns.getText().toString();
    }

    //q4
    public void Question4(View view) {
        int AnsQ4 = q4.getCheckedRadioButtonId();
        q4UserAns=findViewById(AnsQ4);
        Q4 = q4UserAns.getText().toString();
    }

    //q5
    public void Question5(View view) {
        int AnsQ5 = q5.getCheckedRadioButtonId();
        q5UserAns=findViewById(AnsQ5);
        Q5 = q5UserAns.getText().toString();
    }

    //q6
    public void Question6(View view) {
        int AnsQ6 = q6.getCheckedRadioButtonId();
        q6UserAns=findViewById(AnsQ6);
        Q6 = q6UserAns.getText().toString();
    }

    //q7
    public void Question7(View view) {
        int AnsQ7 = q7.getCheckedRadioButtonId();
        q7UserAns=findViewById(AnsQ7);
        Q7 = q7UserAns.getText().toString();
    }

    //submit
    public void Submit(View view) {
        output.setEnabled(true);
        score.setEnabled(true);

        //q1
        if(Q1.equals(TrueQ1)==true) {
            Score += 1;
            Card1.setCardBackgroundColor(0xffC1EAEA);
        }
        else {
            Card1.setCardBackgroundColor(0xffF9AAB2);
        }

        //q2
        if(Q2.equals(TrueQ2)==true) {
            Score += 1;
            Card2.setCardBackgroundColor(0xffC1EAEA);
        }
        else {
            Card2.setCardBackgroundColor(0xffF9AAB2);
        }

        //q3
        if(Q3.equals(TrueQ3)==true) {
            Score += 1;
            Card3.setCardBackgroundColor(0xffC1EAEA);
        }
        else {
            Card3.setCardBackgroundColor(0xffF9AAB2);
        }

        //q4
        if(Q4.equals(TrueQ4)==true) {
            Score += 1;
            Card4.setCardBackgroundColor(0xffC1EAEA);
        }
        else {
            Card4.setCardBackgroundColor(0xffF9AAB2);
        }

        //q5
        if(Q5.equals(TrueQ5)==true) {
            Score += 1;
            Card5.setCardBackgroundColor(0xffC1EAEA);
        }
        else {
            Card5.setCardBackgroundColor(0xffF9AAB2);
        }

        //q6
        if(Q6.equals(TrueQ6)==true) {
            Score += 1;
            Card6.setCardBackgroundColor(0xffC1EAEA);
        }
        else {
            Card6.setCardBackgroundColor(0xffF9AAB2);
        }

        //q7
        if(Q7.equals(TrueQ7)==true) {
            Score += 1;
            Card7.setCardBackgroundColor(0xffC1EAEA);
        }
        else {
            Card7.setCardBackgroundColor(0xffF9AAB2);
        }
    }

    //Output
    public void Output(View view) {
        score.setText("Score: " + Score + "/7");
    }
}

