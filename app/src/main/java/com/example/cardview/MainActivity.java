package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView schoolCardview,hospitalCardview,restaurantCardView,airportCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        schoolCardview = findViewById(R.id.schoolCardView_Id);
        hospitalCardview = findViewById(R.id.hospitalCardView_Id);
        restaurantCardView = findViewById(R.id.restaurantCardView_Id);
        airportCardView = findViewById(R.id.airporyCardView_Id);

        schoolCardview.setOnClickListener(this);
        hospitalCardview.setOnClickListener(this);
        restaurantCardView.setOnClickListener(this);
        airportCardView.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        if (v.getId()==R.id.schoolCardView_Id){

            Intent intent = new Intent(MainActivity.this,SchoolActivity.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.hospitalCardView_Id){

            Intent intent = new Intent(MainActivity.this,HospitalActivity.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.restaurantCardView_Id){

            Intent intent = new Intent(MainActivity.this,RestaurantActivity.class);
            startActivity(intent);
        }
        else if (v.getId()==R.id.airporyCardView_Id){
            Intent intent = new Intent(MainActivity.this,AirportActivity.class);
            startActivity(intent);

        }



    }
}