package com.dp.proyecto__;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Nivel1_colores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel1_colores);
        ImageButton botonRegresar = (ImageButton)  findViewById(R.id.btco3);
        botonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAnimal= new Intent (getApplicationContext(),Color_menu.class);
                startActivity(intentAnimal);
                finish();
            }
        });


        final MediaPlayer mediaPlayercero = MediaPlayer.create(this, R.raw.yellow);
        final MediaPlayer mediaPlayeruno = MediaPlayer.create(this, R.raw.blue);
        final  MediaPlayer mediaPlayerdos = MediaPlayer.create(this, R.raw.brown);
        final MediaPlayer mediaPlayertres = MediaPlayer.create(this, R.raw.red);
        final MediaPlayer mediaPlayercuatro = MediaPlayer.create(this, R.raw.pink);
        final MediaPlayer mediaPlayercinco = MediaPlayer.create(this, R.raw.green);

        final TextView texto=(TextView) findViewById(R.id.tex_num);



        ImageView btnamarillo=(ImageView) findViewById(R.id.btn_amarillo);
        ImageView btnazul=(ImageView) findViewById(R.id.btn_azul);
        ImageView btncafe=(ImageView) findViewById(R.id.btn_cafe);
        ImageView btnrojo=(ImageView) findViewById(R.id.btn_rojo);
        ImageView btnverde=(ImageView) findViewById(R.id.btn_verde);
        ImageView btnrosa=(ImageView) findViewById(R.id.btn_rosa);


        btnamarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.pulpamarillo);
                mediaPlayercero.start();
                texto.setText("YELLOW");
         //       texto.setTextColor(Integer.parseInt("YELLOW"));

            }
        });
        btnazul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.pulpazul);
                mediaPlayeruno.start();
                texto.setText("BLUE");
                //texto.setTextColor(Integer.parseInt("BLUE"));


            }
        });
        btncafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.pulpcafe);
                mediaPlayerdos.start();
                texto.setText("BROWN");
           //     texto.setTextColor(Integer.parseInt("BROWN"));


            }
        });
        btnrojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.pulprojo);
                mediaPlayertres.start();
                texto.setText("RED");
             //   texto.setTextColor(Integer.parseInt("RED"));
            }
        });
        btnrosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.pulprosa);
                mediaPlayercuatro.start();
                texto.setText("PINK");
               // texto.setTextColor(Integer.parseInt("PINK"));
            }
        });
        btnverde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.pulpverde);
                mediaPlayercinco.start();
                texto.setText("GREEN");
                //texto.setTextColor(Integer.parseInt("GREEN"));
            }
        });

    }
}