package com.dp.proyecto__;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_Animales extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__animales);

        Button nivel1 = (Button) findViewById(R.id.btnnivel1);
        Button nivel2 = (Button) findViewById(R.id.btnnivel2);
        Button nivel3 = (Button) findViewById(R.id.btnlevel3);


        nivel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentParejas= new Intent(getApplicationContext(), Pareja_Animales.class);
                startActivity(intentParejas);
                finish();
            }
        });

        nivel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAnimal= new Intent (getApplicationContext(), Nivel2_Animales.class);
                startActivity(intentAnimal);
                finish();
            }
        });

        nivel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAnimal= new Intent (getApplicationContext(),Nivel3_Animales.class);
                startActivity(intentAnimal);
                finish();
            }
        });

    }}