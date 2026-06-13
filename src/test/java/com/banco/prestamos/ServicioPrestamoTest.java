package com.banco.prestamos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicioPrestamoTest {

    private ServicioPrestamo servicio;

    @BeforeEach
    void setUp() {
        servicio = new ServicioPrestamo();
    }

    @Test
    void testCalcularCuotaMensual() {
        // 6000 / 10 = 600
        double cuota = servicio.calcularCuotaMensual(6000, 10);
        assertEquals(600.0, cuota, 0.001);
    }

    @Test
    void testAprobarPrestamoValido() {
        // cuota 600 <= 30% de 3000 (900) → aprobado
        boolean aprobado = servicio.esAprobado(3000, 600);
        assertTrue(aprobado);
    }

    @Test
    void testRechazarPrestamoSuperaElTreintaPorciento() {
        // cuota 1000 > 30% de 3000 (900) → rechazado
        boolean aprobado = servicio.esAprobado(3000, 1000);
        assertFalse(aprobado);
    }

    @Test
    void testObtenerMensajeAprobado() {
        String resultado = servicio.obtenerResultado(true);
        assertEquals("Préstamo aprobado", resultado);
    }

    @Test
    void testObtenerMensajeRechazado() {
        String resultado = servicio.obtenerResultado(false);
        assertEquals("Préstamo rechazado", resultado);
    }
}
