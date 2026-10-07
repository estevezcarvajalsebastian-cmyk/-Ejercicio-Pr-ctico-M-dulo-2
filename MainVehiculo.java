/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

/**
 * Clase principal para probar el sistema de vehículos.
 */
public class MainVehiculo {

    public static void main(String[] args) {

        // Usando los diferentes constructores
        Vehiculo vehiculo1 = new Vehiculo();

        Vehiculo vehiculo2 = new Vehiculo(
                "A123456"
        );

        Vehiculo vehiculo3 = new Vehiculo(
                "B654321",
                "Toyota",
                "Corolla"
        );

        System.out.println("===== VEHÍCULOS =====");

        System.out.println(
                "Vehículo 1: "
                + vehiculo1.getPlaca()
        );

        System.out.println(
                "Vehículo 2: "
                + vehiculo2.getPlaca()
        );

        System.out.println(
                "Vehículo 3: "
                + vehiculo3.getMarca()
                + " "
                + vehiculo3.getModelo()
        );

        // Sobrecarga de calcularMantenimiento()

        double costo1 =
                vehiculo3.calcularMantenimiento(5000);

        double costo2 =
                vehiculo3.calcularMantenimiento(
                        5000,
                        "completo"
                );

        System.out.println(
                "Mantenimiento básico: $" + costo1
        );

        System.out.println(
                "Mantenimiento completo: $" + costo2
        );
    }
}