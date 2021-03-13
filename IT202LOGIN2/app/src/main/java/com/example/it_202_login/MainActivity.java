package com.example.it_202_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    CheckBox show;
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
        show = findViewById(R.id.CheckShowPass);
        login = findViewById(R.id.Login);
    }

    public void LOGIN(View view) {
         user = username.getText().toString();
         pass = password.getText().toString();
         if (user.equals(TRUEUSERNAME)==true && pass.equals(TRUEPASSWORD) == true) {
            NEXTSCREEN();
         }
         else {
             Toast.makeText(this, "Wrong Username or Password please try again! Try available: " + count, Toast.LENGTH_LONG).show();
             count--;
             if(count < MAXTRY) {
                 login.setEnabled(false);
                 username.setEnabled(false);
                 password.setEnabled(false);
                 show.setEnabled(false);
             }
         }
    }

    public void SHOW(View view) {
        if(show.isChecked() == true) {
            password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        }
        else {
            password.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public void NEXTSCREEN() {
        Intent Home = new Intent(MainActivity.this,HomeScreen.class);
        Home.putExtra("UserName",user);
        Home.putExtra("PassWord",pass);
        startActivity(Home);
    }
}