package com.example.ejercicio_7_m5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ejercicio_7_m5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //vista construir modelo y presentador
    }
}