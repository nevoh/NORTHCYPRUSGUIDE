package com.example.northcyprusguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.widget.CardView hotels = (android.support.v7.widget.CardView) findViewById(R.id.hotels);

        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);

                startActivity(hotelsIntent);
            }
        });


        android.support.v7.widget.CardView food = (android.support.v7.widget.CardView) findViewById(R.id.food);

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);

                startActivity(foodIntent);
            }
        });


        android.support.v7.widget.CardView attractions = (android.support.v7.widget.CardView) findViewById(R.id.attractions);

        attractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class);

                startActivity(attractionsIntent);
            }
        });



        android.support.v7.widget.CardView universities = (android.support.v7.widget.CardView) findViewById(R.id.universities);

        universities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent universitiesIntent = new Intent(MainActivity.this, UniversitiesActivity.class);

                startActivity(universitiesIntent);
            }
        });


        android.support.v7.widget.CardView nightLife = (android.support.v7.widget.CardView) findViewById(R.id.nigth_life);

        nightLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nightLifeIntent = new Intent(MainActivity.this, NightLifeActivity.class);

                startActivity(nightLifeIntent);
            }
        });


        android.support.v7.widget.CardView events = (android.support.v7.widget.CardView) findViewById(R.id.events);

        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventsIntent = new Intent(MainActivity.this, EventsActivity.class);

                startActivity(eventsIntent);
            }
        });



        android.support.v7.widget.CardView cities = (android.support.v7.widget.CardView) findViewById(R.id.cities);

        cities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent citiesIntent = new Intent(MainActivity.this, CitiesActivity.class);

                startActivity(citiesIntent);
            }
        });


        android.support.v7.widget.CardView appartments = (android.support.v7.widget.CardView) findViewById(R.id.appatments);

        appartments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent appartmentsIntent = new Intent(MainActivity.this, AppartmentsActivity.class);

                startActivity(appartmentsIntent);
            }
        });



    }


}
