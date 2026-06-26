import java.util.Scanner;

public class Estrutura_condiciuonal_switch_case {

    public static void main(String[] args){

        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 a 7: ");

        var option = scanner.nextInt();
        // Forma 4
        // var message = switch (option){
        switch (option){
            // Forma 4 utilizando yield e string.fomart
            /*
            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sábado";
                // yield retorna um valor dentro de uma expressão, no caso irá retorna "Domingo" ou "Sábado", conforme validação acima
                // Já o String.fomart e uma placeholders que funciona parecido ao printf.
                yield String.format("Hoje é %s, fim de semana", day);
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Oprção inválida";

            System.out.printf(message);
            */
            //Forma 3
            /*
            // Dessa forma agrupa duas cases, para retorna apenas um valor.
                case 1, 7 -> System.out.println("Fim de semana");
                case 2 -> System.out.println("Segunda");
                case 3 -> System.out.println("Terça");
                case 4 -> System.out.println("Quarta");
                case 5 -> System.out.println("Quinta");
                case 6 -> System.out.println("Sexta");
                default -> System.out.println("Oprção inválida");
             */
            // Inserir o break em cada case, para que não imprima todos os valores das outras case.
            // Forma 2
            // Dessa forma agrupa duas cases, para retorna apenas um valor.
            /*
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            */
                // Forma 1
            /*
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
             */
        };


    }

}
