package com.example.co_toon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_account);
    }
    public void loginaccount(View view){
        Intent intent = new Intent(LoginAccount.this, MainActivity.class);
        startActivity(intent);
    }
    public void signup(View view){
        Intent intent = new Intent(LoginAccount.this, CreateAccount.class);
        startActivity(intent);
    }
}