package com.example.intelcorei5.travelinfo;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rellay_Sylhet, rellay_Location, rellay_Rangamati, rellay_Ponchogar,
            rellay_Coxsbazar, rellay_khulna, rellay_Bandarban, rellay_Weather;
    LinearLayout currencyid;

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rellay_Sylhet = findViewById(R.id.rellay_Sylhet);
        rellay_Location = findViewById(R.id.rellay_Location);
        rellay_Rangamati = findViewById(R.id.rellay_Rangamati);
        rellay_Ponchogar = findViewById(R.id.rellay_Ponchogar);
        rellay_Coxsbazar = findViewById(R.id.rellay_Coxsbazar);
        rellay_khulna = findViewById(R.id.rellay_Khulna);
        rellay_Bandarban = findViewById(R.id.rellay_Bandarban);
        rellay_Weather = findViewById(R.id.rellay_Weather);



            rellay_Sylhet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, activity_sylhet.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity(intent);
                }
            });



            rellay_Location.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, activity_location.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity(intent);
                }
            });



            rellay_Rangamati.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, activity_rangamati.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity(intent);
                }
            });



                rellay_Ponchogar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, activity_ponchogar.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                        startActivity(intent);
                    }
                });


                rellay_Coxsbazar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, activity_coxsbazar.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                        startActivity(intent);
                    }
                });


                rellay_khulna.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, activity_khulna.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                        startActivity(intent);
                    }
                });



                rellay_Bandarban.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, activity_bandarban.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                        startActivity(intent);
                    }
                });



                rellay_Weather.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, MyWeatherApp.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                        startActivity(intent);
                    }
                });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navigation_menu, menu);
        return true;}


        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            int ids = item.getItemId();
            if (ids == R.id.ids) {
                Intent intent = new Intent(MainActivity.this, activity_currency.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
                return true;

                //Test Push
            }
            return true;
        }


}
