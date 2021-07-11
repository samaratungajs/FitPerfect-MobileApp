package com.example.myshoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminHomeActivity extends AppCompatActivity {

    private Button Logoutbtn,CheckOrdersBtn,maintainWProductsBtn,checkApproveWomenBtn,maintainMProductsBtn,maintainKProductsBtn, maintainaccesoryProductsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);


        maintainWProductsBtn=(Button)findViewById(R.id.maintain_btn);
        Logoutbtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);
        checkApproveWomenBtn = (Button) findViewById(R.id.check_approve_new_orders_btn);
        maintainMProductsBtn=(Button)findViewById(R.id.maintain_Men_btn);
        maintainKProductsBtn=(Button)findViewById(R.id.maintain_Kids_btn);
        maintainaccesoryProductsBtn=(Button)findViewById(R.id.maintain_accessories_btn);

        maintainWProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminHomeActivity.this,AdminWomenCategoryDisplay.class);
                intent.putExtra("Admin","Admin");
                startActivity(intent);
            }
        });

        maintainMProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminHomeActivity.this,AdminMenCategoryDisplay.class);
                intent.putExtra("Admin","Admin");
                startActivity(intent);
            }
        });

        maintainKProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminHomeActivity.this,AdminKidsCategoryDisplay.class);
                intent.putExtra("Admin","Admin");
                startActivity(intent);
            }
        });

        maintainaccesoryProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminHomeActivity.this,AdminAccessorycategoryDisplay.class);
                intent.putExtra("Admin","Admin");
                startActivity(intent);
            }
        });

        Logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminHomeActivity.this,MainActivity.class);
                intent.putExtra("Admin","Admin");
                startActivity(intent);
            }
        });

        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminHomeActivity.this,AdminNewOrdersActivity.class);
                intent.putExtra("Admin","Admin");
                startActivity(intent);
            }
        });

        checkApproveWomenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminHomeActivity.this,CheckNewWomenProducts.class);
                intent.putExtra("Admin","Admin");
                startActivity(intent);
            }
        });
    }
}