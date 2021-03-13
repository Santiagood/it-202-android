package com.example.it_202_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {
    TextView _user, _pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Intent Home = getIntent();
        _user = findViewById(R.id.outputUsername);
        _pass = findViewById(R.id.outputPassword);

        String user_ = getIntent().getStringExtra("UserName");
        String pass_ = getIntent().getStringExtra("PassWord");

        _user.setText("Your Username: " + user_);
        _pass.setText("Your Password: " + pass_);
    }
}