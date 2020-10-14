package com.dp.proyecto__;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Nivel2_numeros extends AppCompatActivity {
    ImageButton btnuno, btndos, btntres, btncuatro, btncinco;
    private ImageView imagendado;
    int numero = 0, cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, dado0, dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9;
    public Integer Score = 0;
    int cb1, cb2, cb3, cb4, cb5;
    private TextView puntuacion1, puntuacion2;
    MediaPlayer mediacero, mediauno, mediados, mediatres, mediacuatro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel_2_numeros);
        ImageButton regrsar=(ImageButton)findViewById(R.id.btn12);

        regrsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Number_menu.class);
                startActivity(intent);
                finish();
            }
        });

        btnuno = (ImageButton) findViewById(R.id.btn_1);
        btndos = (ImageButton) findViewById(R.id.btn_2);
        btntres = (ImageButton) findViewById(R.id.btn_3);
        btncuatro = (ImageButton) findViewById(R.id.btn_4);
        btncinco = (ImageButton) findViewById(R.id.btn_5);

        imagendado = (ImageView) findViewById(R.id.img_numero);

        final TextView puntuacion1 = (TextView) findViewById(R.id.txt_p2);
        final TextView puntuacion2 = (TextView) findViewById(R.id.txt_p2);

        mediacero = MediaPlayer.create(this, R.raw.cero);
        mediauno = MediaPlayer.create(this, R.raw.uno);
        mediados = MediaPlayer.create(this, R.raw.dos);
        mediatres = MediaPlayer.create(this, R.raw.tres);
        mediacuatro = MediaPlayer.create(this, R.raw.cuatro);

        formatearnumeroOrden();
        formatearNumeroDado();



    btnuno.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (numero == cb1) {
                Score += 1;
                if(Score == 10) {
                    finalizar();
                }else{
                puntuacion1.setText("" + Score);
                formatearnumeroOrden();
                formatearNumeroDado();
                audios();
                }
            }
        }
    });
    btndos.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (numero == cb2) {

                Score += 1;
                if(Score == 10) {
                    finalizar();
                }else{
                    puntuacion1.setText("" + Score);
                    formatearnumeroOrden();
                    formatearNumeroDado();
                    audios();
                }
            }
        }
    });
    btntres.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (numero == cb3) {
                audios();
                Score += 1;if(Score == 10) {
                    finalizar();
                }else{
                    puntuacion1.setText("" + Score);
                    formatearnumeroOrden();
                    formatearNumeroDado();
                    audios();
                }
            }
        }
    });
    btncuatro.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (numero == cb4) {
                Score += 1;
                audios();
                if(Score == 10) {
                    finalizar();
                }else{
                    puntuacion1.setText("" + Score);
                    formatearnumeroOrden();
                    formatearNumeroDado();
                    audios();
                }
            }
        }
    });
    btncinco.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (numero == cb5) {
                audios();
                Score += 1;if(Score == 10) {
                    finalizar();
                }else{
                    puntuacion1.setText("" + Score);
                    formatearnumeroOrden();
                    formatearNumeroDado();
                    audios();
                }
            }
        }
    });
    }
    //imagenes de los botones y de los dados indicadores
    void numeros() {
        cero = R.drawable.zero;
        uno = R.drawable.one;
        dos = R.drawable.two;
        tres = R.drawable.three;
        cuatro = R.drawable.four;
        cinco = R.drawable.five;
        seis = R.drawable.six;
        siete = R.drawable.seven;
        ocho = R.drawable.eight;
        nueve = R.drawable.nine;
        //dados_____________________________________________________________________________________________________________
        dado0 = R.drawable.dado0;
        dado1 = R.drawable.dado1;
        dado2 = R.drawable.dado2;
        dado3 = R.drawable.dado3;
        dado4 = R.drawable.dado4;
        dado5 = R.drawable.dado5;
        dado6 = R.drawable.dado6;
        dado7 = R.drawable.dado7;
        dado8 = R.drawable.dado8;
        dado9 = R.drawable.dado9;
    }

// nos da los numeros en ingles de manera aleatoria en los botones
    void formatearnumeroOrden() {
        switch ((int) Math.floor(Math.random() * 6 + 1)) {
            case 1:
                btnuno.setImageResource(R.drawable.four);
                cb1 = 4;
                btndos.setImageResource(R.drawable.two);
                cb2 = 2;
                btntres.setImageResource(R.drawable.three);
                cb3 = 3;
                btncuatro.setImageResource(R.drawable.one);
                cb4 = 1;
                btncinco.setImageResource(R.drawable.zero);
                cb5 = 0;
                break;
            case 2:
                btnuno.setImageResource(R.drawable.one);
                cb1 = 1;
                btndos.setImageResource(R.drawable.zero);
                cb2 = 0;
                btntres.setImageResource(R.drawable.four);
                cb3 = 4;
                btncuatro.setImageResource(R.drawable.three);
                cb4 = 3;
                btncinco.setImageResource(R.drawable.two);
                cb5 = 2;
                break;
            case 3:
                btnuno.setImageResource(R.drawable.three);
                cb1 = 3;
                btncuatro.setImageResource(R.drawable.two);
                cb4 = 2;
                btntres.setImageResource(R.drawable.zero);
                cb3 = 0;
                btndos.setImageResource(R.drawable.one);
                cb2 = 1;
                btncinco.setImageResource(R.drawable.four);
                cb5 = 4;
                break;
            case 4:
                btncuatro.setImageResource(R.drawable.zero);
                cb4 = 0;
                btnuno.setImageResource(R.drawable.one);
                cb1 = 1;
                btntres.setImageResource(R.drawable.four);
                cb3 = 4;
                btndos.setImageResource(R.drawable.two);
                cb2 = 2;
                btncinco.setImageResource(R.drawable.three);
                cb5 = 3;
                break;
            case 5:
                btncuatro.setImageResource(R.drawable.one);
                cb4 = 1;
                btnuno.setImageResource(R.drawable.zero);
                cb1 = 0;
                btntres.setImageResource(R.drawable.three);
                cb3 = 3;
                btndos.setImageResource(R.drawable.two);
                cb2 = 2;
                btncinco.setImageResource(R.drawable.four);
                cb5 = 4;
                break;

        }
    }
    // nos da los numeros de los dados de manera aleatoria en el numero indicador
    void formatearNumeroDado() {
        switch ((int) Math.floor(Math.random() * 5 + 1)) {
            case 1:
                imagendado.setImageResource(R.drawable.dado0);
                numero = 0;
                break;
            case 2:
                imagendado.setImageResource(R.drawable.dado1);
                numero = 1;
                break;
            case 3:
                imagendado.setImageResource(R.drawable.dado2);
                numero = 2;
                break;
            case 4:
                imagendado.setImageResource(R.drawable.dado3);
                numero = 3;
                break;
            case 5:
                imagendado.setImageResource(R.drawable.dado4);
                numero = 4;
                break;
            default:
                break;
        }
    }
    // nos muestra un mensaje donde nos indica si deseamos jugar de nuevo o finalizar el nivel
    void finalizar(){

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Nivel2_numeros.this);
            alertDialogBuilder
                    .setMessage("GAME OVER!\nP1: " + Score )
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), Nivel2_numeros.class);
                            startActivity(intent);
                            finish();

                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), Number_menu.class);
                            startActivity(intent);
                            finish();;
                        }
                    });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    public void audios(){
        if(((cb1==0)||(cb2==0)||(cb3==0)||(cb4==0))&&(numero==0)){
            mediacero.start();
        }else if(((cb1==1)||(cb2==1)||(cb3==1)||(cb4==1))&&(numero==1)){
            mediauno.start();
        }else if(((cb1==2)||(cb2==2)||(cb3==2)||(cb4==2))&&(numero==2)){
            mediados.start();
        }else if(((cb1==3)||(cb2==3)||(cb3==3)||(cb4==3))&&(numero==3)){
            mediatres.start();
        }else if(((cb1==4)||(cb2==4)||(cb3==4)||(cb4==4))&&(numero==4)){
            mediacuatro.start();
        }
    }
    }