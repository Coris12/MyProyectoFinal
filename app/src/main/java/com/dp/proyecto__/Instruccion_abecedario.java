package com.dp.proyecto__;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Instruccion_abecedario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruccion_abecedario);

        ImageButton sig =(ImageButton)findViewById(R.id.button1);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),Alphabet_menu.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
