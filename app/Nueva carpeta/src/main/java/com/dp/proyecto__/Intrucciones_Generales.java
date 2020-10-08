package com.dp.proyecto__;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Intrucciones_Generales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instruccio_general);
        ImageButton siguente=(ImageButton) findViewById(R.id.button);

        siguente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAnimales= new Intent (getApplicationContext(), Menu_principal.class);
                startActivity(intentAnimales);
                finish();

            }
        });

    }
}