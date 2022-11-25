package com.example.buttomnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_loading extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.empty_page);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity_loading.this, MainActivity_Home.class);
                startActivity(intent);
            }
        },3000L);



        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

    }

}