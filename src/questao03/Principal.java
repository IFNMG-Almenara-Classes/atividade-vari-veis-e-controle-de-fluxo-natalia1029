package questao03;
import java.util.Scanner;

public class Principal{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número:");
        int numero = scanner.nextInt();

        System.out.printf("O número %d é %s\n",numero, (numero %2==0? "par": "impar"));
    
        scanner.close();

    }
}