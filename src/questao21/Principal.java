package questao21;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("\nInforme o seu tempo de serviço trabalhado(anos): ");
        int tempoTrabalho = scanner.nextInt();

        if(idade >= 65 || tempoTrabalho >=30){
            System.out.println("Pode se aposentar");

        }
        else if(idade >= 60 && tempoTrabalho >=25){
            System.out.println("Pode se aposentar");
        }
        else{
            System.out.println("Não pode se aposentar");
        }
        scanner.close();
    }
}
