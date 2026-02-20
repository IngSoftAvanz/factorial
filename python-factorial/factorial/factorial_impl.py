from factorial import Factorial


class FactorialImpl(Factorial):

    def fact(self, n: int) -> int:
        if not isinstance(n, int):
            raise TypeError('Error: n no es un número entero.')
        if n < 0:
            raise ValueError('Error: n negativo. El número n debe ser positivo.')
        return n * self.fact(n-1) if n > 0 else 1