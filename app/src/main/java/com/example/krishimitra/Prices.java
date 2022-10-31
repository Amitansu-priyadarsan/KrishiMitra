package com.example.krishimitra;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Prices extends AppCompatActivity {
    public CardView prc1,prc2,prc3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prices);
        prc1=(CardView) findViewById(R.id.prcard1);
        prc1.setOnClickListener(view -> openMsp());

        prc2=(CardView) findViewById(R.id.prcard2);
        prc2.setOnClickListener(view ->openFertilizer());

        prc3=(CardView) findViewById(R.id.prcard3);
        prc3.setOnClickListener(view -> openSeed());

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.home2:
                        startActivity(new Intent(getApplicationContext(),Home.class));
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
}