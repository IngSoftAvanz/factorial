from factorial import Factorial


class FactorialImpl(Factorial):

    def fact(self, n: int) -> int:
        return n * self.fact(n-1) if n > 0 else 1