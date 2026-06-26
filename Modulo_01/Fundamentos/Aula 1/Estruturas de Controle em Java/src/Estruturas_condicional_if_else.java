import java.util.Scanner;

public class Estruturas_condicional_if_else {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        var name = scanner.next();
        System.out.println("Informe a sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        // .equalsIgnoreCase("s") essa parte da linha de código e para ignorar a palavra ou letra que está entre (), que vai retorna true, caso contrário e falso
        var isEmancipated = scanner.next().equalsIgnoreCase("s");
        var canDrive = (age >= 18 || (age >= 16 && isEmancipated));
        // Elvis operator, ele vai verificar a operação booleana, caso seja true utilizar a primeira antes dos :, caso seja false e a segunda
        // A difirença dos elvis operator para o if e que, no if você pode utilizar outros códigos para validação, já no elvis e em uma linha para atribuição

        // Elvis operator
        var message = canDrive?
                name + ", você está apto a dirigir \n" :
                name + ", você não pode drigir\n ";


        // Forma 1
        // Validação das informações informada acima, nessa condição e validado se a idade inserida e maior que 18
        /*
        if (age >= 18){
            System.out.printf("%s, você tem %s anos e está apto a dirigir\n", name, age);
        }
        // Outra keyword para validação, caso o primeiro if falhe vai cair nesse stap
        else if (age >= 16 && isEmancipated) {
            System.out.printf("%s, apesar de você ter %s anos, você é emancipado e pode dirigiris \n", name, age);
        }
        */

        // Forma 2
        /*
        if(canDrive){
            System.out.printf("%s, você está apto a dirigir\n", name, age);
        }
        // A keyword abaixo e quando não e validado no if ou else if. E a última etapa da estrutura
        else{
            System.out.println("Você não pode drigir");
        }
        */

        // Forma 3
        /*
        if (canDrive) {
            message = name + ", você está apto a dirigir \n";
        }
        // A keyword abaixo e quando não e validado no if ou else if. E a última etapa da estrutura
        else {
            message = name + "Você não pode drigir";

        }
         */
        System.out.printf(message);
        System.out.println("Fim");
    }
}