package com.example.deliveriesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    private Button shipmentsButton;
    private Button ordersButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        shipmentsButton = (Button)findViewById(R.id.button_shipments);
        shipmentsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startShipmentsActivity();
            }
        });
        ordersButton = (Button)findViewById(R.id.button_orders);
        ordersButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startOrdersActivity();
            }
        });
    }

    private void startOrdersActivity() {
        Intent i = new Intent(this, OrdersActivity.class);
        startActivity(i);
    }

    private void startShipmentsActivity() {
        Intent i = new Intent(this, ShipmentsActivity.class);
        startActivity(i);
    }
}