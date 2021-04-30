package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        String name = "tomten";


        Intent intent = getIntent();
        if (intent != null){
            String temp = intent.getStringExtra("name");
            if (temp != null) {
                name = temp;
            }
        }

        TextView text = findViewById(R.id.text);
        text.setText(name);

        Button close = findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MAIN", "Stänger aktiviten");

                finish();
            }
        });
    }
}
