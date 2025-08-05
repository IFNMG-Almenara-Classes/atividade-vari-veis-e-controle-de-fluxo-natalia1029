package questao12;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros;
        int pares = 0;
        int quantNumeros = 0;
        double soma =0;
        
        do{
    
            System.out.println("Informe o valor(O para sair): ");
            numeros = scanner.nextInt();
             if (numeros !=0) {
                        soma+=numeros;
                        quantNumeros++;
                        
                    
            
                    if(numeros %2 ==0){
                    pares++;
                    }
                }
            

        }while(numeros !=0);


       
        System.out.printf("O usuario digitou 0. Encerrando\n");

        if(quantNumeros >0){
            double media = (double) soma / quantNumeros;
            System.out.printf("Quantidade de numeros pares: %d\n",pares);
            System.out.printf("Media: %.2f",media);
        }

   
        scanner.close();
        
        
    }
        
}
