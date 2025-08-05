package questao17;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número natural (maior ou igual a 1): ");
        int numero = scanner.nextInt();

        // Verificação básica
        if (numero < 1) {
            System.out.println("Número inválido! Digite um valor maior ou igual a 1.");
        } else {
            long fatorial = 1;

            for (int i = numero; i >= 1; i--) {
                fatorial *= i;
            }

            System.out.printf("O fatorial de %d é: %d\n", numero, fatorial);
        }

        scanner.close();
    }
}
