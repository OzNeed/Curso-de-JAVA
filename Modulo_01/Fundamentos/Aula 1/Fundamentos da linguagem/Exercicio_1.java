// Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem:
// Olá 'Fulano' você tem 'X' anos

import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        var name = scanner.next();
        System.out.println("Digite o seu ano de nascimento: ");
        var age = scanner.nextInt();

        var newAge = 2026 - age;
        System.out.printf("Olá %s você tem %s anos", name, newAge);

    }

}
