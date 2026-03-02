package View;

import java.util.Scanner;
import Controller.Fibonacci;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int posicao;

        // Validação (1 até 20)
        do {
            System.out.print("Digite a posição da série de Fibonacci (1 a 20): ");
            posicao = sc.nextInt();

            if (posicao < 1 || posicao > 20) {
                System.out.println("Valor inválido!");
            }

        } while (posicao < 1 || posicao > 20);

        Fibonacci controller = new Fibonacci();

        int resultado = controller.fibonacci(posicao);

        System.out.println("O valor na posição " + posicao + " é: " + resultado);

        sc.close();
    }
}