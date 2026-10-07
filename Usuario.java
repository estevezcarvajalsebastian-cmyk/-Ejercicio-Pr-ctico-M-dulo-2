/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author Sebastian Estevez
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a un usuario de la biblioteca.
 */
public class Usuario {

    private String nombre;
    private int id;
    private List<Libro> librosPrestados;

    /**
     * Constructor de Usuario.
     */
    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void prestarLibro(Libro libro) {

        if (libro.isDisponible()) {
            libro.prestarLibro();
            librosPrestados.add(libro);

            System.out.println(
                    nombre + " ahora tiene prestado: "
                    + libro.getTitulo()
            );

        } else {
            System.out.println(
                    "No se puede prestar \"" 
                    + libro.getTitulo()
                    + "\" porque no está disponible."
            );
        }
    }

    public void devolverLibro(Libro libro) {

        if (librosPrestados.contains(libro)) {

            libro.devolverLibro();
            librosPrestados.remove(libro);

            System.out.println(
                    nombre + " devolvió: "
                    + libro.getTitulo()
            );

        } else {
            System.out.println(
                    "Este usuario no tiene ese libro prestado."
            );
        }
    }
}