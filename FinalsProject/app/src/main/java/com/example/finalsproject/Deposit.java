package com.example.finalsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
public class Deposit extends AppCompatActivity {

    public ArrayList<Integer> User = new ArrayList<>();

    EditText Deposit;
    int deposit;
    int current;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit);
        Deposit = findViewById(R.id.input_Deposit);
        Intent Home = getIntent();
        User = (ArrayList<Integer>) getIntent().getExtras().getSerializable("User");
    }

    //for submit
    public void Submit(View view) {
        deposit = Integer.parseInt(Deposit.getText().toString());
        current = User.get(1);
        current += deposit;
        User.set(1, current);
        Toast.makeText(this, "Successfully Deposited: " + deposit, Toast.LENGTH_SHORT).show();
        Deposit.setText("");
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