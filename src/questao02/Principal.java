package questao02;
import java.util.Scanner;
import java.util.Locale;


public class Principal {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        System.out.println("Digite sua altura: ");
        float altura = scanner.nextFloat();
        System.out.println("Informe seu peso: ");
        float peso = scanner.nextFloat();

        float imc = peso/(altura * altura);

        System.out.printf("Seu IMC é %.2f\n", imc);

        if (imc < 18.5){
            System.out.println("Magreza");
        }
        else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Saudavel");
        }
        else if(imc >= 25 && imc<=29.9 ){
            System.out.println("Sobrepeso");

        }
        else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } 
        else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II");
        }
        else {
            System.out.println("Obesidade Grau III (mórbida)");
        }

        scanner.close();



    }
    
}

