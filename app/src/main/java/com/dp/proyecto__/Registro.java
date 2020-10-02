package com.dp.proyecto__;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        Button btnCancelar= (Button) findViewById(R.id.btnCancelar);
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLogin= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentLogin);
            }
        });
                /*
                Button btnIniciar= (Button) findViewById(R.id.btnIniciarSesion);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenuP = new Intent(getApplicationContext(),Menu_principal.class);
                startActivity(intentMenuP);
            }
        });
                * */
    }
}