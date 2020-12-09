package com.example.deliveriesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //LOGIN ID WINDOW
    EditText username;
    EditText password;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button)findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startMenuActivity();
            }
        });

    }

    private void startMenuActivity() {
        Intent i = new Intent(this, MenuActivity.class);
       /* i.putExtra("fname", etFName.getText().toString());
        i.putExtra("lname", etLName.getText().toString());*/
        startActivity(i);

    }
}