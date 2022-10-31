package com.example.krishimitra;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Policies extends AppCompatActivity {
    public CardView c1,c2;
    public ImageButton I1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policies);
        c1= findViewById(R.id.pcard1);
        c1.setOnClickListener(view -> opencentral());
        c2= findViewById(R.id.pcard2);
        c2.setOnClickListener(view -> openstate());

        I1= findViewById(R.id.img1);
        I1.setOnClickListener(view -> openpmfby());

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.policies1);
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
                        return true;

                }
                return false;
            }
        });}

    private void openpmfby() {
        Intent intent=new Intent(this,prandhan.class);
        startActivity(intent);
    }

    private void openstate() {
        Intent intent=new Intent(this,State_Policies.class);
        startActivity(intent);
    }

    private void opencentral() {
        Intent intent=new Intent(this,Central_Policies.class);
        startActivity(intent);
    }
}





