package com.example.splashscreen;// Package declaration, defining the package name for this class


// Import statements to include necessary Android and Java classes

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle; // Importing the Bundle class used to pass data between activities
import android.content.pm.ActivityInfo;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar; // Importing the Toolbar widget for app bar
import androidx.appcompat.app.AppCompatActivity; // Importing AppCompatActivity class for compatibility support


// Main activity class declaration, extending AppCompatActivity to use support library features
public class MainActivity extends AppCompatActivity {

    // Overriding the onCreate method which is called when the activity is created
    // Declaration of the TextView for the continue button

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        // Setting the content view to the welcome page layout
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // Initializing UI components
        init();
    }
    protected void init() {
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        myToolbar.setTitle(getString(R.string.toolbar_heading));

    }
}
