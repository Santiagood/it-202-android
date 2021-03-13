package com.example.finalsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;


public class Menu extends AppCompatActivity {

    public ArrayList<Integer> User = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Intent Home = getIntent();
        User = (ArrayList<Integer>) getIntent().getExtras().getSerializable("User");
    }

    //To Balance Window
    public void Balance(View view) {
        Intent Home = new Intent(this, Balance.class);
        Home.putIntegerArrayListExtra("User", User);
        startActivity(Home);
    }

    //To Withdraw Window
    public void Withdraw(View view) {
        Intent Home = new Intent(this, Withdraw.class);
        Home.putIntegerArrayListExtra("User", User);
        startActivity(Home);
    }

    //To Deposit Window
    public void Deposit(View view) {
        Intent Home = new Intent(this, Deposit.class);
        Home.putIntegerArrayListExtra("User", User);
        startActivity(Home);
    }

    //To Change Pin Window
    public void ChangePin(View view) {
        Intent Home = new Intent(this, ChangePin.class);
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