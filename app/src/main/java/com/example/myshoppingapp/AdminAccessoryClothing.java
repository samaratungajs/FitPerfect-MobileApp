package com.example.myshoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminAccessoryClothing extends AppCompatActivity {

    private ImageView shoes,hats,belts;
    private ImageView bracelets,necklaces,watches;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_accessory_clothing);

        shoes=(ImageView)findViewById(R.id.shoes);
        hats=(ImageView)findViewById(R.id.hats);
        belts=(ImageView)findViewById(R.id.belts);
        bracelets=(ImageView)findViewById(R.id.bracelets);
        necklaces=(ImageView)findViewById(R.id.necklaces);
        watches=(ImageView)findViewById(R.id.watches);

        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminAccessoryClothing.this,AdminAddAccessoriesProductActivity.class);
                intent.putExtra("category","Shoes");
                startActivity(intent);
            }
        });

        hats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminAccessoryClothing.this,AdminAddAccessoriesProductActivity.class);
                intent.putExtra("category","Hats");
                startActivity(intent);
            }
        });

        belts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminAccessoryClothing.this,AdminAddAccessoriesProductActivity.class);
                intent.putExtra("category","Belts");
                startActivity(intent);
            }
        });

        bracelets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminAccessoryClothing.this,AdminAddAccessoriesProductActivity.class);
                intent.putExtra("category","Bracelets");
                startActivity(intent);
            }
        });

        necklaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminAccessoryClothing.this,AdminAddAccessoriesProductActivity.class);
                intent.putExtra("category","Necklaces");
                startActivity(intent);
            }
        });

        watches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminAccessoryClothing.this,AdminAddAccessoriesProductActivity.class);
                intent.putExtra("category","Watches");
                startActivity(intent);
            }
        });




    }
}