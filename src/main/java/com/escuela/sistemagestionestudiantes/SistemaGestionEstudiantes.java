
package com.escuela.sistemagestionestudiantes;

// Clase principal donde inicia el programa.
public class SistemaGestionEstudiantes {

    public static void main(String[] args) {

        // Creamos un estudiante presencial.
        EstudiantePresencial estudiante1 = new EstudiantePresencial(
                "Carlos", "P001", 20, 90.0, "Salon 204");

        // Creamos un estudiante en linea.
        EstudianteEnLinea estudiante2 = new EstudianteEnLinea(
                "Ana", "L001", 19, 95.0, "Google Classroom");

        // Mostramos los datos del estudiante presencial.
        System.out.println("=== ESTUDIANTE PRESENCIAL ===");
        estudiante1.mostrarDatos();
        estudiante1.verificarAprobacion();
        estudiante1.mostrarSalon();

        // Mostramos los datos del estudiante en linea.
        System.out.println("\n=== ESTUDIANTE EN LINEA ===");
        estudiante2.mostrarDatos();
        estudiante2.verificarAprobacion();
        estudiante2.mostrarPlataforma();

    }
}
