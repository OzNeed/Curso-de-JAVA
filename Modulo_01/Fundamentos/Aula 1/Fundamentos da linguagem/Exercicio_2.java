// Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
// fórmula: área = lado X lado

import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado para ser calculada a área: ");
        var area = scanner.nextInt();
        var calculo = area * area;
        System.out.printf("Segue calculo: %s * %s = %s", area, area, calculo);

    }

}
