import java.util.Scanner;

public class Padrões_01 {

    private final static String WELCOME_MESSAGEM = "Olá, informe o seu nome";

    public static void main(String[] args){
        var scaneer = new Scanner(System.in);
        // com o var ele entende que está declarando a variavel e na frente tipando a várivel

        // Scanner scaneer = new Scanner(System.in);
        // scaneer = new Scanner(System.in) após "=" e a inicializaçao do scanner para não ter problemas na hora de utilizar o código

        System.out.println(WELCOME_MESSAGEM);
        var name = scaneer.next();
        System.out.println("Informe sua idade");
        var age = scaneer.nextInt();
        System.out.println("Olá " + name + " sua idade é " + age);
        System.out.printf("Olá %s sua idade é %s \n", name, age);
    }
}
