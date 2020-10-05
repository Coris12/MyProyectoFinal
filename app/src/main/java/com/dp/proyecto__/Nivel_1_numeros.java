package com.dp.proyecto__;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Nivel_1_numeros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel_1_numeros);


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

            }
        });
        btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.unpez);
                mediaPlayeruno.start();

            }
        });
        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.dospeces);
                mediaPlayerdos.start();

            }
        });
        btntres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.trespeces);
                mediaPlayertres.start();

            }
        });
        btncuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.cuatropeces);
                mediaPlayercuatro.start();

            }
        });
        btncinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.cincopeces);
                mediaPlayercinco.start();

            }
        });btnseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.seispeces);
                mediaPlayerseis.start();

            }
        });
        btnsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.sietepeces);
                mediaPlayersiete.start();

            }
        });
        btnocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.ochopeces);
                mediaPlayerocho.start();
            }
        });
        btnnueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imagen=(ImageView)findViewById(R.id.ImageNumeros);
                imagen.setImageResource(R.drawable.nuevepeces);
                mediaPlayernueve.start();
            }
        });

    }
}