package questao16;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("\n--- Tabuada de Multiplicação ---");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, resultado);
        }

        System.out.println("\n--- Tabuada de Divisão ---");
        for (int i = 1; i <= 10; i++) {
            double resultado = (double) numero / i;
            System.out.printf("%d ÷ %d = %.2f\n", numero, i, resultado);
        }

        scanner.close();
    }
}
