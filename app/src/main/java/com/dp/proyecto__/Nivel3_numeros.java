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

public class Nivel3_numeros extends AppCompatActivity {
    ImageButton  btnuno, btndos, btntres, btncuatro, btncinco;
    private ImageView  imagendado;
    int numero= 0 , uno, dos, tres ,cuatro, cinco, seis, siete, ocho, nueve, dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9;
    public Integer Score = 0;
    int  cb1, cb2, cb3, cb4, cb5;
    private TextView puntuacion1, puntuacion2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel3_numeros);

        ImageButton regrsar=(ImageButton)findViewById(R.id.btn11);

        regrsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Number_menu.class);
                startActivity(intent);
                finish();
            }
        });

        btnuno=(ImageButton) findViewById(R.id.btn_1);
        btndos=(ImageButton) findViewById(R.id.btn_2);
        btntres=(ImageButton) findViewById(R.id.btn_3);
        btncuatro=(ImageButton) findViewById(R.id.btn_4);
        btncinco=(ImageButton)findViewById(R.id.btn_5);

        imagendado=(ImageView) findViewById(R.id.img_numero);

        final TextView puntuacion1 = (TextView) findViewById(R.id.txt_p2);
        TextView puntuacion2 = (TextView) findViewById(R.id.txt_p2);

        formatearnumeroOrden();
        formatearNumeroDado();

        btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numero == cb1){
                    Score +=1;
                    if(Score == 10) {
                        finalizar();
                    }else{
                        puntuacion1.setText("" + Score);
                        formatearnumeroOrden();
                        formatearNumeroDado();}
                }
            }
        });
        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numero == cb2){
                    Score +=1;
                    if(Score == 10) {
                        finalizar();
                    }else{
                        puntuacion1.setText("" + Score);
                        formatearnumeroOrden();
                        formatearNumeroDado();}
                }
            }
        });
        btntres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numero == cb3){
                    Score +=1;
                    if(Score == 10) {
                        finalizar();
                    }else{
                        puntuacion1.setText("" + Score);
                        formatearnumeroOrden();
                        formatearNumeroDado();}
                }
            }
        });
        btncuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numero == cb4){
                    Score +=1;
                    if(Score == 10) {
                        finalizar();
                    }else{
                        puntuacion1.setText("" + Score);
                        formatearnumeroOrden();
                        formatearNumeroDado();}
                }
            }
        });
        btncinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numero == cb5){
                    Score +=1;
                    if(Score == 10) {
                        finalizar();
                    }else{
                        puntuacion1.setText("" + Score);
                        formatearnumeroOrden();
                        formatearNumeroDado();}
                }
            }
        });

    }
    //imagenes de los botones y de los dados indicadores
    void numeros(){
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

        dado1=R.drawable.dado1;
        dado2=R.drawable.dado2;
        dado3=R.drawable.dado3;
        dado4=R.drawable.dado4;
        dado5=R.drawable.dado5;
        dado6=R.drawable.dado6;
        dado7=R.drawable.dado7;
        dado8=R.drawable.dado8;
        dado9=R.drawable.dado9;
    }
    // nos da los numeros en ingles de manera aleatoria en los botones
    void formatearnumeroOrden() {
        switch ((int) Math.floor(Math.random()*5+1)){
            case 1:
                btnuno.setImageResource(R.drawable.nine);
                cb1 = 9;
                btndos.setImageResource(R.drawable.six);
                cb2 = 6;
                btntres.setImageResource(R.drawable.five);
                cb3 = 5;
                btncuatro.setImageResource(R.drawable.seven);
                cb4 = 7;
                btncinco.setImageResource(R.drawable.eight);
                cb5 = 8;
                break;
            case 2:
                btnuno.setImageResource(R.drawable.seven);
                cb1 = 7;
                btndos.setImageResource(R.drawable.eight);
                cb2 = 8;
                btntres.setImageResource(R.drawable.five);
                cb3 = 5;
                btncuatro.setImageResource(R.drawable.six);
                cb4 = 6;
                btncinco.setImageResource(R.drawable.nine);
                cb5 = 9;
                break;
            case 3:
                btnuno.setImageResource(R.drawable.five);
                cb1 = 5;
                btncuatro.setImageResource(R.drawable.six);
                cb4 = 6;
                btntres.setImageResource(R.drawable.nine);
                cb3 = 9;
                btndos.setImageResource(R.drawable.seven);
                cb2 = 7;
                btncinco.setImageResource(R.drawable.eight);
                cb5 = 8;
                break;
            case 4:
                btncuatro.setImageResource(R.drawable.eight);
                cb4 = 8;
                btnuno.setImageResource(R.drawable.seven);
                cb1 = 7;
                btntres.setImageResource(R.drawable.five);
                cb3 = 5;
                btndos.setImageResource(R.drawable.nine);
                cb2 = 9;
                btncinco.setImageResource(R.drawable.six);
                cb5 = 6;
                break;
        }
    }
    // nos da los numeros de los dados de manera aleatoria en el numero indicador
    void formatearNumeroDado() {
        switch ((int) Math.floor(Math.random()*5+1)){
            case 1:
                imagendado.setImageResource(R.drawable.dado5);
                numero = 5;
                break;
            case 2:
                imagendado.setImageResource(R.drawable.dado6);
                numero = 6;
                break;
            case 3:
                imagendado.setImageResource(R.drawable.dado7);
                numero = 7;
                break;
            case 4:
                imagendado.setImageResource(R.drawable.dado8);
                numero = 8;
                break;
            case 5:
                imagendado.setImageResource(R.drawable.dado9);
                numero = 9;
                break;
            default:
                break;
        }
    }

    // nos muestra un mensaje donde nos indica si deseamos jugar de nuevo o finalizar el nivel
    void finalizar(){

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Nivel3_numeros.this);
        alertDialogBuilder
                .setMessage("GAME OVER!\nP1: " + Score )
                .setCancelable(false)
                .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getApplicationContext(), Nivel3_numeros.class);
                        startActivity(intent);
                        finish();

                    }
                })
                .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Intent intent = new Intent(getApplicationContext(), Menu_numeros.class);
                        //startActivity(intent);
                        finish();;
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}