
package com.escuela.sistemagestionestudiantes;

// Esta clase representa a un estudiante en linea.
// Hereda los atributos y metodos de la clase Estudiante.
public class EstudianteEnLinea extends Estudiante {

    // Atributo exclusivo del estudiante en linea.
    private String plataforma;

    // Constructor de la clase EstudianteEnLinea.
    public EstudianteEnLinea(String nombre, String matricula,
            int edad, double calificacion, String plataforma) {

        // Llamamos al constructor de la clase padre.
        super(nombre, matricula, edad, calificacion);

        this.plataforma = plataforma;
    }

    // Sobrescribimos el metodo para mostrar los datos.
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Plataforma: " + plataforma);
    }

    // Metodo exclusivo para mostrar la plataforma.
    public void mostrarPlataforma() {
        System.out.println("El estudiante utiliza: " + plataforma);
    }
}
