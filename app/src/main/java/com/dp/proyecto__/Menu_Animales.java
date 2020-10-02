package com.dp.proyecto__;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_Animales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__animales);

        Button btnParejas =(Button) findViewById(R.id.btnParejaA);
Button btnRegresar= (Button) findViewById(R.id.btnnivel2);
        btnParejas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentParejas= new Intent(getApplicationContext(), Pareja_Animales.class);
                startActivity(intentParejas);
                finish();
            }
        });
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentParejas2= new Intent(getApplicationContext(), Menu_principal.class);
                startActivity(intentParejas2);
            }
        });
    }
}