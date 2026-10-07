package dia12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Hashset {
    static void main() {

        //1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
        //   repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
        //   com o repetido

        HashSet<String> nomes = new HashSet<>();

        nomes.add("Ana");
        nomes.add("Bia");
        nomes.add("Carlos");
        nomes.add("Ana");

        System.out.println(
                "Nomes: " +
                        nomes);

        System.out.println("Tamanho: "
                + nomes.size()
        );
    //2. Crie um HashSet de cores usando addAll. Depois use contains dentro
        //   de um if para avisar se a cor "verde" já está no conjunto ou não.

        HashSet<String> cores = new HashSet<>();

        cores.addAll(Arrays.asList("azul", "verde", "vermelho"));

        if (cores.contains("verde")) {
            System.out.println(
                    "A cor verde já está no conjunto."
            );
        }
        else {
            System.out.println(
                    "A cor verde não está no conjunto."
            );
        }
    //3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
        //   tirar os repetidos. Imprima os dois e compare.

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Ana");
        lista.add("Bia");
        lista.add("Carlos");
        lista.add("Ana");
        lista.add("Bia");

        HashSet<String> nomesSemRepeticao = new HashSet<>(lista);

        System.out.println(
                "ArrayList: " +
                        lista);

        System.out.println("HashSet: " +
                nomesSemRepeticao
        );

        // Crie um HashSet com três CPFs e imprima. Depois remova um deles e
        //   imprima de novo, junto com o tamanho.

        HashSet<String> cpfs = new HashSet<>();

        cpfs.add("123.134.145-67");
        cpfs.add("234.245.267-89");
        cpfs.add("345.367.389-00");

        System.out.println("CPFs: " + cpfs);

        cpfs.remove("234.245.267-89");

        System.out.println(
                "CPFs depois da remoção: " +
                        cpfs);

        System.out.println("Tamanho: " +
                cpfs.size()
        );

    //Crie um HashSet com três frutas e percorra ele com for,
        //   imprimindo uma por linha.

        HashSet<String> frutas = new HashSet<>();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Uva");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    // Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
        //   imprima o isEmpty() de novo.

        HashSet<String> conjunto = new HashSet<>();

        System.out.println(
                "Está vazio? " +
                        conjunto.isEmpty());

        conjunto.add("Java");

        System.out.println(
                "Está vazio? " +
                        conjunto.isEmpty());
    }
}
