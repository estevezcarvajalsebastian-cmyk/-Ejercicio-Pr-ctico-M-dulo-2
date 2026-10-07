/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telefonia;

/**
 *
 * @author Sebastian Estevez
 */

/**
 * Clase principal para probar el sistema de telefonía.
 */
public class MainTelefonia {

    public static void main(String[] args) {

        // Crear un plan
        Plan plan1 = new Plan(
                1000,
                10,
                50.00
        );

        // Crear cliente
        Cliente cliente1 = new Cliente(
                "Sebastian",
                "809-555-1234",
                plan1
        );

        // Crear factura
        // 1200 minutos y 12 GB utilizados
        Factura factura1 = new Factura(
                cliente1,
                1200,
                12
        );

        // Generar factura
        factura1.generarFactura();
    }
}