public class Operadores_bitwise {

    public static void main(String[] args){


        var value1 = 12;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação: %s (representação em binária %s)\n", value1, binary1);
        var value2 = 2;
        // var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação: %s (representação em binária)\n", value2);
        var result = value1 >>> value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s >>> %s = %s (Representação binária %s)\n", value1, value2, result, binaryResult);

        // Operador (shift left -> <<), serve para fazer deslocamento, ele irá empurar para esquerda o bitys do primeiro número,
        // já o segundo número indica a quantidade de casas que irá deslocar, e as casas vazias se tornarão 0

        // Operador (shift right -> >>), serve para deslocar os bitys para direita e vai apagando os bitys conforme a quantidade inserida no valor 2
        // A diferença entre e left e right, e que o right identifica o número para ver se e negativo ou positivo.
        // Pois se for negtivo vai completar com número 1 a esquerda e se for positivo vai completar com número 0 a esquerda

        // Operador (unsigned right shift operator) -> >>>), ele move os bitys para a direita e as casas que ficam vazias conforme informado pelo número 2
        // irá inserir 0, diferente do shitf right que faz distinção entre positivo e negativo, esse não faz esse distinção e só inseri 0.

        /*
        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação: %s (representação em binária %s)\n", value1, binary1);
        var result = ~value1;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("~%s = %s (Representação  binária %s)\n", value1, result, binaryResult);
        // Operador de complemente -> ~, esse operador irá alterar 1 para 0 e 0 para 1
         */


        /*
        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação: %s(representação em binária %s)\n", value1, binary1);
        var value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação: %s(representação em binária %s)\n", value2, binary2);
        var result = value1 ^ value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s ^ %s = %s (Representação  binária %s)\n", value1, value2, result, binaryResult);
         */

        // System.out.println(Integer.toBinaryString(Integer.MAX_VALUE)); Serve para saber o tamanho máximo de bitys, caso o número tenha apenas duas casa
        // como 10 bitys que é o número 2, ele vai colocar 0 antes do 10 até deixar no mesmo tamanho que o limite de infomra

        // Na operação de bitwise o (or -> |) ele vai olhando cada bity da linha binária coparando, quando encontra 1 e 0 o valor vai ser 1 por ser verdadeiro
        // caso seja 0 e 0, o valor será 0 por ser todos false.

        // Operador (and -> &), ele precisa apenas um valor false para retorna false, caso tenha 1 e 0, logo o valor será 0 por ter um false na coparação

        // Operador (Shor -> ^), ele irá comparar cada bity, se os números são iguais ele retorna 0, caso seja diferente ele irá retorna 1, segue exemplo:
        // 1 e 1 = 0 iguais = 0 | 1 e 0 = 1 diferente = 1
    }

}
