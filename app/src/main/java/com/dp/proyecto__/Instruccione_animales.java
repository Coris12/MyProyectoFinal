package com.dp.proyecto__;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Instruccione_animales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.instruccion_animal);

    ImageButton sig =(ImageButton)findViewById(R.id.button2);
        sig.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent =new Intent(getApplicationContext(),Menu_Animales.class);
            startActivity(intent);
            finish();
        }
    });
}
}