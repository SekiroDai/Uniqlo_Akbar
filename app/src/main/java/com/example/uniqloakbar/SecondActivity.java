package com.example.uniqloakbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // untuk memindahkan ke MainActivity
        ImageButton buttonMain = findViewById(R.id.imageView5);
        buttonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // untuk memindahkan ke SecondActivity
        ImageButton buttonSecond = findViewById(R.id.imageView6);
        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // untuk memindahkan ke ThirdActivity
        ImageButton buttonThird = findViewById(R.id.imageView7);
        buttonThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // untuk memindahkan ke ForthActivity
        ImageButton buttonForth = findViewById(R.id.imageView8);
        buttonForth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FourthActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // untuk memindahkan ke FifthActivity
        ImageButton buttonFifth = findViewById(R.id.imageView9);
        buttonFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FifthActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}