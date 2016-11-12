package com.example.chua.lab2_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class TraceActivity extends AppCompatActivity {
    String msg ="Android";

    //called when activity is first create
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreate() event");

    }
    //called when activity is about to become visible
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");
    }

    //called when activity is no longer visible
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
    }

    //called when activity is destroyed
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
    }

    //called when activity is taking focus
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The onPause() event");
    }

    //called when activity has become visible
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
    }



}
