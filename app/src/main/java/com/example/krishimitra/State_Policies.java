package com.example.krishimitra;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class State_Policies extends AppCompatActivity {
    public CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_policies);
        c1=(CardView) findViewById(R.id.card1);
        c1.setOnClickListener(view -> openKarnataka());

        c2=(CardView) findViewById(R.id.card2);
        c2.setOnClickListener(view -> openjharkhand());

        c3=(CardView) findViewById(R.id.card3);
        c3.setOnClickListener(view -> openGujrat());

        c4=(CardView) findViewById(R.id.card4);
        c4.setOnClickListener(view -> openuttarpradesh());

        c5=(CardView) findViewById(R.id.card5);
        c5.setOnClickListener(view -> openodisha());

        c6=(CardView) findViewById(R.id.card6);
        c6.setOnClickListener(view -> opentripura());

        c7=(CardView) findViewById(R.id.card7);
        c7.setOnClickListener(view -> openmadhyapradesh());

        c8=(CardView) findViewById(R.id.card8);
        c8.setOnClickListener(view -> openbihar());

        c9=(CardView) findViewById(R.id.card9);
        c9.setOnClickListener(view -> openwestbengal());

        c10=(CardView) findViewById(R.id.card10);
        c10.setOnClickListener(view -> opentelangana());

        c11=(CardView) findViewById(R.id.card11);
        c11.setOnClickListener(view -> openhimanchal());

        c12=(CardView) findViewById(R.id.card12);
        c12.setOnClickListener(view -> openassam());

        c13=(CardView) findViewById(R.id.card13);
        c13.setOnClickListener(view -> openmaharastra());

        c14=(CardView) findViewById(R.id.card14);
        c14.setOnClickListener(view -> openpunjab());

        c15=(CardView) findViewById(R.id.card15);
        c15.setOnClickListener(view -> openAP());

        c16=(CardView) findViewById(R.id.card16);
        c16.setOnClickListener(view -> opengoa());


        c17=(CardView) findViewById(R.id.card17);
        c17.setOnClickListener(view -> openrajasthan());

        c18=(CardView) findViewById(R.id.card18);
        c18.setOnClickListener(view -> opentamilnadu());

        c19=(CardView) findViewById(R.id.card19);
        c19.setOnClickListener(view -> openuttrakhand());

        c20=(CardView) findViewById(R.id.card20);
        c20.setOnClickListener(view -> openandhrapradesh());

       
        
        
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
    }

    private void openandhrapradesh() {
        Intent intent=new Intent(this,andrpradesh.class);
        startActivity(intent);
    }

    private void openuttrakhand() {
        Intent intent=new Intent(this,uttrakhand.class);
        startActivity(intent);
    }

    private void opentamilnadu() {
        Intent intent=new Intent(this,tamilnadu.class);
        startActivity(intent);
    }

    private void openrajasthan() {
        Intent intent=new Intent(this,rajasthan.class);
        startActivity(intent);
    }

    private void opengoa() {
        Intent intent=new Intent(this,goa.class);
        startActivity(intent);
    }

    private void openAP() {
        Intent intent=new Intent(this,arunanchalpradesh.class);
        startActivity(intent);
    }

    private void openpunjab() {
        Intent intent=new Intent(this,punjabxml.class);
        startActivity(intent);
    }

    private void openmaharastra() {
        Intent intent=new Intent(this,Maharastra.class);
        startActivity(intent);
    }

    private void openassam() {
        Intent intent=new Intent(this,assam.class);
        startActivity(intent);
    }

    private void openhimanchal() {
        Intent intent=new Intent(this,himachal.class);
        startActivity(intent);
    }

    private void opentelangana() {
        Intent intent=new Intent(this,Telangana.class);
        startActivity(intent);
    }

    private void openwestbengal() {
        Intent intent=new Intent(this,westbengal.class);
        startActivity(intent);
    }

    private void openbihar() {
        Intent intent=new Intent(this,bihar.class);
        startActivity(intent);
    }

    private void openmadhyapradesh() {
        Intent intent=new Intent(this,madhyapradesh.class);
        startActivity(intent);
    }

    private void opentripura() {
        Intent intent=new Intent(this,tripura.class);
        startActivity(intent);
    }

    private void openodisha() {
        Intent intent=new Intent(this,odisha.class);
        startActivity(intent);
    }

    private void openuttarpradesh() {
        Intent intent=new Intent(this,uttarpradesh2.class);
        startActivity(intent);
    }

    private void openGujrat() {
        Intent intent=new Intent(this,gujurat2.class);
        startActivity(intent);
    }

    private void openjharkhand() {
        Intent intent=new Intent(this,jharkhand2.class);
        startActivity(intent);
    }

    private void openKarnataka() {
        Intent intent=new Intent(this,karnataka.class);
        startActivity(intent);
    }

}