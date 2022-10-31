package com.example.krishimitra;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {
    public CardView homec1,homec2,homec3,homec4,homec5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        homec1=(CardView) findViewById(R.id.card1home);
        homec1.setOnClickListener(view -> openPolices());
        homec2=(CardView) findViewById(R.id.card2home);
        homec2.setOnClickListener(view -> openMsp());
        homec3=(CardView) findViewById(R.id.card3home);
        homec3.setOnClickListener(view -> openFertilizer());
        homec4=(CardView) findViewById(R.id.card4home);
        homec4.setOnClickListener(view -> openSeed());
        homec5=(CardView) findViewById(R.id.card5home);
        homec5.setOnClickListener(view -> openWeather());
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.home2);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.home2:
                        return true;

                    case R.id.weather:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        return true;

                    case R.id.policies1:
                        startActivity(new Intent(getApplicationContext(), Policies.class));
                        return true;

                }
                return false;
            }
        });
    }

    private void openWeather() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    private void openFertilizer() {
        Intent intent=new Intent(this,Fertilizer_Prices.class);
        startActivity(intent);
    }

    private void openSeed() {
        Intent intent=new Intent(this,Seed_Prices.class);
        startActivity(intent);
    }

    private void openMsp() {
        Intent intent=new Intent(this,Msp_Prices.class);
        startActivity(intent);
    }

    private void openPolices() {
        Intent intent=new Intent(this,Policies.class);
        startActivity(intent);
    }
}