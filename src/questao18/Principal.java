package questao18;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dois números
        System.out.print("Digite o primeiro número inteiro positivo: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro positivo: ");
        int num2 = scanner.nextInt();

        // Garantir que num1 seja o menor
        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        int contadorPrimos = 0;

        System.out.println("\nNúmeros primos entre " + inicio + " e " + fim + ":");

        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
                contadorPrimos++;
            }
        }

        System.out.println("\n\nQuantidade de números primos encontrados: " + contadorPrimos);

        scanner.close();
    }

    // Método auxiliar para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}


