package com.example.co_toon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Slide1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide1);
    }
    public void slide1(View view){
        Intent intent = new Intent(Slide1.this, slide2.class);
        startActivity(intent);
    }
}