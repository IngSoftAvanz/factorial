package isa.factorial;

public class FactorialImpl implements Factorial {

    @Override
    public long fact(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Error: n negativo. El número debe ser >= 0.");
        }

        return (n > 0) ? n * fact(n - 1) : 1;
    }
}