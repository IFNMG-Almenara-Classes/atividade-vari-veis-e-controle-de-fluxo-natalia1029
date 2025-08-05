package questao01;
import java.util.Scanner;

public class questao01 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();
        System.out.println("Informe outro numero: ");
        int numero2 = scanner.nextInt();

        if (numero < numero2){
           System.out.println("O maior número é " +numero2);
        }
        else {
            System.out.println("O maior número é "+ numero);

        }
        scanner.close();

        }


    }
    

