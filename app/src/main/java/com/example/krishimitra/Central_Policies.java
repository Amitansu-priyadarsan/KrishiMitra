package com.example.krishimitra;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Central_Policies extends AppCompatActivity {
    public CardView c1,c2,c3,c4,c5,c6,c7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central_policies);

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
                        startActivity(new Intent(getApplicationContext(),Policies.class));
                        return true;
                }
                return false;
            }
        });



        c1=(CardView) findViewById(R.id.policiescard1);
        c1.setOnClickListener(view -> openPMFBY());
        c2=(CardView) findViewById(R.id.policiescard2);
        c2.setOnClickListener(view -> openGraminBhandaranYojana());
        c3=(CardView) findViewById(R.id.policiescard3);
        c3.setOnClickListener(view -> openPradhanMantriKisanMaanDhanYojana());
        c4=(CardView) findViewById(R.id.policiescard4);
        c4.setOnClickListener(view -> opensammannidhi());
        c5=(CardView) findViewById(R.id.policiescard5);
        c5.setOnClickListener(view -> openKCC());
        c6=(CardView) findViewById(R.id.policiescard6);
        c6.setOnClickListener(view -> openNationalMissionForSustainableAgriculture());
        c7=(CardView) findViewById(R.id.policiescard7);
        c7.setOnClickListener(view -> openMicroIrrigationFundscheme());


    }

    private void opensammannidhi() {
        Intent intent=new Intent(this,pmkisansanman.class);
        startActivity(intent);
    }

    private void openMicroIrrigationFundscheme() {

        Intent intent=new Intent(this,microirrigation.class);
        startActivity(intent);
    }

    private void openNationalMissionForSustainableAgriculture() {
        Intent intent=new Intent(this,natinalmissionforsustainable.class);
        startActivity(intent);
    }

    private void openKCC() {  Intent intent=new Intent(this,kisancreditcard1.class);
        startActivity(intent);
    }

    private void openPradhanMantriKisanMaanDhanYojana() {  Intent intent=new Intent(this,pradhanmantrikisan.class);
        startActivity(intent);
    }

    private void openGraminBhandaranYojana() {  Intent intent=new Intent(this,garimbhandran.class);
        startActivity(intent);


    }

    private void openPMFBY() {
        Intent intent=new Intent(this,prandhan.class);
        startActivity(intent);
    }
}
