package com.dp.proyecto__;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Color_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_menu);

        Button nivel1=(Button)findViewById(R.id.btn);

        nivel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAnimales= new Intent (getApplicationContext(), Nivel1_colores.class);
                startActivity(intentAnimales);
                finish();

            }
        });
    }
}
