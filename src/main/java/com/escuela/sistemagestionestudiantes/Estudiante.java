package com.escuela.sistemagestionestudiantes;

// Esta clase representa a un estudiante.
public class Estudiante {

    // Atributos del estudiante.
    private String nombre;
    private String matricula;
    private int edad;
    private double calificacion;

    // Constructor: permite inicializar los datos del estudiante.
    public Estudiante(String nombre, String matricula, int edad, double calificacion) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    // Metodo para mostrar los datos del estudiante.
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Edad: " + edad);
        System.out.println("Calificacion: " + calificacion);
    }

    // Metodo para comprobar si el estudiante aprobo.
    public void verificarAprobacion() {
        if (calificacion >= 70) {
            System.out.println("Resultado: Aprobado");
        } else {
            System.out.println("Resultado: Reprobado");
        }
    }
}