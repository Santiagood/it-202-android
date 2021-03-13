package com.example.finalsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class LogOut extends AppCompatActivity {
    public ArrayList<Integer> User = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_out);
        Intent Home = getIntent();
        User = (ArrayList<Integer>) getIntent().getExtras().getSerializable("User");
    }

    public void Transact(View view) {
        Intent Home = new Intent(this, anotherMain.class);
        Home.putIntegerArrayListExtra("User", User);
        startActivity(Home);
    }
}