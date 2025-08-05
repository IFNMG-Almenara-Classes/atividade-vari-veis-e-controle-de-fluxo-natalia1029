package questao05;
import java.util.Scanner;

public class Principal {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de laranjas compradas: ");
        int quantLaranja = scanner.nextInt();

        if (quantLaranja < 12){
            float total = (quantLaranja * 0.5f);
            System.out.println("O valor da compra é "+total);
        }
        else {
            float total = (quantLaranja * 0.3f);
            System.out.printf("O valor da compra é %.2f",total);
        }
        scanner.close();
    }
}
