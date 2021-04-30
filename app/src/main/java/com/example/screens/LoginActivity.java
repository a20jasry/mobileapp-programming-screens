package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);


        Button open = findViewById(R.id.open);
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("LOGIN", "starta aktiviteten");

                Intent intent = new Intent(LoginActivity. this, MainActivity.class);
                intent.putExtra("name", "Hello!");
                startActivity(intent);

            }
        });
    }
}