package com.example.myshoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myshoppingapp.seller.ui.SellerAddNewProductActivity;

public class AdminWClothing extends AppCompatActivity {

    private ImageView T_shirts,frocks,trousers,swimsuits;
    private ImageView skirt,w_short,saree;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_w_clothing);

        frocks=(ImageView)findViewById(R.id.frock);
        trousers=(ImageView)findViewById(R.id.trouser);
        swimsuits=(ImageView)findViewById(R.id.swimsuit);
        skirt=(ImageView)findViewById(R.id.skirt);
        w_short=(ImageView)findViewById(R.id.w_short);
        saree=(ImageView)findViewById(R.id.saree);




        frocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminWClothing.this, SellerAddNewProductActivity.class);
                intent.putExtra("category","Frocks");
                startActivity(intent);
            }
        });

        trousers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminWClothing.this, SellerAddNewProductActivity.class);
                intent.putExtra("category","Trousers");
                startActivity(intent);
            }
        });

        swimsuits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminWClothing.this, SellerAddNewProductActivity.class);
                intent.putExtra("category","Swimsuits");
                startActivity(intent);
            }
        });

        skirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminWClothing.this, SellerAddNewProductActivity.class);
                intent.putExtra("category","Skirts");
                startActivity(intent);
            }
        });

        w_short.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminWClothing.this, SellerAddNewProductActivity.class);
                intent.putExtra("category","Shorts");
                startActivity(intent);
            }
        });

        saree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminWClothing.this, SellerAddNewProductActivity.class);
                intent.putExtra("category","Saree");
                startActivity(intent);
            }
        });

    }
}