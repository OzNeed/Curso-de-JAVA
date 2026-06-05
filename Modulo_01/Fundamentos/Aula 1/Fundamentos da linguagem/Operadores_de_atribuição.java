import java.util.Scanner;

public class Operadores_de_atribuição {

    /*
    = atribuição
    == comparação entre valores
    != nega igualdade
    < menor
    <= menor ou igual
    > maior
    >= maior ou igual
    || "or/ou" essa validação ele será true, se algum valor for true, só irá retorna false se os dois forem false. Segue exemplo:

    true && true = true
    false && false = false
    false && true = true
    true && fale = true

    && outra validação e retorna dois true em uma operação, caso o primeiro seja um true ele vai validar o segundo para ver se e true também
    Caso o primeiro seja false, já irá retorna com o valor em false. Segue exemplo:

    true && true = true
    false && false = false
    false && true = false
    true && fale = false
     */

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        System.out.println("Você e emancipado ?");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || (isEmancipated && age >= 16);
        // Se colocar as operações entre () ele vai resolver o que tem dentro primeiro e após irá rsolver o restante fora
        // Inserindo o && em alguma operação de variavel ele só vai retorna o valor true no programa se achar dois true na validação
        // || as duas pipes serve para que na operação apenas uma seja true o programa continue
        System.out.printf("Você pode dirigir ? (%s) ", canDrive);
    }

    /*
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        // var canDrive = age > 17; Para validar se o valor inserido e maior do que o comparado.
        // var canDrive = age >= 18; Valida se o número e maior ou igual ao descrito após >=.
        // var canNotDrive = age < 18;
        // var canNotDrive = age <= 17;
        // Se colocar o "!" antes da variavel de verificação em booleano ele vai inverte o valor como se fosse colocado em frente do nome da variavel

        System.out.printf("Você pode dirigir ? (%s) ", !canNotDrive);

    }
    */

    /*

    public static void main(String[] args){

        var scanner = new Scanner(System.in);

        System.out.println("Quanto é 2 + 2 ?");
        var result = scanner.nextInt();
        *var isRight = result == 4; Deste jeito e para validar se e igual ao valor digitado
        var isWrong = result != 4; Deste jeito e para validar se os valores são diferentes
        System.out.printf("O resultado é 4, você acertou ? (%s) \n", !isWrong); Quando coloca o "!" antes de uma variavel booleno ele vai inverte o valor.

    }
    */
}
