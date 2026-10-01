package revisaosemana1;

public class Exercicio2 {
    static void main() {
        //Faça um programa que use um laço for para contar de 1 até 15. Dentro do for, coloque um if para verificar se o número atual é par ou ímpar (dica: use o operador de resto da divisão % 2 == 0).
        //Imprima na tela o número e a palavra correspondente.
                //Exemplo de saída:
        //"1 é Ímpar"
        //"2 é Par"

    for (int laco = 1; laco <= 15; laco+=1) {

        if (laco % 2 == 0) {
            System.out.println( laco + " é Par");
        }
        else {
            System.out.println( laco + " é Impar");
        }
    }

    }
}
