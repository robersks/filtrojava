package com.local.view;

import java.util.List;
import java.util.Map;

public class MisionView {
    public static void listarMisionesDisponiblesPorId(List<Map<String,String>> listaDeMapas){
        System.out.println("O------------------------------------------------------< MOSTRANDO TODAS LAS MISIONES DISPONIBLES PARA UN NINJA ESPECIFICO");
        
        for (Map<String, String> mapa : listaDeMapas) {
            System.out.println("x---------------------------------x\n");
            
            System.out.println("ID_mision: " + mapa.get("id_mision"));
            System.out.println("Descripcion: " + mapa.get("descripcion"));
            System.out.println("Rango: " + mapa.get("rango"));
            System.out.println("Recompensa: " + mapa.get("recompensa"));
            System.out.println("Fecha de inicio: " + mapa.get("fechainicio"));
            System.out.println("Fecha de finalización: " + mapa.get("fechafin"));
        }        
    }

    public static void marcarMisionComoCompletada(Boolean status){
        if (status) {
            System.out.println("MENSAJE: Misión marcada como completada");
        }else{
            System.out.println("MENSAJE: Misión no pudo ser marcada como completada");
        }
    }

    public static void asignarMision(Boolean status){
        if (status) {
            System.out.println("MENSAJE: Misión asignada con exito");
        }else{
            System.out.println("MENSAJE: Misión no pudo ser asignada");
        }
    }
}
