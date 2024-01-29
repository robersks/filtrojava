# Examen final java

![](/readmeRecursos/)

Proyecto en java para modernizar el sistema de gestión de misiones y datos de los ninjas de la aldea de Konoha, para mejorar la eficiencia y la cordinación entre los equipos. 

## Autor:
* Rober Fabian Barreto

## Lenguajes:
* SQL
* JAVA

## Diagrama de base de datos
![Img-diagrama-base-de-datos](/readmeRecursos/diagramaBaseDeDatos.png)

## Diagrama de clases
![Img-diagrama-de-clases](/readmeRecursos/diagramaDeClases.jpg)


## Funcionalidades:

--[Naruto - Sistema de gestión]--

1. Listar todos los ninjas con sus habilidades

        Busca todos los ninjas y muestra sus habilidades

2. Mostrar las misiones disponibles para un ninja especifico .

        Muestra las misiones disponibles para un ninja en especifico, es decir que traerá las las misiones que tiene asignadas ese ninja pero que la fecha de finalización es NULL

        Probar con: 
            ID_ninja: 11

3. Mostrar las misiones completadas para un ninja especifico.

        Muestra las misiones completadas para un ninja en especifico, es decir que traerá las las misiones que tiene asignadas ese ninja pero que la fecha de finalización es diferente de NULL

        Probar con:
            ID_ninja:  22

4. Asignar una misión a un ninja 
        
        Asigna una mision y registra la fecha de inicio actual

        probar con:
            ID_Mision: 3 
            ID_ninja: 33
        
5. Marcar una misión como completada.

        Marcar una misión como completada, es decir; si está registrada la mision actualiza la fecha de finalizaacion con la fecha actual

        Probar con:
            ID_mision 1
            ID_ninja 11 

6. Mostrar todas las misiones completadas 
        
        Archivo de texto [Unica función sin implementar ]

0. Salir