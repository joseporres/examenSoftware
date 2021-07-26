package com.examen;


public class Centro {
    int id_centro;
    boolean dadoDeAlta;//true si es dado de alta false si es dado de baja;

    public Centro(){};

    public Centro(int id_centro){
        this.id_centro = id_centro;
        this.dadoDeAlta = false;
    }

    void darDeAlta(){
        dadoDeAlta = true;
    }
    void darDebaja(){
        dadoDeAlta = false;
    }

    int getIdcentro(){
        return id_centro;
    }


    
}
