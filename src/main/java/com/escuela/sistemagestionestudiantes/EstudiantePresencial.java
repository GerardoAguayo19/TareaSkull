
package com.escuela.sistemagestionestudiantes;

// Esta clase representa a un estudiante presencial.
// Hereda los atributos y metodos de la clase Estudiante.
public class EstudiantePresencial extends Estudiante {

    // Atributo exclusivo del estudiante presencial.
    private String salon;

    // Constructor de la clase EstudiantePresencial.
    public EstudiantePresencial(String nombre, String matricula,
            int edad, double calificacion, String salon) {

        // Llamamos al constructor de la clase padre.
        super(nombre, matricula, edad, calificacion);

        this.salon = salon;
    }

    // Sobrescribimos el metodo para mostrar los datos.
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Salon: " + salon);
    }

    // Metodo exclusivo para mostrar el salon.
    public void mostrarSalon() {
        System.out.println("El estudiante asiste al salon: " + salon);
    }
}
