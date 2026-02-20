import argparse
import sys

from factorial import FactorialImpl


def main(n: int) -> None:
    factorial = FactorialImpl()

    try:
        result = factorial.fact(n)
        print(f"{n}! = {result}")
    except ValueError as e:
        print(f"Error: {e}")
        sys.exit(1)
    except TypeError as e:
        print(f"Error: {e}")
        sys.exit(1)


if __name__ == "__main__":
    parser = argparse.ArgumentParser(
        prog="factorial",
        description="Aplicación CLI para calcular el factorial de un número entero.",
        epilog="Ejemplo: python main.py 5",
    )
    parser.add_argument("number", type=int, help="Número entero del que calcular el factorial.")
    args = parser.parse_args()

    n = args.number
    main(n)