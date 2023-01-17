package com.example.expbindingview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.expbindingview.databinding.ActivityMainBinding;
import com.example.expbindingview.databinding.ActivityTestBinding;

public class MainActivity extends AppCompatActivity {
    //N'oubliez pas de rajouter buildFeatures dans la partie
    // android du fichier build.gradle
  //        buildFeatures {
    //viewBinding true
    //    }
     //Seuls les éléments ayant un id pouvent apparaitre ici
    //ViewBinding génère une classe portant le nom du fichier XML
    // en Pascal avec le mot “Binding” accolé, cela pour chaque
    // fichier de vue (sauf s’il comporte tools:viewBindingIgnore="true")
    //
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.txtHello.setText("Bonjour binding");
    }
}