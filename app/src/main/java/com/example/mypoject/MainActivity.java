package com.example.mypoject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import android.os.Bundle;

import com.example.mypoject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}