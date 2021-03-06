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

public class Nivel2_Animales extends AppCompatActivity {
    TextView tv_p1, tv_p2;

    ImageView iv_11, iv_12, iv_13, iv_14, iv_21, iv_22, iv_23, iv_24, iv_31, iv_32, iv_33, iv_34, iv_41, iv_42, iv_43, iv_44;
    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 107, 108, 201, 202, 203, 204, 205, 206, 207, 208};



    //acutual imagenes
    int image101, image102, image103, image104, image105, image106, image107, image108,
            image201, image202, image203, image204, image205, image206, image207, image208;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber=1;

    int turn =1;
    int playerPoints = 0, cpuPoints = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel2_animales);
        ImageButton botonRegresar = (ImageButton)  findViewById(R.id.butre);
        botonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAnimal= new Intent (getApplicationContext(),Menu_Animales.class);
                startActivity(intentAnimal);
                finish();
            }
        });

        tv_p1 =(TextView) findViewById(R.id.tv_p1);
        tv_p2 =(TextView) findViewById(R.id.tv_p2);

        iv_11 =(ImageView) findViewById(R.id.iv_11);
        iv_12 =(ImageView) findViewById(R.id.iv_12);
        iv_13 =(ImageView) findViewById(R.id.iv_13);
        iv_14 =(ImageView) findViewById(R.id.iv_14);
        iv_21 =(ImageView) findViewById(R.id.iv_21);
        iv_22 =(ImageView) findViewById(R.id.iv_22);
        iv_23 =(ImageView) findViewById(R.id.iv_23);
        iv_24 =(ImageView) findViewById(R.id.iv_24);
        iv_31 =(ImageView) findViewById(R.id.iv_31);
        iv_32 =(ImageView) findViewById(R.id.iv_32);
        iv_33 =(ImageView) findViewById(R.id.iv_33);
        iv_34 =(ImageView) findViewById(R.id.iv_34);
        iv_41 =(ImageView) findViewById(R.id.iv_41);
        iv_42 =(ImageView) findViewById(R.id.iv_42);
        iv_43 =(ImageView) findViewById(R.id.iv_43);
        iv_44 =(ImageView) findViewById(R.id.iv_44);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");
        iv_41.setTag("12");
        iv_42.setTag("13");
        iv_43.setTag("14");
        iv_44.setTag("15");

        //cargar las imágenes de la tarjeta
        frontOfCardsResuorse();

        //barajar las imágenes
        Collections.shuffle(Arrays.asList(cardsArray));

        //Cambiar el color de la segunda jugadora (inactiva)
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
        });

        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_13, theCard);

            }
        });

        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_14, theCard);

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

        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_24, theCard);

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

        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_34, theCard);

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

        iv_44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_44, theCard);

            }
        });

    }

    private void doStuff(ImageView iv, int card) {
        //establecer la imagen correcta en la vista de imagen
        if (cardsArray[card] == 101) {
            iv.setImageResource(image101);
            final   MediaPlayer mediaPlayer101 = MediaPlayer.create(this, R.raw.cat);
            mediaPlayer101.start();
            mediaPlayer101.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer101.release();
                }
            });
        } else if (cardsArray[card] == 102) {
            iv.setImageResource(image102);
            final   MediaPlayer mediaPlayer102 = MediaPlayer.create(this, R.raw.chicken);
            mediaPlayer102.start();
            mediaPlayer102.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer102.release();
                }
            });
        } else if (cardsArray[card] == 103) {
            iv.setImageResource(image103);
            final   MediaPlayer mediaPlayer103 = MediaPlayer.create(this, R.raw.cow);
            mediaPlayer103.start();
            mediaPlayer103.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer103.release();
                }
            });
        } else if (cardsArray[card] == 104) {
            iv.setImageResource(image104);
            final   MediaPlayer mediaPlayer104 = MediaPlayer.create(this, R.raw.donkey);
            mediaPlayer104.start();
            mediaPlayer104.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer104.release();
                }
            });
        } else if (cardsArray[card] == 105) {
            iv.setImageResource(image105);
            final   MediaPlayer mediaPlayer105 = MediaPlayer.create(this, R.raw.pig);
            mediaPlayer105.start();
            mediaPlayer105.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer105.release();
                }
            });
        } else if (cardsArray[card] == 106) {
            iv.setImageResource(image106);
            final   MediaPlayer mediaPlayer106 = MediaPlayer.create(this, R.raw.sheep);
            mediaPlayer106.start();
            mediaPlayer106.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer106.release();
                }
            });
        } else if (cardsArray[card] == 107) {
            iv.setImageResource(image107);
            final   MediaPlayer mediaPlayer107 = MediaPlayer.create(this, R.raw.frog);
            mediaPlayer107.start();
            mediaPlayer107.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer107.release();
                }
            });
        } else if (cardsArray[card] == 108) {
            iv.setImageResource(image108);
            final   MediaPlayer mediaPlayer108 = MediaPlayer.create(this, R.raw.shark);
            mediaPlayer108.start();
            mediaPlayer108.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer108.release();
                }
            });
        } else if (cardsArray[card] == 201) {
            iv.setImageResource(image201);
            final   MediaPlayer mediaPlayer101 = MediaPlayer.create(this, R.raw.cat);
            mediaPlayer101.start();
            mediaPlayer101.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer101.release();
                }
            });
        } else if (cardsArray[card] == 202) {
            iv.setImageResource(image202);
            final   MediaPlayer mediaPlayer102 = MediaPlayer.create(this, R.raw.chicken);
            mediaPlayer102.start();
            mediaPlayer102.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer102.release();
                }
            });
        } else if (cardsArray[card] == 203) {
            iv.setImageResource(image203);
            final   MediaPlayer mediaPlayer103 = MediaPlayer.create(this, R.raw.cow);
            mediaPlayer103.start();
            mediaPlayer103.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer103.release();
                }
            });
        } else if (cardsArray[card] == 204) {
            iv.setImageResource(image204);
            final   MediaPlayer mediaPlayer104 = MediaPlayer.create(this, R.raw.donkey);
            mediaPlayer104.start();
            mediaPlayer104.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer104.release();
                }
            });
        } else if (cardsArray[card] == 205) {
            iv.setImageResource(image205);
            final   MediaPlayer mediaPlayer105 = MediaPlayer.create(this, R.raw.pig);
            mediaPlayer105.start();
            mediaPlayer105.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer105.release();
                }
            });
        } else if (cardsArray[card] == 206) {
            iv.setImageResource(image206);
            final   MediaPlayer mediaPlayer106 = MediaPlayer.create(this, R.raw.sheep);
            mediaPlayer106.start();
            mediaPlayer106.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer106.release();
                }
            });
        } else if (cardsArray[card] == 207) {
            iv.setImageResource(image207);
            final   MediaPlayer mediaPlayer107 = MediaPlayer.create(this, R.raw.frog);
            mediaPlayer107.start();
            mediaPlayer107.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer107.release();
                }
            });
        } else if (cardsArray[card] == 208) {
            iv.setImageResource(image208);
            final   MediaPlayer mediaPlayer108 = MediaPlayer.create(this, R.raw.shark);
            mediaPlayer108.start();
            mediaPlayer108.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer108.release();
                }
            });
        }

        //revisar que imagen es seleccionada y guardae
        if (cardNumber == 1) {
            firstCard = cardsArray[card];
            if (firstCard > 200) {
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);
        } else if (cardNumber == 2) {
            secondCard = cardsArray[card];
            if (secondCard > 200) {
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);
            iv_41.setEnabled(false);
            iv_42.setEnabled(false);
            iv_43.setEnabled(false);
            iv_44.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // revisar si la imagen selccionada es igual
                    calculate();
                }
            }, 1000);
        }


    }

    private void calculate(){
        // si las iamgenes son iguales se remueve y  añade los puntos
        if (firstCard == secondCard){
            if(clickedFirst == 0){
                iv_11.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 1){
                iv_12.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 2){
                iv_13.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 3){
                iv_14.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 4){
                iv_21.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 5){
                iv_22.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 6){
                iv_23.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 7){
                iv_24.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 8){
                iv_31.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 9){
                iv_32.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 10){
                iv_33.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 11){
                iv_34.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 12){
                iv_41.setVisibility(View.INVISIBLE);
            }
            else if(clickedFirst == 13){
                iv_42.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 14){
                iv_43.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 15){
                iv_44.setVisibility(View.INVISIBLE);
            }
            if(clickedSecond == 0){
                iv_11.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 1){
                iv_12.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 2){
                iv_13.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 3){
                iv_14.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 4){
                iv_21.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 5){
                iv_22.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 6){
                iv_23.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 7){
                iv_24.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 8){
                iv_31.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 9){
                iv_32.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 10){
                iv_33.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 11){
                iv_34.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 12){
                iv_41.setVisibility(View.INVISIBLE);
            }
            else if(clickedSecond == 13){
                iv_42.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 14){
                iv_43.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 15){
                iv_44.setVisibility(View.INVISIBLE);
            }

            //añade los puntos al jugador correcto
            if(turn == 1){
                playerPoints++;
                tv_p1.setText("P1: " + playerPoints);
            } else if(turn == 2){
                cpuPoints++;
                tv_p2.setText("P2: " + cpuPoints);
            }
        }else {
            iv_11.setImageResource(R.drawable.question);
            iv_12.setImageResource(R.drawable.question);
            iv_13.setImageResource(R.drawable.question);
            iv_14.setImageResource(R.drawable.question);
            iv_21.setImageResource(R.drawable.question);
            iv_22.setImageResource(R.drawable.question);
            iv_23.setImageResource(R.drawable.question);
            iv_24.setImageResource(R.drawable.question);
            iv_31.setImageResource(R.drawable.question);
            iv_32.setImageResource(R.drawable.question);
            iv_33.setImageResource(R.drawable.question);
            iv_34.setImageResource(R.drawable.question);
            iv_41.setImageResource(R.drawable.question);
            iv_42.setImageResource(R.drawable.question);
            iv_43.setImageResource(R.drawable.question);
            iv_44.setImageResource(R.drawable.question);


            //cambiar el jugador de turno
            if(turn == 1){
                turn = 2;
                tv_p1.setTextColor(Color.GRAY);
                tv_p2.setTextColor(Color.BLACK);
            }else if(turn == 2){
                turn = 1;
                tv_p2.setTextColor(Color.GRAY);
                tv_p1.setTextColor(Color.BLACK);
            }
        }
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);
        iv_41.setEnabled(true);
        iv_42.setEnabled(true);
        iv_43.setEnabled(true);
        iv_44.setEnabled(true);

        //revisar si el juego termino
        checkEnd();
    }

    private void checkEnd(){
        if(iv_11.getVisibility() ==View.INVISIBLE &&
                iv_12.getVisibility() ==View.INVISIBLE &&
                iv_13.getVisibility() ==View.INVISIBLE &&
                iv_14.getVisibility() ==View.INVISIBLE &&
                iv_21.getVisibility() ==View.INVISIBLE &&
                iv_22.getVisibility() ==View.INVISIBLE &&
                iv_23.getVisibility() ==View.INVISIBLE &&
                iv_24.getVisibility() ==View.INVISIBLE &&
                iv_31.getVisibility() ==View.INVISIBLE &&
                iv_32.getVisibility() ==View.INVISIBLE &&
                iv_33.getVisibility() ==View.INVISIBLE &&
                iv_34.getVisibility() ==View.INVISIBLE &&
                iv_41.getVisibility() ==View.INVISIBLE &&
                iv_42.getVisibility() ==View.INVISIBLE &&
                iv_43.getVisibility() ==View.INVISIBLE &&
                iv_44.getVisibility() ==View.INVISIBLE){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Nivel2_Animales.this);
            alertDialogBuilder
                    .setMessage("GAME OVER!\nP1: " + playerPoints + "\nP2: " + cpuPoints)
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), Nivel2_Animales.class);
                            startActivity(intent);
                            finish();

                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), Menu_Animales.class);
                            startActivity(intent);
                            finish();;
                        }
                    });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        }
    }

    private void frontOfCardsResuorse(){
        image101 = R.drawable.cat_1;
        image102 = R.drawable.chicken_1;
        image103 = R.drawable.cow_1;
        image104 = R.drawable.donkey_1;
        image105 = R.drawable.pig_1;
        image106 = R.drawable.sheep_1;
        image107 = R.drawable.frog_1;
        image108 = R.drawable.shark_1;
        image201 = R.drawable.cat_2;
        image202 = R.drawable.chicken_2;
        image203 = R.drawable.cow_2;
        image204 = R.drawable.donkey_2;
        image205 = R.drawable.pig_2;
        image206 = R.drawable.sheep_2;
        image207 = R.drawable.frog_2;
        image208 = R.drawable.shark_2;


    }
}