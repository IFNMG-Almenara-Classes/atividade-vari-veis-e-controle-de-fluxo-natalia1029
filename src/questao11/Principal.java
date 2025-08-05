package questao11;
import java.util.Scanner;

public class Principal {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo: ");
        int numero = scanner.nextInt();

        for(int i=0;i<=numero;i+=2){
            System.out.println(i);
            
        }
        scanner.close();
        
    }
    }
       
    

