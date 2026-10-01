package revisaosemana1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio5 {
    static void main() {

        //Crie uma classe chamada Produto com os atributos nome (String) e preco (double).
        //
        //Na classe principal, faça um laço for que repita 3 vezes.
        //
        //A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.
        //
        //Instancie um novo Produto e guarde nele os valores digitados.
        //
        //Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!". Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.

        Scanner read = new Scanner(System.in);

        class Produto{
            String nome;
            double preco;
        }

        for (int laco = 1; laco <=3; laco+=1) {
            Produto produto = new Produto();
            System.out.println("Digite o nome do produto: ");
            produto.nome = read.next();

            System.out.println("Digite o preço do produto: ");
            produto.preco = read.nextDouble();

            if(produto.preco > 100){
                System.out.println("Produto caro!");}

            else{
                System.out.println("Produto com preço acessível!");
                }

            System.out.printf("O produto " + produto.nome +
                    " custa: R$%.2f\n ", produto.preco);


        }

    }
}
