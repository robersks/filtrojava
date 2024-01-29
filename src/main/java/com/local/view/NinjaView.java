package com.local.view;

import java.util.List;
import java.util.Map;

public class NinjaView {
    
    public static void listarNinjasConHabilidad(List<Map<String,String>> listaDeMapas){
        System.out.println("O------------------------------------------------------< MOSTRANDO TODOS LOS NINJAS Y SUS HABILIDADES");
        
        for (Map<String, String> mapa : listaDeMapas) {
            System.out.println("x---------------------------------x\n");
            
            System.out.println("ID: " + mapa.get("id"));
            System.out.println("Nombre: " + mapa.get("nombre"));
            System.out.println("Rango: " + mapa.get("rango"));
            System.out.println("Aldea: " + mapa.get("aldea"));
            System.out.println("Habilidad: " + mapa.get("habilidad"));
            System.out.println("Descripcion: " + mapa.get("descripcion"));    
        }        
    }
}


        