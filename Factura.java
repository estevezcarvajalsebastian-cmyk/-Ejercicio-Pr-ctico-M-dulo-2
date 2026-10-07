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
 * Representa una factura telefónica.
 */
public class Factura {

    private Cliente cliente;
    private int minutosUsados;
    private double datosUsados;

    public Factura(
            Cliente cliente,
            int minutosUsados,
            double datosUsados) {

        this.cliente = cliente;
        this.minutosUsados = minutosUsados;
        this.datosUsados = datosUsados;
    }

    public double calcularCargosExtras() {

        Plan plan = cliente.getPlan();

        double cargosExtras = 0;

        // Calcular exceso de minutos
        if (minutosUsados > plan.getMinutosIncluidos()) {

            int minutosExtra =
                    minutosUsados
                    - plan.getMinutosIncluidos();

            cargosExtras += minutosExtra * 0.10;
        }

        // Calcular exceso de datos
        if (datosUsados > plan.getDatosGB()) {

            double datosExtra =
                    datosUsados
                    - plan.getDatosGB();

            cargosExtras += datosExtra * 5.00;
        }

        return cargosExtras;
    }

    public double calcularTotal() {

        double precioBase =
                cliente.getPlan().getPrecioMensual();

        return precioBase + calcularCargosExtras();
    }

    public void generarFactura() {

        Plan plan = cliente.getPlan();

        System.out.println("===== FACTURA =====");

        System.out.println(
                "Cliente: "
                + cliente.getNombre()
        );

        System.out.println(
                "Teléfono: "
                + cliente.getNumeroTelefonico()
        );

        System.out.println(
                "Minutos incluidos: "
                + plan.getMinutosIncluidos()
        );

        System.out.println(
                "Minutos usados: "
                + minutosUsados
        );

        System.out.println(
                "Datos incluidos: "
                + plan.getDatosGB()
                + " GB"
        );

        System.out.println(
                "Datos usados: "
                + datosUsados
                + " GB"
        );

        System.out.println(
                "Precio base: $"
                + plan.getPrecioMensual()
        );

        System.out.println(
                "Cargos extras: $"
                + calcularCargosExtras()
        );

        System.out.println(
                "TOTAL: $"
                + calcularTotal()
        );
    }
}