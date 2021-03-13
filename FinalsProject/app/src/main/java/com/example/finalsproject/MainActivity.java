package com.example.finalsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText PIN;
    int trial;

    public ArrayList<Integer> User = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PIN = findViewById(R.id.inputPIN);

        //default pin
        User.add(0, 12345);

        //default balance
        User.add(1, 2000);
    }


    public void login(View view) {
        trial = Integer.parseInt(PIN.getText().toString());

        //login
        if(User.get(0).equals(trial)==true) {
            Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show();
            Intent Home = new Intent(MainActivity.this, Menu.class);
            Home.putIntegerArrayListExtra("User", User);

            startActivity(Home);
        }

        //denied
        else {
            Toast.makeText(this, "Wrong PIN, please try again", Toast.LENGTH_SHORT).show();
        }
    }
}