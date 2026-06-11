// Escreva um código que recebna a base e a altura de um retângulo, calcule sua área e exiba na tela
//  fórmula: área = base X altura


import java.util.Scanner;

public class Exercicio_3 {

    public static void main (String[] args){

        var scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base do triangulo para calcular a área: ");
        var base = scanner.nextInt();
        System.out.println("Agora digite o valor da altura: ");
        var altura = scanner.nextInt();
        var resultado = base * altura;
        System.out.printf("A área encontrada foi: %s X %s = %s", base, altura, resultado);

    }

}
