package questao06;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Informe o segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("Informe o terceiro numero: ");
        int numero3 = scanner.nextInt();

        if(numero1 <numero2 && numero1 < numero3){
            System.out.printf("O numero %d é o menor",numero1);
        }
        else if (numero2 <numero1 && numero2 < numero3){
            System.out.printf("O numero %d é o menor",numero2);
        
        }
        else{
            System.out.printf("O numero %d é o menor",numero3);
        }
        scanner.close();

    }
    
}
