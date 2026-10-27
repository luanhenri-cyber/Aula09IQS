package br.com.iqs.aula09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void divideNumerosPositivos() {
        assertEquals(5, calculadora.divide(10, 2));
    }

    @Test
    void divideComResultadoNegativo() {
        assertEquals(-5, calculadora.divide(10, -2));
    }

    @Test
    void divideComDivisorDiferenteDeZero() {
        assertEquals(3, calculadora.divide(7, 2));
    }

    @Test
    void divisaoPorZeroLancaArithmeticException() {
        ArithmeticException ex =
                assertThrows(ArithmeticException.class, () -> calculadora.divide(10, 0));
        assertEquals("Divisor não pode ser zero", ex.getMessage());
    }
}
