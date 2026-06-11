// Escreva um cógigo que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas

import java.util.Scanner;

public class Exercicio_4 {

    public  static void main(String[] args){

        var scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        var name_1 = scanner.next();
        System.out.println("Digite a sua idade: ");
        var age_1 = scanner.nextInt();
        System.out.println("Digite o seu nome: ");
        var name_2 = scanner.next();
        System.out.println("Digite a sua idade: ");
        var age_2 = scanner.nextInt();

        var diferenca = age_1 - age_2;

        System.out.printf("A diferença entre %s e %s e de %s ano", name_1, name_2, diferenca);

    }

}
