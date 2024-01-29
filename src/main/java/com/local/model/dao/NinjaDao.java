package com.local.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.local.model.persistence.*;

public abstract class NinjaDao {
    
    public static List<Map<String,String>> MostrarNinjasYHabilidades() throws SQLException {

        List<Map<String,String>> lista = new ArrayList<>(); // lista de mapas que se retornará
        
        Operaciones.setConnection(ConexionDB.mySQLConnection());
        String sentencia = "SELECT n.id id,n.nombre,n.rango,n.aldea,h.nombre habilidad, h.descripcion descripcion FROM ninja n INNER JOIN habilidad h ON n.id = h.id_ninja;";
        PreparedStatement ps = Operaciones.getConnection().prepareStatement(sentencia);
        ResultSet rs = Operaciones.consultar_BD(ps);
        while (rs.next()) {

            // capturar los valores de la consulta en cada columna
            String id = rs.getString("id");
            String nombre= rs.getString("nombre");
            String rango = rs.getString("rango");
            String aldea= rs.getString("aldea");
            String habilidad = rs.getString("habilidad");
            String descripcion= rs.getString("descripcion");
           
            HashMap<String, String> miMapa = new HashMap<>(); // crear objeto de tipo mapa y luego almacenarlo en la lista
            miMapa.put("id",id);
            miMapa.put("nombre",nombre);
            miMapa.put("rango",rango);
            miMapa.put("aldea",aldea);
            miMapa.put("habilidad",habilidad);
            miMapa.put("descripcion",descripcion);

            lista.add(miMapa);
        }
        Operaciones.cerrarConexion();
        return lista;
    }
}
 