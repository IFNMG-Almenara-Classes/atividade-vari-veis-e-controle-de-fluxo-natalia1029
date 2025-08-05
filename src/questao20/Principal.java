package questao20;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero: ");
        int numero = scanner.nextInt();

        if(numero %5==0 && numero %3==0){
            System.out.println("erro");
            
        }
        
        else if(numero %5==0 || numero %3==0){
            System.out.println("É divisivel por 3 ou 5");}
        
        scanner.close();
    }

    
}
