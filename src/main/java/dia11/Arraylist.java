package dia11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylist {
    static void main() {
        Scanner input = new Scanner(System.in);

        // EXERCÍCIO 1
        // Crie uma lista vazia de nomes.
        // Adicione três nomes e imprima a lista inteira.

        ArrayList<String> nomes1 = new ArrayList<>();

        nomes1.add("Ana");
        nomes1.add("Bia");
        nomes1.add("Carlos");

        System.out.println("Lista de nomes: " + nomes1);


        // EXERCÍCIO 2
        // Crie uma lista preenchida com quatro frutas.
        // Imprima a primeira, a última e quantas frutas tem.

        ArrayList<String> frutas = new ArrayList<>(
                Arrays.asList("Maçã", "Banana", "Uva", "Manga")
        );

        System.out.println("Primeira fruta: " + frutas.get(0));
        System.out.println("Última fruta: " + frutas.get(frutas.size() - 1));
        System.out.println("Quantidade de frutas: " + frutas.size());


        // EXERCÍCIO 3
        // Crie uma lista com quatro nomes.
        // Troque o nome da posição 2 e imprima antes e depois.

        ArrayList<String> nomes3 = new ArrayList<>(
                Arrays.asList("Ana", "Bia", "Carlos", "Daniel")
        );

        System.out.println("Antes da alteração: " + nomes3);

        nomes3.set(2, "Ivyh");

        System.out.println("Depois da alteração: " + nomes3);


        // EXERCÍCIO 4
        // Crie uma lista com quatro cidades.
        // Remova a cidade da posição 1 e imprima quantas sobraram.

        ArrayList<String> cidades = new ArrayList<>(
                Arrays.asList("Rio de Janeiro", "Fortaleza", "São Paulo", "Recife")
        );

        cidades.remove(1);

        System.out.println("Cidades restantes: " + cidades);
        System.out.println("Quantidade de cidades: " + cidades.size());


        // EXERCÍCIO 5
        // Crie uma lista com seis nomes.
        // Imprima todos usando um laço e mostrando a posição.

        ArrayList<String> nomes5 = new ArrayList<>(
                Arrays.asList("Ana", "Bia", "Carlos", "Daniel", "Eva", "Felipe")
        );

        for (int i = 0; i < nomes5.size(); i++) {
            System.out.println(i + ": " + nomes5.get(i));
        }


        // EXERCÍCIO 6
        // Crie uma lista com cinco nomes.
        // Peça um nome e informe se está na lista e em qual posição.

        ArrayList<String> nomes6 = new ArrayList<>(
                Arrays.asList("Ana", "Bia", "Carlos", "Ivyh", "Daniel")
        );

        System.out.println("Digite um nome:");
        String nomeDigitado = input.nextLine();

        if (nomes6.contains(nomeDigitado)) {
            System.out.println("O nome está na lista!");
            System.out.println("Posição: " + nomes6.indexOf(nomeDigitado));
        } else {
            System.out.println("O nome não está na lista.");
        }

        input.close();
    }
}


