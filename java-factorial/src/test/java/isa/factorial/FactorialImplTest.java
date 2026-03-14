package isa.factorial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FactorialImplTest {

    private Factorial factorial;

    @BeforeEach
    void setup() {
        factorial = new FactorialImpl();
    }

    @Test
    @DisplayName("Factorial de cero es 1")
    void testFactorialDeCero() {
        int n = 0;

        long resultado = factorial.fact(n);

        assertEquals(1, resultado);
    }

    @Test
    @DisplayName("Factorial de 1 es 1")
    void testFactorialDeUno() {
        int n = 1;

        long resultado = factorial.fact(n);

        assertEquals(1, resultado);
    }

    @ParameterizedTest(name = "{0}! debe ser {1}")
    @CsvSource({
            "2,2",
            "3,6",
            "4,24",
            "5,120",
            "6,720"
    })
    @DisplayName("Factorial de número positivo")
    void testFactorialDeNumeroPositivo(int n, long expected) {
        long resultado = factorial.fact(n);

        assertEquals(expected, resultado);
    }

    @Test
    @DisplayName("Factorial de número grande (10!)")
    void testFactorialDeNumeroGrande() {
        int n = 10;

        long resultado = factorial.fact(n);

        assertEquals(3628800, resultado);
    }

    @ParameterizedTest(name = "Número negativo: {0}")
    @ValueSource(ints = {-1, -2, -5, -21})
    @DisplayName("Lanza excepción si el número es negativo")
    void testNumeroNegativo(int n) {
        assertThrows(IllegalArgumentException.class, () -> factorial.fact(n));
    }
}