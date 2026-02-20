from abc import ABC


class Factorial(ABC):
    """Esta interfaz define una sola operación: el factorial de un número."""

    def fact(self, n: int) -> int:
        """
        El método factorial calcula el factorial de un número entero.
        
        Args:
            n: Número de entrada.

        Returns
            Factorial de n (n!).

        Raises:
            ValueError: Si n es negativo.
        """
        pass