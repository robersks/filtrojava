package com.local;

import com.local.recursosCode.Validador;
import java.sql.SQLException;
import com.local.controller.*;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        // VARIABLES
        int opcion = -1; // variable de opción del menu- Seteada en -1 para evitar error de ejecución
        String stringTemp;
        int intTemp;
        do {
            mostarMenu();
            opcion = Validador.leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 0:
                    System.out.println("\nHasta pronto!\n");
                    break;
                case 1:
                    NinjaController.mostarTodosLosNinjasHabilidad();
                    break;
                case 2:
                    stringTemp = Validador.leerString("Digitar id del ninja: ");
                    MisionController.MostrarMisionesDisponiblesNinjaEspecifico(stringTemp);
                    break;
                case 3:
                    stringTemp = Validador.leerString("Digitar id del ninja: ");
                    MisionController.MostarMisionesCompletadasNinjaEspecifico(stringTemp);
                    break;
                case 4:
                    intTemp = Validador.leerEntero("Digitar id de la misión: ");
                    stringTemp = Validador.leerString("Digitar id del ninja: ");
                    MisionController.asignarMisionANinnjaEspecifico(intTemp, stringTemp);
                    break;
                case 5:
                    intTemp = Validador.leerEntero("Digitar id de la misión: ");
                    stringTemp = Validador.leerString("Digitar id del ninja: ");
                    MisionController.marcarMisionComoCompletada(intTemp, stringTemp);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("ERROR: Opción no está en el menú.");;
                    break;
            }
        } while (opcion != 0);
    }

    // menu de navegación
    public static void mostarMenu(){
        System.out.println("\n_______________________________________________________________");
        System.out.println("              --[Naruto - Sistema de gestión]--\n");
        System.out.println("1. Listar todos los ninjas con sus habilidades");
        System.out.println("2. Mostrar las misiones disponibles para un ninja especifico (Probar con 11) ");
        System.out.println("3. Mostrar las misiones completadas para un ninja especifico (Probar con 22) ");
        System.out.println("4. Asignar una misión a un ninja (probar con mision 3 , id_ninja 33 )");
        System.out.println("5. Marcar una misión como completada (Probar con mision 1, id_ninja 11 )");
        System.out.println("6. Mostrar todas las misiones completadas (Archivo de texto)");
        System.out.println("0. Salir\n");
    }    
}