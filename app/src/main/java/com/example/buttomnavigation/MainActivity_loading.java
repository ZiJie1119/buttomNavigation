package com.example.buttomnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.buttomnavigation.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity_loading extends AppCompatActivity {


    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.empty_page);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity_loading.this, MainActivity_main.class);
                startActivity(intent);
//                setContentView(R.layout.activity_main);
//                BottomNavigationView navView = findViewById(R.id.nav_view);
//                binding = ActivityMainBinding.inflate(getLayoutInflater());
//                AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
//                        R.id.navigation_Home, R.id.navigation_Account, R.id.navigation_Location,R.id.navigation_Money,R.id.navigation_Connect)
//                        .build();
//                NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
//                NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//                NavigationUI.setupWithNavController(binding.navView, navController);
            }
        },3000L);



        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

    }

}