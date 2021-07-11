package com.example.myshoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView T_shirts,frocks,trousers,swimsuits;
    private ImageView shoe,sunglasses,hats;

    private Button Logoutbtn,CheckOrdersBtn,maintainProductsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        frocks=(ImageView)findViewById(R.id.frock);
        trousers=(ImageView)findViewById(R.id.trouser);
        swimsuits=(ImageView)findViewById(R.id.swimsuit);
        shoe=(ImageView)findViewById(R.id.shoe);
        sunglasses=(ImageView)findViewById(R.id.sunglasses);
        hats=(ImageView)findViewById(R.id.hat);


maintainProductsBtn=(Button)findViewById(R.id.maintain_btn);
maintainProductsBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(AdminCategoryActivity.this,HomeActivity.class);
        intent.putExtra("Admin","Admin");
        startActivity(intent);
    }
});

        frocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Frocks");
                startActivity(intent);
            }
        });

        trousers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Trousers");
                startActivity(intent);
            }
        });

        swimsuits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Swimsuits");
                startActivity(intent);
            }
        });

        shoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Shoe");
                startActivity(intent);
            }
        });

        sunglasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Sunglasses");
                startActivity(intent);
            }
        });

        hats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminCategoryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","hats");
                startActivity(intent);
            }
        });
    }


}