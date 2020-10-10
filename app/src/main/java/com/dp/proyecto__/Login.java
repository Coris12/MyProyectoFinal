package com.dp.proyecto__;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText c1,c2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//el boton de iniciar me permite pasar a la siguinete pantalla de menu principal-----------------------------------------------------------
        Button btnIniciar= (Button) findViewById(R.id.btnIniciarSesion);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMenuP = new Intent(getApplicationContext(),Intrucciones_Generales.class);
                startActivity(intentMenuP);

            }
        });
//el boton de registro me permite pasar a la siguinete pantalla de menu principal-----------------------------------------------------------
        Button btnRegistro= (Button) findViewById(R.id.btnRegistrarse);
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRegistro= new Intent(getApplicationContext(),Registro.class);
                startActivity(intentRegistro);
            }
        });
    }
    public void agregar(View view){
        if(validar()){
            Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
        }
    }
    public boolean validar (){
        boolean retorno=true;
        String cam1=c1.getText().toString();
        String cam2=c2.getText().toString();


        if(cam1.isEmpty()){
            c1.setError("ESTE CAMPO NO PUEDE QUEDAR VACIO");
            retorno=false;
        }
        if(cam2.isEmpty()){
            c2.setError("ESTE CAMPO NO PUEDE QUEDAR VACIO");
            retorno=false;
        }

        return retorno ;
    }
}