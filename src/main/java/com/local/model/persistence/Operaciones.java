package com.local.model.persistence;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Operaciones {
    
    public static Connection con; // connection
    public static Statement st = null; // Stament
    public static ResultSet rs = null; // un resultset

    // Establecer conexion con la database
    public static Connection setConnection (Connection connection){
        Operaciones.con = connection;
        return connection;
    }

    // obtener la conexion a la base de datos
    public static Connection getConnection(){
        return con;
    }

    // cerrar conexion a la base de datos
    public static void closeConnetion (Connection connection){
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE,null,e);
            }
        }
    }

    // Ejecutar una consulta a la base de datos
    public static ResultSet consultar_BD (PreparedStatement sentencia){
        try {
            rs =  sentencia.executeQuery();
        }catch (SQLException | RuntimeException sqlex) {
            System.out.println("ERROR RUTINA: " + sqlex);
            return null;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
        return rs;
    }

    // Ejecutar una operacion de inserción, actualización o borrado en la base de datos
    public static int insertar_actualizar_eliminar_db (PreparedStatement sentencia){
        int filas_afectadas;
        
        try {
            filas_afectadas =  sentencia.executeUpdate();
        }catch (SQLException | RuntimeException sqlex) {
            System.out.println("ERROR: " + sqlex);
            return 0;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return 0;
        }
        return filas_afectadas;
    }




    
    // configurar el modo de auto-commit de la base de datos
    public static boolean setAutoCommitBD(boolean parametro){
        try {
            con.setAutoCommit(parametro);
        } catch (SQLException sqlex) {
            System.out.println("Error al configurar el autocommit " + sqlex);
            return false;
        }
        return true;
    }

    // cerrar conexion a la base de datos
    public static void cerrarConexion(){
        closeConnetion(con);
    }

    // realiza un commit en la base de datos
    public static boolean commitBD(){
        try {
            con.commit();
            return true;
        } catch (SQLException sqlex) {
            System.out.println("Error al hacer commit: " + sqlex.getMessage());
            return false;
        }
    }
    
    // realiza un rollback en la base de datos
    public static boolean rollbackBD(){
        try {
            con.rollback();
            return true;
        } catch (SQLException sqlex) {
            System.out.println("Error al hacer rollback: " + sqlex.getMessage());
            return false;
        }
    }

}