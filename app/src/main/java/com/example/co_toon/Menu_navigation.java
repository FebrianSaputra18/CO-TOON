package com.example.co_toon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu_navigation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }
    public void profil1(View view){
        Intent intent = new Intent(Menu_navigation.this, Profil.class);
        startActivity(intent);
    }
}
