package com.dp.proyecto__;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Color_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_menu);

        Button nivel1=(Button)findViewById(R.id.btn);
        Button nivel2=(Button)findViewById(R.id.btn4);
        Button nivel3=(Button)findViewById(R.id.btn5);

        ImageButton botonRegresar = (ImageButton)  findViewById(R.id.btnregresar);


        nivel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAnimales= new Intent (getApplicationContext(), Nivel1_colores.class);
                startActivity(intentAnimales);
                finish();

            }
        });
        nivel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAnimales= new Intent (getApplicationContext(), Nivel_2_colores.class);
                startActivity(intentAnimales);
                finish();

            }
        });

        nivel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAnimales= new Intent (getApplicationContext(), Nivel_3_Colores.class);
                startActivity(intentAnimales);
                finish();

            }
        });
        botonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAnimales= new Intent (getApplicationContext(),Menu_principal.class);
                startActivity(intentAnimales);
                finish();

            }
        });
    }
}
