package com.example.resepmakananminuman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Makananresep extends AppCompatActivity {
    ImageView nasgor;
    ImageView boba;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makananresep);
        nasgor = (ImageView) findViewById(R.id.nasgor);
        boba = (ImageView) findViewById(R.id.boba);

        nasgor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Makananresep.this, Nasigoreng.class);
                startActivity(intent);
            }
        });

        boba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abi = new Intent(Makananresep.this, Boba.class);
                startActivity(abi);
            }
        });


    }
}