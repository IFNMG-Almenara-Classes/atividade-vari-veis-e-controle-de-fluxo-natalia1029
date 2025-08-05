package questao13;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do{
            System.out.println("\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Sair");
            System.out.println("Escolha uma das opções: ");
            opcao = scanner.nextInt();

            if(opcao >=1 && opcao <5){
                System.out.println("Insira o 1º numero: ");
                int numero1 = scanner.nextInt();

                System.out.println("Insira o 2º numero: ");
                int numero2 = scanner.nextInt();

                     switch (opcao) {
                        case 1:

                            int soma = numero1 + numero2;

                            System.out.printf("A soma dos numeros é: %d\n",soma);

                        break;

                        case 2:
                        int subtracao = numero1 - numero2;

                            System.out.printf("A subtracao dos numeros é: %d\n",subtracao);
                        break;
                        case 3:
                        int multiplicacao = numero1 * numero2;

                            System.out.printf("A multiplicacao dos numeros é: %d\n",multiplicacao);
                        break;
                        case 4:
                        int divisao = numero1 / numero2;

                            System.out.printf("A divisao dos numeros é: %d\n",divisao);
                        break;
                        case 5:
                        break;




                     }
            }
        }while(opcao !=0);
        scanner.close();

}
}