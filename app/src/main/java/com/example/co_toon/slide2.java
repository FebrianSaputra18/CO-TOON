package com.example.co_toon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class slide2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide2);
    }
    public void slide2(View view){
        Intent intent = new Intent(slide2.this, Slide3.class);
        startActivity(intent);
    }
}