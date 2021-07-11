package com.example.myshoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminKidsClothing extends AppCompatActivity {

    private ImageView kfrocks,ktrousers,kswimsuits;
    private ImageView kskirt,kshort,kshirts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_kids_clothing);


        kfrocks=(ImageView)findViewById(R.id.kfrock);
        ktrousers=(ImageView)findViewById(R.id.ktrouser);
        kswimsuits=(ImageView)findViewById(R.id.kswimsuit);
        kskirt=(ImageView)findViewById(R.id.kskirt);
        kshort=(ImageView)findViewById(R.id.kshort);
        kshirts=(ImageView)findViewById(R.id.kshirts);

        kfrocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminKidsClothing.this,AdminAddKidsProductActivity.class);
                intent.putExtra("category","Frocks");
                startActivity(intent);
            }
        });

        ktrousers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminKidsClothing.this,AdminAddKidsProductActivity.class);
                intent.putExtra("category","Trousers");
                startActivity(intent);
            }
        });

        kswimsuits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminKidsClothing.this,AdminAddKidsProductActivity.class);
                intent.putExtra("category","Swimsuits");
                startActivity(intent);
            }
        });

        kskirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminKidsClothing.this,AdminAddKidsProductActivity.class);
                intent.putExtra("category","Skirt");
                startActivity(intent);
            }
        });

        kshort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminKidsClothing.this,AdminAddKidsProductActivity.class);
                intent.putExtra("category","Short");
                startActivity(intent);
            }
        });

        kshirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminKidsClothing.this,AdminAddKidsProductActivity.class);
                intent.putExtra("category","Shirts");
                startActivity(intent);
            }
        });

    }
}