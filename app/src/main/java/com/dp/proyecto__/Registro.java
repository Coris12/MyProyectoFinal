package com.dp.proyecto__;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class Registro extends AppCompatActivity implements View.OnClickListener{
    EditText nombre,txtApellido,fecha,txtNick,txtContraseña,txtContraseña2;
    dbPersona db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
       nombre = (EditText) findViewById(R.id.txtNombre);
         txtApellido = (EditText) findViewById(R.id.txtApellido);
        fecha = (EditText) findViewById(R.id.txtFecha);
        txtNick = (EditText) findViewById(R.id.Nick);
          txtContraseña = (EditText) findViewById(R.id.txtContraseña);
          txtContraseña2 = (EditText) findViewById(R.id.txtContraseña2);
        Button btnGuardar = (Button) findViewById(R.id.btnGuardar);
        Button btnCancelar= (Button) findViewById(R.id.btnCancelar);
        btnGuardar.setOnClickListener(this);
        btnCancelar.setOnClickListener(this);
        db=new dbPersona(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnGuardar:
                Persona p=new Persona();
                p.setNombre(nombre.getText().toString());
                p.setApellido(txtApellido.getText().toString());
                p.setFechana(fecha.getText().toString());
                p.setNickname(txtNick.getText().toString());
                p.setContraseña(txtContraseña.getText().toString());
                p.setContraseña(txtContraseña2.getText().toString());
                if(!p.isNull()){
                    Toast.makeText(this, "ERROR: CAMPOS VACIOS", Toast.LENGTH_LONG).show();
                }else if(db.Insertarusuario(p)){
                Toast.makeText(this, "REGISTRO EXITO", Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(getApplicationContext(),Login.class);
                    startActivity(intent);
                    finish();
                }else{
                Toast.makeText(this, "USUARIO YA REGISTRADO", Toast.LENGTH_LONG).show();

            }


                break;
            case R.id.btnCancelar:
                Intent intent=new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
                finish();
                break;
            default:

        }
    }
    }
