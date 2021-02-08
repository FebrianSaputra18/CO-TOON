package com.example.co_toon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.material.navigation.NavigationView;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView video = (VideoView) findViewById(R.id.videoView5);
        MediaController media = new MediaController(this);
        MediaPlayer mp = new MediaPlayer();
        mp.setLooping(true);
        Uri lokasivideo = Uri.parse("android.resource://" +getPackageName() + "/" + R.raw.vid1);
        video.setVideoURI(lokasivideo);
        video.setMediaController(media);
        video.start();
        video.requestFocus();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setTitle("CO-TOON");
        }
        NavigationView nav_view = findViewById(R.id.nav_view);
        final DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };

        toggle.syncState();
        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Toast.makeText(getApplicationContext(), menuItem.getTitle() + " Selected",
                        Toast.LENGTH_SHORT).show();
                drawer.closeDrawers();
                return true;
            }
        });
    }

    private class Url {
    }
}