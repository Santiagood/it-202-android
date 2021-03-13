package com.example.finalsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class anotherMain extends AppCompatActivity {

    EditText PIN;
    int trial;

    public ArrayList<Integer> User = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PIN = findViewById(R.id.inputPIN);
        Intent Home = getIntent();
        User = (ArrayList<Integer>) getIntent().getExtras().getSerializable("User");
    }


    public void login(View view) {
        trial = Integer.parseInt(PIN.getText().toString());

        //login
        if(User.get(0).equals(trial)==true) {
            Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show();
            Intent Home = new Intent(this, Menu.class);
            Home.putIntegerArrayListExtra("User", User);

            startActivity(Home);
        }

        //denied
        else {
            Toast.makeText(this, "Wrong PIN, please try again", Toast.LENGTH_SHORT).show();
        }
    }
}