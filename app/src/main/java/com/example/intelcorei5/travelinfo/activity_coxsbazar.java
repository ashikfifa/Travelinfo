package com.example.intelcorei5.travelinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class activity_coxsbazar extends AppCompatActivity {

    ImageView rellay_guliakhali,rellay_saint,rellay_coxbazar,rellay_chandranath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coxsbazar);

        rellay_guliakhali=findViewById(R.id.rellay_guliakhali);
        rellay_saint=findViewById(R.id.rellay_saint);
        rellay_coxbazar=findViewById(R.id.rellay_coxbazar);
        rellay_chandranath=findViewById(R.id.rellay_chandranath);


        rellay_guliakhali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(activity_coxsbazar.this,activity_guliakhali.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        rellay_coxbazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(activity_coxsbazar.this,activity_coxbazar.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        rellay_chandranath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(activity_coxsbazar.this,activity_chandranath.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        rellay_saint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(activity_coxsbazar.this,activity_saint.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
    }
}
