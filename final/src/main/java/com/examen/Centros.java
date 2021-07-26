package com.examen;

import java.util.List;

import com.examen.Centro;
public class Centros {
    
    List<Centro>lista_centros;

    public Centros(){
        for(int i = 1; i < 51; i++){
            Centro centro  = new Centro(i);
            lista_centros.add(centro);
        }
    };

    boolean darDeAltaId(int id){
        for(Centro centro : lista_centros) {
            if(id == centro.getIdcentro()){
                centro.darDeAlta();
                return true;
            } 
        }
        return false;       
    }

    boolean darDeBajaId(int id){
        for(Centro centro : lista_centros) {
            if(id == centro.getIdcentro()){
                centro.darDebaja();
                return true;
            } 
        }
        return false;       
    }


}
