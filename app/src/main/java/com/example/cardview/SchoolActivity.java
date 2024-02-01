package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

public class SchoolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);

//Hiding Action bar
        getSupportActionBar().hide();

//Hiding Title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,

                            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );



    }
}