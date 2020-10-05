package com.dp.proyecto__;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Alphabet_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpabeth_menu);

        Button nivel1 = (Button) findViewById(R.id.btn1);
        Button nivel2 = (Button) findViewById(R.id.btn2);
        Button nivel3 = (Button) findViewById(R.id.btn3);
        ImageButton botonRegresar = (ImageButton)  findViewById(R.id.btnregresar3);


        nivel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAbecedario= new Intent (getApplicationContext(), nivel1Abecedario.class);
                startActivity(intentAbecedario);
                finish();

            }
        });

        nivel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbecedario= new Intent (getApplicationContext(), Nivel2_abecedario.class);
                startActivity(intentAbecedario);
                finish();
            }
        });

        nivel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbecedario= new Intent (getApplicationContext(),Nivel3_Abecedario.class);
                startActivity(intentAbecedario);
                finish();
            }
        });

        botonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbecedario= new Intent (getApplicationContext(),Menu_principal.class);
                startActivity(intentAbecedario);
                finish();
            }
        });
    }}

