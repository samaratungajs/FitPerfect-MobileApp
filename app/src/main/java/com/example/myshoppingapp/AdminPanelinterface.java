package com.example.myshoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//import io.paperdb.Paper;

public class AdminPanelinterface extends AppCompatActivity {

    private Button womenbtn,menbtn,kidsbtn,accessobtn;
    private Button logoutBtn, checkordersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_panelinterface);

        Toast.makeText(this, "Welcome Admin", Toast.LENGTH_SHORT).show();

        womenbtn = (Button)findViewById(R.id.women_btn);
        menbtn = (Button)findViewById(R.id.men_btn);
        logoutBtn= (Button)findViewById(R.id.admin_logout_btn);
        checkordersBtn= (Button)findViewById(R.id.check_orders_btn);
        kidsbtn= (Button)findViewById(R.id.kids_btn);
        accessobtn= (Button)findViewById(R.id.access_btn);


        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminPanelinterface.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        checkordersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminPanelinterface.this, AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });


        womenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminPanelinterface.this, AdminWClothing.class);
                startActivity(intent);
            }
        });

        menbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminPanelinterface.this, AdminMenClothing.class);
                startActivity(intent);
            }
        });

        kidsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminPanelinterface.this, AdminKidsClothing.class);
                startActivity(intent);
            }
        });

    }
}