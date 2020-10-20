package com.dp.proyecto__;

public class Persona {
    int id;
    String nombre,apellido,fechana,nickname,contraseña;

    public Persona() {

    }

    public Persona(int id, String nombre, String apellido, String fechana, String nickname, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechana = fechana;
        this.nickname = nickname;
        this.contraseña = contraseña;
    }

    public  boolean isNull(){
        if(nombre.equals("")&&apellido.equals("")&&fechana.equals("")&&nickname.equals("")&&contraseña.equals("")){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechana='" + fechana + '\'' +
                ", nickname='" + nickname + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechana() {
        return fechana;
    }

    public void setFechana(String fechana) {
        this.fechana = fechana;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
