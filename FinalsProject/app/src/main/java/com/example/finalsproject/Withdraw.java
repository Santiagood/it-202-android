package com.example.finalsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Withdraw extends AppCompatActivity {

    EditText Withdraw;
    int withdraw;
    int current;
    public ArrayList<Integer> User = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw);
        Withdraw = findViewById(R.id.input_Withdraw);
        Intent Home = getIntent();
        User = (ArrayList<Integer>) getIntent().getExtras().getSerializable("User");
    }

    //for Submit
    public void Submit(View view) {
        withdraw = Integer.parseInt(Withdraw.getText().toString());
        current = User.get(1);

        if(withdraw <= current) {
            current -= withdraw;
            User.set(1, current);
            Withdraw.setText("");
            Toast.makeText(this, "Successfully Withdraw: " + withdraw, Toast.LENGTH_LONG).show();
            Withdraw.setText("");
        }

        else {
            Toast.makeText(this, "Your Current balance is not enough to withdraw: " + withdraw, Toast.LENGTH_LONG).show();
        }
    }

    //for transact
    public void Transact(View view) {
        Intent Home = new Intent(this, Menu.class);
        Home.putIntegerArrayListExtra("User", User);
        startActivity(Home);
    }

    //To log out Window
    public void Logout(View view) {
        Intent Home = new Intent(this, LogOut.class);
        Home.putIntegerArrayListExtra("User", User);
        startActivity(Home);
    }


}