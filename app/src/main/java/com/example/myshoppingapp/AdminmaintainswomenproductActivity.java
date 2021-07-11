package com.example.myshoppingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.Objects;

public class AdminmaintainswomenproductActivity extends AppCompatActivity {

    private Button applyChangesBtn,deleteBtn;
    private EditText name,price,description;
    private ImageView imageView;

    private String productID="";
    private DatabaseReference productRe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_maintain_products);

        productID=getIntent().getStringExtra("pid");
        productRe= FirebaseDatabase.getInstance().getReference().child("Women Products").child(productID);

        applyChangesBtn=findViewById(R.id.apply_changes_btn);
        name=(EditText) findViewById(R.id.product_name_maintain);
        price=(EditText) findViewById(R.id.product_price_maintain);
        description=(EditText) findViewById(R.id.product_description_maintain);
        imageView=findViewById(R.id.product_image_maintain);
        deleteBtn=findViewById(R.id.delete_product_btn);

        displaySpecificProductInfo();

        applyChangesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                applyChanges();
            }
        });

        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteThisProduct();
            }
        });
    }

    private void deleteThisProduct() {
        productRe.removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {

                Intent intent=new Intent(AdminmaintainswomenproductActivity.this,AdminWClothing.class);
                startActivity(intent);
                finish();

                Toast.makeText(AdminmaintainswomenproductActivity.this,"The product is deleted successfully",Toast.LENGTH_LONG).show();
            }
        });
    }


    private void applyChanges() {
        String pName=name.getText().toString();
        String pPrice=price.getText().toString();
        String pDescription=description.getText().toString();

        if(pName.equals(""))
        {
            Toast.makeText(this,"Write down product name",Toast.LENGTH_SHORT).show();
        }
        else if(pPrice.equals(""))
        {
            Toast.makeText(this,"Write down product price",Toast.LENGTH_SHORT).show();
        }
        else if(pDescription.equals(""))
        {
            Toast.makeText(this,"Write down product description",Toast.LENGTH_SHORT).show();
        }
        else
        {
            HashMap<String, Object> productMap = new HashMap<>();
            productMap.put("pid", productID);
            productMap.put("description", pDescription);
            productMap.put("price", pPrice);
            productMap.put("pname", pName);

            productRe.updateChildren(productMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if(task.isSuccessful())
                    {
                        Toast.makeText(AdminmaintainswomenproductActivity.this,"Changes applied successfully",Toast.LENGTH_SHORT).show();

                        Intent intent=new Intent(AdminmaintainswomenproductActivity.this,AdminWClothing.class);
                        startActivity(intent);
                        finish();
                    }
                }
            });
        }
    }


    private void displaySpecificProductInfo() {

        productRe.addValueEventListener(new ValueEventListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onDataChange(@NonNull DataSnapshot datasnapshot) {
                if(datasnapshot.exists())
                {
                    String pName=datasnapshot.child("pname").getValue().toString();
                    String pPrice=datasnapshot.child("price").getValue().toString();
                    String pDescription=datasnapshot.child("description").getValue().toString();
                    String pImage= Objects.requireNonNull(datasnapshot.child("image").getValue()).toString();

                    name.setText(pName);
                    price.setText(pPrice);
                    description.setText(pDescription);
                    Picasso.get().load(pImage).into(imageView);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }


}