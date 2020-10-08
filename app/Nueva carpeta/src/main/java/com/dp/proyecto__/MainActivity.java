package com.dp.proyecto__;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//el boton de iniciar me permite pasar a la siguinete pantalla de menu principal-----------------------------------------------------------
        Button btnIniciar= (Button) findViewById(R.id.btnIniciarSesion);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenuP = new Intent(getApplicationContext(),Intrucciones_Generales.class);
                startActivity(intentMenuP);
            }
        });
//el boton de registro me permite pasar a la siguinete pantalla de menu principal-----------------------------------------------------------
        Button btnRegistro= (Button) findViewById(R.id.btnRegistrarse);
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRegistro= new Intent(getApplicationContext(),Registro.class);
                startActivity(intentRegistro);
            }
        });
    }
}