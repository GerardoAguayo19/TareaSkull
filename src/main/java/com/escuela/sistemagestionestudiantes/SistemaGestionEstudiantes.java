
package com.escuela.sistemagestionestudiantes;

// Clase principal donde inicia el programa.
public class SistemaGestionEstudiantes {

    public static void main(String[] args) {

        // Creamos tres objetos de tipo Estudiante.
        Estudiante estudiante1 = new Estudiante("Juan", "A001", 20, 85.5);
        Estudiante estudiante2 = new Estudiante("Maria", "A002", 19, 95.0);
        Estudiante estudiante3 = new Estudiante("Pedro", "A003", 21, 60.0);

        // Mostramos la informacion del primer estudiante.
        System.out.println("=== ESTUDIANTE 1 ===");
        estudiante1.mostrarDatos();
        estudiante1.verificarAprobacion();

        // Mostramos la informacion del segundo estudiante.
        System.out.println("\n=== ESTUDIANTE 2 ===");
        estudiante2.mostrarDatos();
        estudiante2.verificarAprobacion();

        // Mostramos la informacion del tercer estudiante.
        System.out.println("\n=== ESTUDIANTE 3 ===");
        estudiante3.mostrarDatos();
        estudiante3.verificarAprobacion();
    }
}
