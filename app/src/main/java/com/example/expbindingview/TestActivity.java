package com.example.expbindingview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.expbindingview.databinding.ActivityMainBinding;
import com.example.expbindingview.databinding.ActivityTestBinding;
public class TestActivity extends AppCompatActivity {
private ActivityTestBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityTestBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding .txt1.setText("aa");
        binding .txt2.setText("bb");
         }
}