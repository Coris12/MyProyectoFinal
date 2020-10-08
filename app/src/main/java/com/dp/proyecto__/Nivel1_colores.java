package com.dp.proyecto__;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Nivel1_colores extends AppCompatActivity {

    private Button btnColor1, btnColor2, btnColor3, btnColor4;
    public Integer Score = 0;
    String colorTexto, colorCorrecto, cb1, cb2, cb3, cb4;
    private TextView puntuacion1, puntuacion2, ColorMuestra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colors_lvl1);

        btnColor1 = (Button) findViewById(R.id.btncolor1);
        btnColor2 = (Button) findViewById(R.id.btncolor2);
        btnColor3 = (Button) findViewById(R.id.btncolor3);
        btnColor4 = (Button) findViewById(R.id.btncolor4);

        ColorMuestra = (TextView)findViewById(R.id.txtColorMuestra);

        puntuacion1 = (TextView) findViewById(R.id.Puntuacion1);
        puntuacion2 = (TextView) findViewById(R.id.Puntuacion2);
        formatearColorOrden();
        formatearColorPalabra();

        btnColor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorTexto == cb1){
                    Score +=1;
                    puntuacion1.setText(""+ Score);
                    formatearColorOrden();
                    formatearColorPalabra();
                }
            }
        });
        btnColor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorTexto == cb2){
                    Score +=1;
                    puntuacion1.setText(""+ Score);
                    formatearColorOrden();
                    formatearColorPalabra();
                }
            }
        });
        btnColor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorTexto == cb3){
                    Score +=1;
                    puntuacion1.setText(""+ Score);
                    formatearColorOrden();
                    formatearColorPalabra();
                }
            }
        });
        btnColor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorTexto == cb4){
                    Score +=1;
                    puntuacion1.setText(""+ Score);
                    formatearColorOrden();
                    formatearColorPalabra();
                }
            }
        });


    }

    void formatearColorOrden() {
        switch ((int) Math.floor(Math.random()*4+1)){
            case 1:
                btnColor1.setBackgroundColor(Color.argb(255, 0, 255, 0));
                cb1 = "green";
                btnColor2.setBackgroundColor(Color.argb(255, 255, 0, 0));
                cb2 = "red";
                btnColor3.setBackgroundColor(Color.argb(255, 0, 0, 255));
                cb3 = "blue";
                btnColor4.setBackgroundColor(Color.argb(255, 255, 255, 0));
                cb4 = "yellow";
                break;
            case 2:
                btnColor3.setBackgroundColor(Color.argb(255, 0, 255, 0));
                cb3 = "green";
                btnColor4.setBackgroundColor(Color.argb(255, 255, 0, 0));
                cb4 = "red";
                btnColor1.setBackgroundColor(Color.argb(255, 0, 0, 255));
                cb1 = "blue";
                btnColor2.setBackgroundColor(Color.argb(255, 255, 255, 0));
                cb2 = "yellow";
                break;
            case 3:
                btnColor4.setBackgroundColor(Color.argb(255, 0, 255, 0));
                cb4 = "green";
                btnColor3.setBackgroundColor(Color.argb(255, 255, 0, 0));
                cb3 = "red";
                btnColor2.setBackgroundColor(Color.argb(255, 0, 0, 255));
                cb2 = "blue";
                btnColor1.setBackgroundColor(Color.argb(255, 255, 255, 0));
                cb1 = "yellow";
                break;
            case 4:
                btnColor4.setBackgroundColor(Color.argb(255, 0, 255, 0));
                cb4 = "green";
                btnColor1.setBackgroundColor(Color.argb(255, 255, 0, 0));
                cb1 = "red";
                btnColor3.setBackgroundColor(Color.argb(255, 0, 0, 255));
                cb3 = "blue";
                btnColor2.setBackgroundColor(Color.argb(255, 255, 255, 0));
                cb2 = "yellow";
                break;
        }
    }
    void formatearColorPalabra() {
        switch ((int) Math.floor(Math.random()*4+1)){
            case 1:
                colorTexto = "green";
                ColorMuestra.setText(colorTexto);
                ColorMuestra.setTextColor(Color.argb(255, 255, 255, 0));
                break;
            case 2:
                colorTexto = "red";
                ColorMuestra.setText(colorTexto);
                ColorMuestra.setTextColor(Color.argb(255, 0, 255, 31));

                break;
            case 3:
                colorTexto = "blue";
                ColorMuestra.setText(colorTexto);
                ColorMuestra.setTextColor(Color.argb(255, 255, 0, 0));

                break;
            case 4:
                colorTexto = "yellow";
                ColorMuestra.setText(colorTexto);
                ColorMuestra.setTextColor(Color.argb(255, 0, 66, 255));

                break;
            default:
                break;
        }
    }
}