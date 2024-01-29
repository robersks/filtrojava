package com.local.recursosCode;

import java.util.Scanner;

public class Validador {
    public static Scanner scanner = new Scanner(System.in);

    // leer un entero
    // mensaje: cadena para imprimir en pantalla ejemplo "Seleccione una opción: "
    // y proceder a leer el numero y retornarlo
    public static int leerEntero(String mensaje){
        int x = -1;
        System.out.print(mensaje);
        try {
            x = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("ERROR: Debe ingresar un numero entero.");
        }
        
        return x;
    }

    // leer un String
    // mensaje: cadena para imprimir en pantalla ejemplo "Digitar nombre: "
    // y proceder a leer el String y retornarlo
    public static String leerString(String mensaje){
        System.err.print(mensaje);
        String cadena = scanner.nextLine();
        return cadena;
    }

}