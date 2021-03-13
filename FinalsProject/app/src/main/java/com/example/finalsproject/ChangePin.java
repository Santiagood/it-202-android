package com.example.finalsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class ChangePin extends AppCompatActivity {

    EditText Current, New, NewAgain;
    int current, newpin, newpinagain;
    public ArrayList<Integer> User = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_pin);
        Intent Home = getIntent();
        User = (ArrayList<Integer>) getIntent().getExtras().getSerializable("User");
        Current = findViewById(R.id.input_OldPin);
        New = findViewById(R.id.input_NewPin);
        NewAgain = findViewById(R.id.input_NewPin_Another);
    }

    //for submit
    public void Submit(View view) {
        current = Integer.parseInt(Current.getText().toString());

        //if pareho ng pin
        if(current == User.get(0)) {
            newpin = Integer.parseInt(New.getText().toString());
            newpinagain = Integer.parseInt(NewAgain.getText().toString());

            User.add(2, newpin);
            User.add(3, newpinagain);

            // equals
            if(User.get(2).equals(User.get(3))==true) {
                User.set(0, newpin);
                User.remove(2);
                User.remove(2);
                Toast.makeText(this, "Successfully changed the PIN", Toast.LENGTH_SHORT).show();
                Current.setText("");
                New.setText("");
                NewAgain.setText("");
            }

            // not equal
            else {
                Toast.makeText(this, "Inputted PIN doesn't match", Toast.LENGTH_SHORT).show();
            }
        }

        // hindi pareho
        else {
            Toast.makeText(this, "Current Pin is Invalid", Toast.LENGTH_SHORT).show();

        }

    }


    //for transact
    public void Transact(View view) {
        Intent Home = new Intent(this, Menu.class);
        Home.putIntegerArrayListExtra("User", User);
        startActivity(Home);
    }

}
