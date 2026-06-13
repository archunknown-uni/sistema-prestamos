package com.banco.prestamos;

public class Main {
    public static void main(String[] args) {
        ServicioPrestamo servicio = new ServicioPrestamo();

        double ingreso = 3000;
        double monto = 6000;
        int cuotas = 10;

        double cuotaMensual = servicio.calcularCuotaMensual(monto, cuotas);
        boolean aprobado = servicio.esAprobado(ingreso, cuotaMensual);
        String resultado = servicio.obtenerResultado(aprobado);

        System.out.println("Cuota mensual: " + cuotaMensual);
        System.out.println("30% del ingreso: " + (ingreso * 0.30));
        System.out.println("Resultado: " + resultado);
    }
}
