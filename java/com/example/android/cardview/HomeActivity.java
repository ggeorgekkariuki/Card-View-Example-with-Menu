package com.example.android.cardview;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        int SPLASH_TIME_OUT = 4000;
        new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent mainIntent = new Intent(HomeActivity.this, MainActivity.class);
               startActivity(mainIntent);
               finish();
           }
       }, SPLASH_TIME_OUT);
    }
}
