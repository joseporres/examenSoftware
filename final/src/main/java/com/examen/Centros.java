package com.examen;

import java.util.List;

public class Centros {
    
    List<Centro>listCentros;

    public Centros(){
        for(int i = 1; i < 51; i++){
            Centro centro  = new Centro(i);
            listCentros.add(centro);
        }
    }

    boolean darDeAltaId(int id){
        for(Centro centro : listCentros) {
            if(id == centro.getIdcentro()){
                centro.darDeAlta();
                return true;
            } 
        }
        return false;       
    }

    boolean darDeBajaId(int id){
        for(Centro centro : listCentros) {
            if(id == centro.getIdcentro()){
                centro.darDebaja();
                return true;
            } 
        }
        return false;       
    }


}
