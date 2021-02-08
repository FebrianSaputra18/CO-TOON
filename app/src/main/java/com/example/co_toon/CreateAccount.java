package com.example.co_toon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
    }

    public void createaccount(View view){
        Intent intent = new Intent(CreateAccount.this, LoginAccount.class);
        startActivity(intent);
    }
    public void login(View view){
        Intent intent = new Intent(CreateAccount.this, LoginAccount.class);
        startActivity(intent);
    }
}