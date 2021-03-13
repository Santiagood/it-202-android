package com.example.finalsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Balance extends AppCompatActivity {

    TextView outputBalance;
    public ArrayList<Integer> User = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);
        outputBalance = findViewById(R.id.output_Balance);
        Intent Home = getIntent();
        User = (ArrayList<Integer>) getIntent().getExtras().getSerializable("User");
        outputBalance.setText(""+User.get(1));
    }

    //for transact
    public void Transact(View view) {
        Intent Home = new Intent(this, Menu.class);
        Home.putIntegerArrayListExtra("User", User);
        startActivity(Home);
    }

    //for log out
    public void Logout(View view) {
        Intent Home = new Intent(this, LogOut.class);
        Home.putIntegerArrayListExtra("User", User);
        startActivity(Home);
    }
}