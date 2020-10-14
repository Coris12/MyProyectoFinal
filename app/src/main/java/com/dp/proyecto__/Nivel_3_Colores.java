package com.dp.proyecto__;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;

public class Nivel_3_Colores extends AppCompatActivity {
    TextView tv_p1, tv_p2;
    ImageView iv_11,iv_12,iv_13,iv_21,iv_22,iv_23,iv_31,iv_32,iv_33,iv_41,iv_42,iv_43;

    //array para las imagenes
    Integer[] TargetaArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

     int imagen101, imagen102, imagen103, imagen104, imagen105, imagen106,
             imagen201, imagen202, imagen203, imagen204, imagen205, imagen206;

     int primeraTarjeta, segundaTarjeta;
     int primeClick, segundoClick;
     int NumeroTarjeta= 1;
     int turn= 1;
     int puntosCPU=0 , puntos= 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel_3_colores);
        ImageButton regrsar=(ImageButton)findViewById(R.id.bregresar);

        regrsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Color_menu.class);
                startActivity(intent);
                finish();
            }
        });

        tv_p1 = (TextView) findViewById(R.id.tv_p1);
        tv_p2 = (TextView) findViewById(R.id.tv_p2);

        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);
        iv_23 = (ImageView) findViewById(R.id.iv_23);
        iv_31 = (ImageView) findViewById(R.id.iv_31);
        iv_32 = (ImageView) findViewById(R.id.iv_32);
        iv_33 = (ImageView) findViewById(R.id.iv_33);
        iv_41 = (ImageView) findViewById(R.id.iv_41);
        iv_42 = (ImageView) findViewById(R.id.iv_42);
        iv_43 = (ImageView) findViewById(R.id.iv_43);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_21.setTag("3");
        iv_22.setTag("4");
        iv_23.setTag("5");
        iv_31.setTag("6");
        iv_32.setTag("7");
        iv_33.setTag("8");
        iv_41.setTag("9");
        iv_42.setTag("10");
        iv_43.setTag("11");

        //cargar las tarjetas con imagen
        VoltearlaTargeta();

        //imagenes
        Collections.shuffle(Arrays.asList(TargetaArray));

        //cambiar el color del segundo jugador (inactivo)
        tv_p2.setTextColor(Color.GRAY);

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_11, theCard);

            }
        });

        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_12, theCard);

            }
        });        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_13, theCard);
            }
        });
        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_21, theCard);
            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_22, theCard);
            }
        });
        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_23, theCard);
            }
        });
        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_31, theCard);
            }
        });
        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_32, theCard);
            }
        });
        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_33, theCard);
            }
        });
        iv_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_41, theCard);
            }
        });
        iv_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_42, theCard);
            }
        });
        iv_43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_43, theCard);
            }
        });
    }

        private void doStuff(ImageView iv,int card){
                  if(TargetaArray[card] ==101){
                iv.setImageResource(imagen101);
               final  MediaPlayer mediaPlayer101 = MediaPlayer.create(this, R.raw.yellow);
                mediaPlayer101.start();
                mediaPlayer101.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              mediaPlayer101.release();
                          }
                      });
            }else if(TargetaArray[card] ==102){
                iv.setImageResource(imagen102);
                       final MediaPlayer mediaPlayer102 = MediaPlayer.create(this, R.raw.blue);
                      mediaPlayer102.start();
                      mediaPlayer102.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              mediaPlayer102.release();
                          }
                      });
            }else if(TargetaArray[card] ==103){
                iv.setImageResource(imagen103);
                      final MediaPlayer mediaPlayer103 = MediaPlayer.create(this, R.raw.brown);
                      mediaPlayer103.start();
                      mediaPlayer103.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              mediaPlayer103.release();
                          }
                      });
            }else if(TargetaArray[card] ==104){
                iv.setImageResource(imagen104);
                      final MediaPlayer mediaPlayer104 = MediaPlayer.create(this, R.raw.rojos);
                      mediaPlayer104.start();
                      mediaPlayer104.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              mediaPlayer104.release();
                          }
                      });
            }else if(TargetaArray[card] ==105){
                iv.setImageResource(imagen105);
                   final   MediaPlayer mediaPlayer105 = MediaPlayer.create(this, R.raw.pink);
                      mediaPlayer105.start();
                      mediaPlayer105.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              mediaPlayer105.release();
                          }
                      });
            }else if(TargetaArray[card] ==106){
                iv.setImageResource(imagen106);
                     final MediaPlayer mediaPlayer106 = MediaPlayer.create(this, R.raw.green);
                      mediaPlayer106.start();
                      mediaPlayer106.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              mediaPlayer106.release();
                          }
                      });
            }else if(TargetaArray[card] ==201){
                iv.setImageResource(imagen201);
                      final MediaPlayer mediaPlayer101 = MediaPlayer.create(this, R.raw.yellow);
                      mediaPlayer101.start();
                      mediaPlayer101.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              mediaPlayer101.release();
                          }
                      });
            }else if(TargetaArray[card] ==202){
                iv.setImageResource(imagen202);
                      final MediaPlayer mediaPlayer102 = MediaPlayer.create(this, R.raw.blue);
                      mediaPlayer102.start();
                      mediaPlayer102.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              mediaPlayer102.release();
                          }
                      });
            }else if(TargetaArray[card] ==203){
                iv.setImageResource(imagen203);
                      final MediaPlayer mediaPlayer103 = MediaPlayer.create(this, R.raw.brown);
                      mediaPlayer103.start();
                      mediaPlayer103.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              mediaPlayer103.release();
                          }
                      });
            }else if(TargetaArray[card] ==204){
                iv.setImageResource(imagen204);
                      final MediaPlayer mediaPlayer104 = MediaPlayer.create(this, R.raw.rojos);
                      mediaPlayer104.start();
                      mediaPlayer104.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              mediaPlayer104.release();
                          }
                      });
            }else if(TargetaArray[card] ==205){
                iv.setImageResource(imagen205);
                      final MediaPlayer mediaPlayer105 = MediaPlayer.create(this, R.raw.pink);
                      mediaPlayer105.start();
                      mediaPlayer105.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              mediaPlayer105.release();
                          }
                      });
            }else if(TargetaArray[card] ==206){
                iv.setImageResource(imagen206);
                     final  MediaPlayer mediaPlayer106 = MediaPlayer.create(this, R.raw.green);
                      mediaPlayer106.start();
                      mediaPlayer106.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                          @Override
                          public void onCompletion(MediaPlayer mp) {
                              mediaPlayer106.release();
                          }
                      });
            }
            //verificar el numero de tarjeta  seleccionadas
            if(NumeroTarjeta==1){
                primeraTarjeta= TargetaArray[card];
                if(primeraTarjeta> 200){
                    primeraTarjeta = primeraTarjeta - 100;
                }
                NumeroTarjeta=2;
                primeClick= card;

                iv.setEnabled(false);
            }else if(NumeroTarjeta==2){
                segundaTarjeta= TargetaArray[card];
                if(segundaTarjeta> 200){
                    segundaTarjeta = segundaTarjeta - 100;
                }
                NumeroTarjeta = 1;
                segundoClick = card;

                iv_11.setEnabled(false);
                iv_12.setEnabled(false);
                iv_13.setEnabled(false);
                iv_21.setEnabled(false);
                iv_22.setEnabled(false);
                iv_23.setEnabled(false);
                iv_31.setEnabled(false);
                iv_32.setEnabled(false);
                iv_33.setEnabled(false);
                iv_41.setEnabled(false);
                iv_42.setEnabled(false);
                iv_43.setEnabled(false);

                Handler hander = new Handler();
                hander.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //verificar si selecciono imagenes iguales
                        calcular();
                    }
                },1000);

        }
    }
    private void calcular(){
        if(primeraTarjeta== segundaTarjeta){
            if(primeClick== 0){
                 iv_11.setVisibility(View.INVISIBLE);
            }else if(primeClick== 1){
                iv_12.setVisibility(View.INVISIBLE);
            }else if(primeClick== 2){
                iv_13.setVisibility(View.INVISIBLE);
            }else if(primeClick== 3){
                iv_21.setVisibility(View.INVISIBLE);
            }else  if(primeClick== 4){
                iv_22.setVisibility(View.INVISIBLE);
            }else if(primeClick== 5){
                iv_23.setVisibility(View.INVISIBLE);
            }else if(primeClick== 6){
                iv_31.setVisibility(View.INVISIBLE);
            }else  if(primeClick== 7){
                iv_32.setVisibility(View.INVISIBLE);
            }else if(primeClick== 8){
                iv_33.setVisibility(View.INVISIBLE);
            }else if(primeClick== 9){
                iv_41.setVisibility(View.INVISIBLE);
            }else if(primeClick== 10){
                iv_42.setVisibility(View.INVISIBLE);
            }else if(primeClick== 11){
                iv_43.setVisibility(View.INVISIBLE);
            }

            if(segundoClick== 0){
                iv_11.setVisibility(View.INVISIBLE);
            }else if(segundoClick== 1){
                iv_12.setVisibility(View.INVISIBLE);
            }else if(segundoClick== 2){
                iv_13.setVisibility(View.INVISIBLE);
            }else if(segundoClick== 3){
                iv_21.setVisibility(View.INVISIBLE);
            }else  if(segundoClick== 4){
                iv_22.setVisibility(View.INVISIBLE);
            }else if(segundoClick== 5){
                iv_23.setVisibility(View.INVISIBLE);
            }else if(segundoClick== 6){
                iv_31.setVisibility(View.INVISIBLE);
            }else  if(segundoClick== 7){
                iv_32.setVisibility(View.INVISIBLE);
            }else if(segundoClick== 8){
                iv_33.setVisibility(View.INVISIBLE);
            }else if(segundoClick== 9){
                iv_41.setVisibility(View.INVISIBLE);
            }else if(segundoClick== 10){
                iv_42.setVisibility(View.INVISIBLE);
            }else if(segundoClick== 11){
                iv_43.setVisibility(View.INVISIBLE);
            }
                if(turn ==1){
                    puntos++;
                    tv_p1.setText("P1: "+puntos);
                }else if(turn ==2){
                    puntosCPU++;
                    tv_p1.setText("P2: "+puntosCPU);
        }}else {
            iv_11.setImageResource(R.drawable.question);
            iv_12.setImageResource(R.drawable.question);
            iv_13.setImageResource(R.drawable.question);
            iv_21.setImageResource(R.drawable.question);
            iv_22.setImageResource(R.drawable.question);
            iv_23.setImageResource(R.drawable.question);
            iv_31.setImageResource(R.drawable.question);
            iv_32.setImageResource(R.drawable.question);
            iv_33.setImageResource(R.drawable.question);
            iv_41.setImageResource(R.drawable.question);
            iv_42.setImageResource(R.drawable.question);
            iv_43.setImageResource(R.drawable.question);

            // cabiar el turno del jugador
            if(turn==1){
                turn = 2;
                tv_p1.setTextColor(Color.GRAY);
                tv_p2.setTextColor(Color.BLACK);
            }else if(turn==2){
                turn = 1;
                tv_p1.setTextColor(Color.BLACK);
                tv_p2.setTextColor(Color.GRAY);
        }}
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_41.setEnabled(true);
        iv_42.setEnabled(true);
        iv_43.setEnabled(true);

        RevisaFinal();


    }
    private void RevisaFinal(){
        if(iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE ){
            AlertDialog.Builder alertaDialogBuilder = new AlertDialog.Builder(Nivel_3_Colores.this);
            alertaDialogBuilder.setMessage("Game Over!  P1: "+puntos+   "P2: "+ puntosCPU )
                    .setCancelable(false).setPositiveButton("Newz", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            }).setNegativeButton("Salir", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(getApplicationContext(),Color_menu.class);
                    startActivity(intent);
                    finish();
                }
            });
            AlertDialog alertDialog = alertaDialogBuilder.create();
            alertDialog.show();
                    }
    }

    private void VoltearlaTargeta(){
        imagen101= R.drawable.amarillo;
        imagen102= R.drawable.azul;
        imagen103= R.drawable.cafe;
        imagen104= R.drawable.rojo;
        imagen105= R.drawable.rosa;
        imagen106= R.drawable.verde;
        imagen201= R.drawable.duck;
        imagen202= R.drawable.tuna;
        imagen203= R.drawable.dog;
        imagen204= R.drawable.crab;
        imagen205= R.drawable.pig_1;
        imagen206= R.drawable.frog_1;
    }
    private void Reproducir(){


    }
}