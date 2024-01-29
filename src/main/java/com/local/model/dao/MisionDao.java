package com.local.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.local.model.persistence.ConexionDB;
import com.local.model.persistence.Operaciones;

public class MisionDao {
    
    public static List<Map<String,String>> MostrarMisionesDisponiblesNinjaEspecifico(String id_ninja) throws SQLException {

        List<Map<String,String>> lista = new ArrayList<>();
        
        Operaciones.setConnection(ConexionDB.mySQLConnection());
        String sentencia = "SELECT m.id id_mision,m.descripcion,m.rango,m.recompensa, mn.fechainicio, mn.fechafin FROM mision m INNER JOIN misionninja mn ON m.id = mn.id_mision WHERE mn.id_ninja = ? AND mn.fechafin IS NULL;";
        PreparedStatement ps = Operaciones.getConnection().prepareStatement(sentencia);
        ps.setString(1, id_ninja);
        ResultSet rs = Operaciones.consultar_BD(ps);
        while (rs.next()) {

            // capturar los valores de la consulta en cada columna
            String id_mision = rs.getString("id_mision");
            String descripcion= rs.getString("descripcion");
            String rango = rs.getString("rango");
            String recompensa= rs.getString("recompensa");
            String fechainicio = rs.getString("fechainicio");
            String fechafin= rs.getString("fechafin");
           
            HashMap<String, String> miMapa = new HashMap<>(); // crear mapa para almacenar y luego meterlo a la lista que se retornará

            miMapa.put("id_mision",id_mision);
            miMapa.put("descripcion",descripcion);
            miMapa.put("rango",rango);
            miMapa.put("recompensa",recompensa);
            miMapa.put("fechainicio",fechainicio);
            miMapa.put("fechafin",fechafin);

            lista.add(miMapa);
        }

        Operaciones.cerrarConexion();
        return lista;
    }

    public static List<Map<String,String>> MostrarMisionesCompletadasNinjaEspecifico(String id_ninja) throws SQLException {

        List<Map<String,String>> lista = new ArrayList<>();
        
        Operaciones.setConnection(ConexionDB.mySQLConnection());
        String sentencia = "SELECT m.id id_mision,m.descripcion,m.rango,m.recompensa, mn.fechainicio, mn.fechafin FROM mision m INNER JOIN misionninja mn ON m.id = mn.id_mision WHERE mn.id_ninja = ? AND mn.fechafin IS NOT NULL;";
        PreparedStatement ps = Operaciones.getConnection().prepareStatement(sentencia);
        ps.setString(1, id_ninja);
        ResultSet rs = Operaciones.consultar_BD(ps);
        while (rs.next()) {

            // capturar los valores de la consulta en cada columna
            String id_mision = rs.getString("id_mision");
            String descripcion= rs.getString("descripcion");
            String rango = rs.getString("rango");
            String recompensa= rs.getString("recompensa");
            String fechainicio = rs.getString("fechainicio");
            String fechafin= rs.getString("fechafin");
           
            HashMap<String, String> miMapa = new HashMap<>(); // crear objeto de tipo mapa y almacenarlo en la lista para retornarlo luego

            miMapa.put("id_mision",id_mision);
            miMapa.put("descripcion",descripcion);
            miMapa.put("rango",rango);
            miMapa.put("recompensa",recompensa);
            miMapa.put("fechainicio",fechainicio);
            miMapa.put("fechafin",fechafin);

            lista.add(miMapa);
        }

        Operaciones.cerrarConexion();
        return lista;
    }

    public static boolean marcarMisionComoCompletada(int id_mision, String id_ninja) throws SQLException  {
        
        Operaciones.setConnection(ConexionDB.mySQLConnection());
        String sentencia = "UPDATE misionninja SET fechafin= NOW() WHERE id_mision = ? AND id_ninja = ?";
        PreparedStatement ps = Operaciones.getConnection().prepareStatement(sentencia);

        // hacer getters para preparar la sentencia
        ps.setInt(1,id_mision);
        ps.setString(2,id_ninja);

        // commit y rollback
        if (Operaciones.setAutoCommitBD(false)) {
            if (Operaciones.insertar_actualizar_eliminar_db(ps) > 0) {
                Operaciones.commitBD();  // Confirmar los cambios realizados en la transacción
                Operaciones.cerrarConexion();
                return true;
            }else {
                Operaciones.rollbackBD();  // Deshacer la transacción en caso de error
                Operaciones.cerrarConexion();
                return false;
            }
        }else{
            Operaciones.cerrarConexion();
            return false;
        }
    }

    public static boolean asignarMision(int id_mision,String id_ninja) throws SQLException  {
        
        Operaciones.setConnection(ConexionDB.mySQLConnection());
        String sentencia = "INSERT INTO misionninja (id_ninja,id_mision) VALUES (?,?);";
        PreparedStatement ps = Operaciones.getConnection().prepareStatement(sentencia);

        // hacer getters para preparar la sentencia
        ps.setString(1,id_ninja);
        ps.setInt(2,id_mision);

        // commit y rollback
        if (Operaciones.setAutoCommitBD(false)) {
            if (Operaciones.insertar_actualizar_eliminar_db(ps) > 0) {
                Operaciones.commitBD();  // Confirmar los cambios realizados en la transacción
                Operaciones.cerrarConexion();
                return true;
            }else {
                Operaciones.rollbackBD();  // Deshacer la transacción en caso de error
                Operaciones.cerrarConexion();
                return false;
            }
        }else{
            Operaciones.cerrarConexion();
            return false;
        }
        
    }
}
