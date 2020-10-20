package com.dp.proyecto__;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {
    EditText c1,c2;
    dbPersona dp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    c1=(EditText)findViewById(R.id.txtUsuario) ;
    c2=(EditText)findViewById(R.id.TextPassword) ;

    dp=new dbPersona(this);
//el boton de iniciar me permite pasar a la siguinete pantalla de menu principal-----------------------------------------------------------
        Button btnIniciar= (Button) findViewById(R.id.btnIniciarSesion);

//el boton de registro me permite pasar a la siguinete pantalla de menu principal-----------------------------------------------------------
        Button btnRegistro= (Button) findViewById(R.id.btnRegistrarse);

        btnIniciar.setOnClickListener(this);
        btnRegistro.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnIniciarSesion:
                String u=c1.getText().toString();
                String p=c2.getText().toString();
                if(u.equals("")&&p.equals("")){
                    Toast.makeText(this, "ERROR:CAMPOS VACIOS", Toast.LENGTH_LONG).show();
                }else if(dp.Login(u, p)==1){
                    Persona ux=dp.getPersona(u,p);
                    Toast.makeText(this, "DATOS CORRECTOS", Toast.LENGTH_LONG).show();
                    Intent intent1=new Intent(getApplicationContext(),Intrucciones_Generales.class);

                    startActivity(intent1);
                }else{
                    Toast.makeText(this, "DATOS INCORRECTOS", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnRegistrarse:
                Intent intent=new Intent(getApplicationContext(),Registro.class);
                startActivity(intent);
                break;
            default:

        }
    }
}