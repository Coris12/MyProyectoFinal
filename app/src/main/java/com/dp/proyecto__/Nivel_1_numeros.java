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

public class Nivel_1_numeros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel_1_numeros);

        Button botonRegresar = (Button)  findViewById(R.id.button);
        botonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAnimal= new Intent (getApplicationContext(),Number_menu.class);
                startActivity(intentAnimal);
                finish();
            }
        });

        final MediaPlayer mediaPlayercero = MediaPlayer.create(this, R.raw.cero);
        final MediaPlayer mediaPlayeruno = MediaPlayer.create(this, R.raw.uno);
        final  MediaPlayer mediaPlayerdos = MediaPlayer.create(this, R.raw.dos);
        final MediaPlayer mediaPlayertres = MediaPlayer.create(this, R.raw.tres);
        final MediaPlayer mediaPlayercuatro = MediaPlayer.create(this, R.raw.cuatro);
        final MediaPlayer mediaPlayercinco = MediaPlayer.create(this, R.raw.cinco);
        final MediaPlayer mediaPlayerseis = MediaPlayer.create(this, R.raw.seis);
        final MediaPlayer mediaPlayersiete = MediaPlayer.create(this, R.raw.siete);
        final MediaPlayer mediaPlayerocho = MediaPlayer.create(this, R.raw.ocho);
        final MediaPlayer mediaPlayernueve = MediaPlayer.create(this, R.raw.nueve);
        final TextView texto=(TextView) findViewById(R.id.tex_num);



        ImageView btncero=(ImageView) findViewById(R.id.num_cero);

        ImageView btnuno=(ImageView) findViewById(R.id.num_uno);
        ImageView btndos=(ImageView) findViewById(R.id.num_dos);
        ImageView btntres=(ImageView) findViewById(R.id.num_tres);
        ImageView btncuatro=(ImageView) findViewById(R.id.num_cuatro);
        ImageView btncinco=(ImageView) findViewById(R.id.num_cinco);
        ImageView btnseis=(ImageView) findViewById(R.id.num_seis);
        ImageView btnsiete=(ImageView) findViewById(R.id.num_siete);
        ImageView btnocho=(ImageView) findViewById(R.id.num_ocho);
        ImageView btnnueve=(ImageView) findViewById(R.id.num_nueve);

        btncero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.ceropeces);
                mediaPlayercero.start();
                texto.setText("CERO");

            }
        });
        btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.unpez);
                mediaPlayeruno.start();
                texto.setText("ONE");


            }
        });
        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.dospeces);
                mediaPlayerdos.start();
                texto.setText("TWO");


            }
        });
        btntres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.trespeces);
                mediaPlayertres.start();
                texto.setText("THREE");

            }
        });
        btncuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.cuatropeces);
                mediaPlayercuatro.start();
                texto.setText("FOUR");

            }
        });
        btncinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.cincopeces);
                mediaPlayercinco.start();
                texto.setText("FIVE");

            }
        });btnseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.seispeces);
                mediaPlayerseis.start();
                texto.setText("SIX");

            }
        });
        btnsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.sietepeces);
                mediaPlayersiete.start();
                texto.setText("SEVEN");

            }
        });
        btnocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.ochopeces);
                mediaPlayerocho.start();
                texto.setText("EIGHT");
            }
        });
        btnnueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.nuevepeces);
                mediaPlayernueve.start();
                texto.setText("NINE");

            }
        });

    }
}