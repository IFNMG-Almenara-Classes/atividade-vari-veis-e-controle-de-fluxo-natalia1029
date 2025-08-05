package questao07;
import java.util.Scanner;

public class Principal {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Escreva o primeiro lado do triangulo: ");
        int lado1 = scanner.nextInt();
        System.out.println("Escreva o segundo lado do triangulo: ");
        int lado2 = scanner.nextInt();
        System.out.println("Escreva o terceiro lado do triangulo: ");
        int lado3 = scanner.nextInt();

        if(lado1 == lado2 && lado1 == lado3){
            System.out.println("Triângulo equilátero");
        }
        else if(lado1 == lado2 || lado2 ==lado3 || lado1 == lado3){
            System.out.println("Triângulo isósceles");
        }
        else{
            System.out.println("Triângulo escaleno");
        }
        scanner.close();

    }
    
}
