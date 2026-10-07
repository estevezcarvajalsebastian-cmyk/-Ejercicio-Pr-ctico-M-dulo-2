/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author Sebastian Estevez
 */

/**
 * Clase principal para probar el sistema de biblioteca.
 */
public class MainBiblioteca {

    public static void main(String[] args) {

        // Crear libros
        Libro libro1 = new Libro(
                "Java desde Cero",
                "Juan Pérez",
                "978-1234567890"
        );

        Libro libro2 = new Libro(
                "Programación Orientada a Objetos",
                "Ana García",
                "978-0987654321"
        );

        // Crear usuario
        Usuario usuario1 = new Usuario(
                "Sebastian",
                1
        );

        // Consultar disponibilidad
        libro1.consultarDisponibilidad();

        // Prestar libro
        usuario1.prestarLibro(libro1);

        // Consultar nuevamente
        libro1.consultarDisponibilidad();

        // Crear préstamo
        Prestamo prestamo1 = new Prestamo(
                usuario1,
                libro1
        );

        prestamo1.mostrarPrestamo();

        // Devolver libro
        usuario1.devolverLibro(libro1);

        // Consultar disponibilidad
        libro1.consultarDisponibilidad();
    }
}