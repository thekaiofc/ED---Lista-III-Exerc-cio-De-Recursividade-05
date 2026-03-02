package Controller;

public class Fibonacci {

    // Construtor
    public Fibonacci() {
        super();
    }

    public int fibonacci(int n) {

        /*
         * Quando n for igual a 1 ou 2,
         * o valor da série é 1.
         */
        if (n == 1 || n == 2) {
            return 1;
        }

        /*
         * O termo n da série é igual à
         * soma do termo anterior (n-1)
         * com o termo anterior ao anterior (n-2).
         * F(n) = F(n-1) + F(n-2)
         */
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}