package com.example.buttomnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

//    public void btnMainToRegist(View view) {
//        Intent intent = new Intent(Home.this,RegisterActivity.class);
//        startActivity(intent);
//    }
//
    public void btnMainToLogin(View view) {
        Intent intent = new Intent(MainActivity_Home.this,LoginActivity.class);
        startActivity(intent);
    }

//    public void btnMainToLocation(View view) {
//        Intent intent = new Intent(Home.this,NonRegistLocation.class);
//        startActivity(intent);
//    }
//
//    public void btnMainToTrashcan(View view) {
//        Intent intent = new Intent(Home.this,NonRegistTrashcan.class);
//        startActivity(intent);
//    }
}