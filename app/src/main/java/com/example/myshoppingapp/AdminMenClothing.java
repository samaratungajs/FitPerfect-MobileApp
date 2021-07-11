package com.example.myshoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminMenClothing extends AppCompatActivity {

    private ImageView denims, trousers, suits;
    private ImageView shorts, sportswear, shirts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_men_clothing);

        denims = (ImageView) findViewById(R.id.denims);
        trousers = (ImageView) findViewById(R.id.mtrouser);
        suits = (ImageView) findViewById(R.id.suits);
        shorts = (ImageView) findViewById(R.id.shorts);
        sportswear = (ImageView) findViewById(R.id.sportswear);
        shirts = (ImageView) findViewById(R.id.shirts);

        denims.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminMenClothing.this, AdminAddMensProductActivity.class);
                intent.putExtra("category", "Denims");
                startActivity(intent);
            }
        });

        trousers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminMenClothing.this, AdminAddMensProductActivity.class);
                intent.putExtra("category", "Trousers");
                startActivity(intent);
            }
        });

        suits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminMenClothing.this, AdminAddMensProductActivity.class);
                intent.putExtra("category", "Suits");
                startActivity(intent);
            }
        });

        shorts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminMenClothing.this, AdminAddMensProductActivity.class);
                intent.putExtra("category", "Shorts");
                startActivity(intent);
            }
        });

        sportswear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminMenClothing.this, AdminAddMensProductActivity.class);
                intent.putExtra("category", "Sportswear");
                startActivity(intent);
            }
        });

        shirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminMenClothing.this, AdminAddMensProductActivity.class);
                intent.putExtra("category", "Shirts");
                startActivity(intent);
            }
        });


    }

}
