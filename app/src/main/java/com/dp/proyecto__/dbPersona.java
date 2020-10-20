package com.dp.proyecto__;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class dbPersona {
    Context cont;
    Persona user;
     String p;
    ArrayList<Persona> lista;
    SQLiteDatabase sql;
    String bd="learningtogether1";
    String table="create table if not exists persona (id integer primary key autoincrement ,nickname text,contraseña text,fechana text,nombre text,apellido text)";

    public dbPersona(Context cont) {
        this.cont=cont;
        sql=cont.openOrCreateDatabase(bd,cont.MODE_PRIVATE,null);
        sql.execSQL(table);
        user= new Persona();
    }


    public boolean Insertarusuario (Persona user){
        if(buscar(user.getNickname())==0){
            ContentValues cv=new ContentValues();
            cv.put("nombre",user.getNombre());
            cv.put("apellido",user.getApellido());
            cv.put("fechana",user.getFechana());
            cv.put("nickname",user.getNickname());
            cv.put("contraseña",user.getContraseña());
            return(sql.insert("persona",null,cv)>0);

        }else{
            return false;
        }
    }

    public int buscar(String user){
        int x=0;
        lista=selectPersona();
        for (Persona p:lista) {
            if(p.getNickname().equals(user)){
                x ++;
            }
        }
        return x;
    }

    public ArrayList<Persona> selectPersona(){
        ArrayList<Persona>lista=new ArrayList<Persona>();
        lista.clear();
        Cursor cur=sql.rawQuery("select*from persona",null);

        if(cur!=null&& cur.moveToFirst()){
            do{
            Persona per=new Persona();
            per.setId(cur.getInt(0));
            per.setNombre(cur.getString(1));
            per.setApellido(cur.getString(2));
            per.setFechana(cur.getString(3));
            per.setNickname(cur.getString(4));
            per.setContraseña(cur.getString(5));
            lista.add(per);
            }while (cur.moveToNext());

        }
        return lista;
    }
    public int Login(String user,String p){
        int a=0;
        Cursor cur=sql.rawQuery("select*from persona",null);
        if(cur!=null&& cur.moveToFirst()){
            do{
                if (cur.getString(1).equals(user) && cur.getString(2).equals(p)) {
                    a ++;
                }
            }while (cur.moveToNext());


        }
        return  a;
    }
    public Persona getPersona(String user,String p){
        lista=selectPersona();
        for (Persona us:lista) {
            if(us.getNickname().equals(user)&&us.getContraseña().equals(p)){
                return us;
            }
            
        }
        return null;

    }
}
