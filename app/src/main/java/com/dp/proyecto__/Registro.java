package com.dp.proyecto__;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    EditText c1,c2,c3,c4,c5,c6 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        c1=(EditText)findViewById(R.id.txtNombre);
        c2=(EditText)findViewById(R.id.txtApellido);
        c3=(EditText)findViewById(R.id.txtFecha);
        c4=(EditText)findViewById(R.id.Nick);
        c5=(EditText)findViewById(R.id.txtContraseña);
        c6=(EditText)findViewById(R.id.txtContraseña2);



        Button btnCancelar= (Button) findViewById(R.id.btnCancelar);
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLogin= new Intent(getApplicationContext(), Login.class);
                startActivity(intentLogin);
            }
        });
                /*
                Button btnIniciar= (Button) findViewById(R.id.btnIniciarSesion);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenuP = new Intent(getApplicationContext(),Menu_principal.class);
                startActivity(intentMenuP);
            }
        });
                * */
    }
     public void agregar(View view){
        if(validar()){
            Toast.makeText(this, "Datos ingresados", Toast.LENGTH_SHORT).show();
        }
     }
    public boolean validar (){
        boolean retorno=true;
        String cam1=c1.getText().toString();
        String cam2=c2.getText().toString();
        String cam3=c3.getText().toString();
          String cam4=c4.getText().toString();
        String cam5=c5.getText().toString();
        String cam6=c6.getText().toString();

        if(cam1.isEmpty()){
            c1.setError("ESTE CAMPO NO PUEDE QUEDAR VACIO");
           retorno=false;
        }
        if(cam2.isEmpty()){
            c2.setError("ESTE CAMPO NO PUEDE QUEDAR VACIO");
            retorno=false;
        }
        if(cam3.isEmpty()){
            c3.setError("ESTE CAMPO NO PUEDE QUEDAR VACIO");
            retorno=false;
        }
       if(cam4.isEmpty()){
           c4.setError("ESTE CAMPO NO PUEDE QUEDAR VACIO");
           retorno=false;
          }
        if(cam5.isEmpty()){
            c5.setError("ESTE CAMPO NO PUEDE QUEDAR VACIO");
            retorno=false;
        }
        if(cam6.isEmpty()){
            c6.setError("ESTE CAMPO NO PUEDE QUEDAR VACIO");
            retorno=false;
        }

        if(cam6==cam5){
                 }else {
            Toast.makeText(this, "Contraseñas correctas incorrectas", Toast.LENGTH_SHORT).show();
        }
        return retorno ;
    }
}