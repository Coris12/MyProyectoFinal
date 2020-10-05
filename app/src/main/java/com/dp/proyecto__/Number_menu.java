package com.dp.proyecto__;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Number_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_menu);

        Button n1=(Button)  findViewById(R.id.btn1);
        ImageButton botonRegresar = (ImageButton)  findViewById(R.id.btn5);



        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRegresar = new Intent(getApplicationContext(),Nivel_1_numeros.class);
                startActivity(intentRegresar);
                finish();
            }
        });
        botonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRegresar = new Intent(getApplicationContext(),Menu_principal.class);
                startActivity(intentRegresar);
                finish();
            }
        });
    }
}
