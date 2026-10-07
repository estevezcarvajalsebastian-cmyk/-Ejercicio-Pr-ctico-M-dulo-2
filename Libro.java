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
 * Representa un libro dentro de la biblioteca.
 */
public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    /**
     * Constructor de Libro.
     */
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestarLibro() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
        } else {
            System.out.println("El libro \"" + titulo + "\" no está disponible.");
        }
    }

    public void devolverLibro() {
        disponible = true;
        System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
    }

    public void consultarDisponibilidad() {
        if (disponible) {
            System.out.println("El libro \"" + titulo + "\" está disponible.");
        } else {
            System.out.println("El libro \"" + titulo + "\" no está disponible.");
        }
    }
}