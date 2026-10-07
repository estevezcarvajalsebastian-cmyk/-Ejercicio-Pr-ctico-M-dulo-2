/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

/**
 * Representa un vehículo.
 */
public class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;

    // Constructor 1: sin parámetros
    public Vehiculo() {
        this.placa = "SIN PLACA";
        this.marca = "DESCONOCIDA";
        this.modelo = "DESCONOCIDO";
    }

    // Constructor 2: solamente placa
    public Vehiculo(String placa) {
        this.placa = placa;
        this.marca = "DESCONOCIDA";
        this.modelo = "DESCONOCIDO";
    }

    // Constructor 3: todos los datos
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Mantenimiento solamente con kilómetros
    public double calcularMantenimiento(int km) {

        return km * 0.05;
    }

    // Mantenimiento con kilómetros y tipo de servicio
    public double calcularMantenimiento(int km, String tipoServicio) {

        double costoBase = km * 0.05;

        if (tipoServicio.equalsIgnoreCase("completo")) {
            costoBase += 100;
        }

        return costoBase;
    }
}