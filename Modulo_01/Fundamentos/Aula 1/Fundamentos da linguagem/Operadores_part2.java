import java.util.Scanner;

public class Operadores_part2 {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        var value = 50;
        // ++ e equivalente a value += 1 ou value = value + 1
        // -- e equivalente a value -= 1 ou value = value - 1
        // System.out.println(++value);
        System.out.println(value++);
        // quando trabalha com o operador de incremeto a sua direita, usa o valor e na próxima linha atribui.
        System.out.println(value);

        /*
        System.out.println("Informe o primeiro número: ");
        var value1 = scanner.nextInt();
        System.out.printf("A raiz quadrada de %s é %s\n", value1, Math.sqrt(value1)); Math.sqrt biblioteca para descobrir raiz quadrada de um número
        System.out.printf("A potência de %s é %s\n", value1, Math.pow(value1, 3)); Math.pow para descobrir a potência
         */

        /*
        var value = 10;
        value -= 5; // dessa forma resume a variavel a seguir: value = value - 10;
        System.out.println(value);
         */


        /*
        System.out.println("Informe o primeiro número: ");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        var value2 = scanner.nextInt();

        System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2); Soma
        System.out.printf("%s - %s = %s\n", value1, value2, value1 - value2); Subtração
        System.out.printf("%s / %s = %s\n", value1, value2, value1 / value2); Divisão
        System.out.printf("%s %% %s = %s\n", value1, value2, value1 % value2); Porcentagem
        System.out.printf("%s * %s = %s\n", value1, value2, value1 * value2); Multiplicação
         */
    }

}
