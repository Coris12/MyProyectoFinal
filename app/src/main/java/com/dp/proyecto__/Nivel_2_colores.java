package com.dp.proyecto__;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Nivel_2_colores extends AppCompatActivity {

    private Button btnColor1, btnColor2, btnColor3, btnColor4;
    public Integer Score = 0;
    String colorTexto, colorCorrecto, cb1, cb2, cb3, cb4;
    private TextView puntuacion1, puntuacion2, ColorMuestra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colors_lvl2);
        ImageButton regrsar=(ImageButton)findViewById(R.id.btn13);

        regrsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Number_menu.class);
                startActivity(intent);
                finish();
            }
        });

        btnColor1 = (Button) findViewById(R.id.btncolor1);
        btnColor2 = (Button) findViewById(R.id.btncolor2);
        btnColor3 = (Button) findViewById(R.id.btncolor3);
        btnColor4 = (Button) findViewById(R.id.btncolor4);

        ColorMuestra = (TextView)findViewById(R.id.txtColorMuestra);

        puntuacion1 = (TextView) findViewById(R.id.Puntuacion1);

        formatearColorOrden();
        formatearColorPalabra();

        btnColor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorTexto == cb1){
                    Score +=1;
                    if (Score == 5) {
                        finalizar();
                    } else {
                        puntuacion1.setText("Player:" + Score);
                        formatearColorOrden();
                        formatearColorPalabra();
                    }
                }
            }
        });
        btnColor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorTexto == cb2){
                    Score +=1;
                    if (Score == 5) {
                        finalizar();
                    } else {
                        puntuacion1.setText("Player:" + Score);
                        formatearColorOrden();
                        formatearColorPalabra();
                    }
                }
            }
        });
        btnColor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorTexto == cb3){
                    Score +=1;
                    if (Score == 5) {
                        finalizar();
                    } else {
                        puntuacion1.setText("Player:" + Score);
                        formatearColorOrden();
                        formatearColorPalabra();
                    }
                }
            }
        });
        btnColor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorTexto == cb4){
                    Score +=1;
                    if (Score == 5) {
                        finalizar();
                    } else {
                        puntuacion1.setText("Player:" + Score);
                        formatearColorOrden();
                        formatearColorPalabra();
                    }
                }
            }
        });


    }

    void formatearColorOrden() {
        switch ((int) Math.floor(Math.random()*4+1)){
            case 1:
                btnColor1.setBackgroundColor(Color.argb(255, 0, 255, 0));
                cb1 = "Green";
                btnColor2.setBackgroundColor(Color.argb(255, 255, 0, 0));
                cb2 = "Red";
                btnColor3.setBackgroundColor(Color.argb(255, 0, 0, 255));
                cb3 = "Blue";
                btnColor4.setBackgroundColor(Color.argb(255, 255, 255, 0));
                cb4 = "Yellow";
                break;
            case 2:
                btnColor3.setBackgroundColor(Color.argb(255, 0, 255, 0));
                cb3 = "Green";
                btnColor4.setBackgroundColor(Color.argb(255, 255, 0, 0));
                cb4 = "Red";
                btnColor1.setBackgroundColor(Color.argb(255, 0, 0, 255));
                cb1 = "Blue";
                btnColor2.setBackgroundColor(Color.argb(255, 255, 255, 0));
                cb2 = "Yellow";
                break;
            case 3:
                btnColor4.setBackgroundColor(Color.argb(255, 0, 255, 0));
                cb4 = "Green";
                btnColor3.setBackgroundColor(Color.argb(255, 255, 0, 0));
                cb3 = "Red";
                btnColor2.setBackgroundColor(Color.argb(255, 0, 0, 255));
                cb2 = "Blue";
                btnColor1.setBackgroundColor(Color.argb(255, 255, 255, 0));
                cb1 = "Yellow";
                break;
            case 4:
                btnColor4.setBackgroundColor(Color.argb(255, 0, 255, 0));
                cb4 = "Green";
                btnColor1.setBackgroundColor(Color.argb(255, 255, 0, 0));
                cb1 = "Red";
                btnColor3.setBackgroundColor(Color.argb(255, 0, 0, 255));
                cb3 = "Blue";
                btnColor2.setBackgroundColor(Color.argb(255, 255, 255, 0));
                cb2 = "Yellow";
                break;
        }
    }
    void formatearColorPalabra() {
        switch ((int) Math.floor(Math.random()*4+1)){
            case 1:
                colorTexto = "Green";
                ColorMuestra.setText(colorTexto);
                ColorMuestra.setTextColor(Color.argb(255, 255, 255, 0));
                break;
            case 2:
                colorTexto = "Red";
                ColorMuestra.setText(colorTexto);
                ColorMuestra.setTextColor(Color.argb(255, 0, 255, 31));

                break;
            case 3:
                colorTexto = "Blue";
                ColorMuestra.setText(colorTexto);
                ColorMuestra.setTextColor(Color.argb(255, 255, 0, 0));

                break;
            case 4:
                colorTexto = "Yellow";
                ColorMuestra.setText(colorTexto);
                ColorMuestra.setTextColor(Color.argb(255, 0, 66, 255));

                break;
            default:
                break;
        }
    }

    public void finalizar(){
    AlertDialog.Builder alertaDialogBuilder = new AlertDialog.Builder(Nivel_2_colores.this);
            alertaDialogBuilder.setMessage("Game Over!  Player: "+Score )
            .setCancelable(false).setPositiveButton("New", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {

        }
    }).setNegativeButton("Exit", new DialogInterface.OnClickListener() {
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