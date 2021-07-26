package com.examen;


public class Centro {
    int idCentro;
    boolean dadoDeAlta;

public Centro(){/*const*/}

    public Centro(int id_centro){
        this.idCentro = id_centro;
        this.dadoDeAlta = false;
    }

    void darDeAlta(){
        dadoDeAlta = true;
    }
    void darDebaja(){
        dadoDeAlta = false;
    }

    int getIdcentro(){
        return idCentro;
    }


    
}
