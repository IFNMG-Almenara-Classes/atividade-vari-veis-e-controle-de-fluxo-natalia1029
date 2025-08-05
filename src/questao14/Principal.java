package questao14;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        double total = 0;

        do {
            System.out.println("Informe o valor da compra: ");
            double valorCompra = scanner.nextDouble();
            
            System.out.println("Selecione o tipo de cliente:\n1 - Comum\n2 - Vip\n3 - Funcionario\n0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    total = valorCompra;
                    System.out.printf("O valor a ser pago é de R$ %.2f\n", total);
                    break;

                case 2:
                    total = valorCompra - (valorCompra * 0.95); // 5% de desconto
                    System.out.printf("O valor da compra com 5%% de desconto é R$ %.2f\n", total);
                    break;

                case 3:
                    total = (valorCompra * 0.90); // 10% de desconto               System.out.printf("O valor da compra com 10%% de desconto é R$ %.2f\n", total);
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}
