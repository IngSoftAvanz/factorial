import pytest
from typing import Any
from factorial import Factorial, FactorialImpl


class TestFactorial:

    @pytest.fixture(autouse=True)
    def setup(self):
        self.factorial: Factorial = FactorialImpl() 

    def test_factorial_de_cero(self):
        """Factorial de cero es 1."""
        n = 0

        resultado = self.factorial.fact(n)
        
        assert resultado == 1

    def test_factorial_de_uno(self):
        """Factorial de 1 es 1."""
        n = 1

        resultado = self.factorial.fact(n)
        
        assert resultado == 1

    @pytest.mark.parametrize("n, expected",
                             [(2, 2),
                              (3, 6),
                              (4, 24),
                              (5, 120),
                              (6, 720)]
    )
    def test_factorial_de_numero_positivo(self, n: int, expected: int):
        """Factorial de número positivo."""
        resultado = self.factorial.fact(n)
        
        assert resultado == expected

    def test_factorial_de_numero_grande(self):
        n = 10

        resultado = self.factorial.fact(n)

        assert resultado == 3628800

    @pytest.mark.parametrize("n", [-1, -2, -5, -21], ids=lambda x: f"Número negativo: {x}")
    def test_numero_negativo(self, n: int):
        """Lanza excepción si el número es negativo"""
        with pytest.raises(ValueError):
            self.factorial.fact(n)

    def test_numero_no_entero(self):
        """Lanza excepción si el número no es un entero"""
        with pytest.raises(TypeError):
            self.factorial.fact(2.5)

    @pytest.mark.parametrize("n", ["5", [5], (5), {5}, {'n': 5}], ids=lambda x: f"Argumento no es un número entero: {x}")
    def test_argumento_no_es_numero(self, n: Any):
        """Lanza excepción si el argumento no es un número entero"""
        with pytest.raises(TypeError):
            self.factorial.fact(n)