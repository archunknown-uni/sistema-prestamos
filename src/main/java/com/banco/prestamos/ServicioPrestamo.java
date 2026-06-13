package com.banco.prestamos;

public class ServicioPrestamo {

    public double calcularCuotaMensual(double monto, int cuotas) {
        return monto / cuotas;
    }

    public boolean esAprobado(double ingresoMensual, double cuotaMensual) {
        return cuotaMensual <= ingresoMensual * 0.30;
    }

    public String obtenerResultado(boolean aprobado) {
        if (aprobado) {
            return "Préstamo aprobado";
        } else {
            return "Préstamo rechazado";
        }
    }
}
