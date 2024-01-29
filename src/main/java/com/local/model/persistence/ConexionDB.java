package com.local.model.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.DatabaseMetaData;


public class ConexionDB {
    // PARAMETROS DE CONEXION
    private static String url = ""; 
    private static String user = ""; 
    private static String password = ""; 
    public static Connection connection = null; // crear conexion compartida por todos los metodos de esta clase

    public static Connection mySQLConnection (){
        url = "jdbc:mysql://localhost:3306/naruto_rober_barreto"; // url base de datos
        user = "admin"; // usuario de la base de datos
        password = "123"; // contraseña de la base de datos

        return getConnection(url, user, password); // invocar metodo de conexion a la base de datos
    }

    public static Connection getConnection (String url, String user, String password){
        
        // INTENTAR CONECTAR A LA BASE DE DATOS
        try {
            connection = DriverManager.getConnection(url, user, password); // conectar a la base de datos

            // imprimir mensaje de coneccion con mysql (No me interesa por el momento)
            // DESCOMENTAR :  import java.sql.DatabaseMetaData; ---- Para usar
            /*
            if (connection != null) {
                DatabaseMetaData metaData = connection.getMetaData(); // 
                System.out.println("MENSAJE: Base de datos conectada");
                System.out.println(metaData.getDriverName()); // IMPRIMIR MENSAJE DE LA LINEA METADATA
            }
            */
        } catch (SQLException e) {
            System.out.println("ERROR: No fue posible conectar a la base de datos");
            System.out.println(e.getMessage());
        }
        return connection;
    }
}