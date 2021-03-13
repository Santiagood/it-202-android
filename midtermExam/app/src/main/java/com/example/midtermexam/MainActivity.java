package com.example.midtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button login;

    public final String TRUEUSERNAME = "ADMIN";
    public final String TRUEPASSWORD = "PASSWORD";
    public final int MAXTRY = 0;

    public String user, pass;
    public int count = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.inputUsername);
        password = findViewById(R.id.inputPassword);
        login = findViewById(R.id.login);
    }

    public void LOGIN(View view) {
        user = username.getText().toString();
        pass = password.getText().toString();
        if (user.equals(TRUEUSERNAME)==true && pass.equals(TRUEPASSWORD) == true) {
            NEXTSCREEN();
        }
        else {
            Toast.makeText(this, "Wrong Username or Password please try again! Try available: " + count, Toast.LENGTH_SHORT).show();
            count--;
            if(count < MAXTRY) {
                login.setEnabled(false);
                username.setEnabled(false);
                password.setEnabled(false);
            }
        }
    }

    public void NEXTSCREEN() {
        Intent Home = new Intent(MainActivity.this,Question1.class);
        Home.putExtra("UserName",user);
        startActivity(Home);
    }
}