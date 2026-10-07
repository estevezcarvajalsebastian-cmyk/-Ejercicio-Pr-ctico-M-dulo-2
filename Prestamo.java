/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author Sebastian Estevez
 */

import java.time.LocalDate;

/**
 * Representa un préstamo de un libro.
 */
public class Prestamo {

    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;

    /**
     * Constructor de Prestamo.
     */
    public Prestamo(Usuario usuario, Libro libro) {
        this.fecha = LocalDate.now();
        this.usuario = usuario;
        this.libro = libro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void mostrarPrestamo() {

        System.out.println("----- PRÉSTAMO -----");
        System.out.println("Fecha: " + fecha);
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Libro: " + libro.getTitulo());
    }
}