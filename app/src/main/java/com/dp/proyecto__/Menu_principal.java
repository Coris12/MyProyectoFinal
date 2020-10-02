package com.dp.proyecto__;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Menu_principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        Button botonanimales = (Button) findViewById(R.id.btnAnimales);
        Button botonabecedarion1 = (Button) findViewById(R.id.btnAlfabeto);


        botonanimales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAnimales= new Intent (getApplicationContext(), Menu_Animales.class);
                startActivity(intentAnimales);
                finish();

            }
        });

        botonabecedarion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbecedario= new Intent (getApplicationContext(), nivel1Abecedario.class);
                startActivity(intentAbecedario);
                finish();
            }
        });


    }}
/*
     }
        });        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_13, theCard);
            }
        });
 */