package dia11;

import java.util.HashMap;

public class Hashmap {
    static void main() {

        // 1. Crie um HashMap de nomes e idades com três pessoas.
// Imprima o mapa inteiro e depois use get para mostrar a idade de uma delas.

        HashMap<String, Integer> pessoas = new HashMap<>();

        pessoas.put("Ana", 25);
        pessoas.put("Bia", 30);
        pessoas.put("Carlos", 28);

        System.out.println(
                "Pessoas: " +
                        pessoas);

        System.out.println("Idade de Bia: " +
                pessoas.get("Bia"));


// 2. Crie um HashMap de produtos e preços.
// Coloque "café" com valor 5.00, imprima, e depois faça put de "café"
// DE NOVO com valor 7.50. Imprima outra vez e veja o que aconteceu com o tamanho.

        HashMap<String, Double> produtos = new HashMap<>();

        produtos.put("café", 5.00);

        System.out.println(
                "Produtos: " +
                        produtos);

        System.out.println(
                "Tamanho: " +
                        produtos.size());

        produtos.put("café", 7.50);

        System.out.println(
                "Depois da alteração: " +
                        produtos);

        System.out.println(
                "Tamanho: " +
                        produtos.size());


// 3. Crie uma agenda (nome -> telefone) com duas pessoas.
// Use containsKey dentro de um if para mostrar o telefone de alguém
// que está na agenda e de alguém que não está.

        HashMap<String, String> agenda = new HashMap<>();

        agenda.put("Ana", "99999-1111");
        agenda.put("Bia", "99999-2222");

        if (agenda.containsKey("Ana")) {
            System.out.println(
                    "Telefone de Ana: " +
                            agenda.get("Ana"));
        }
        else {
            System.out.println(
                    "Ana não está na agenda.");
        }

        if (agenda.containsKey("Carlos")) {
            System.out.println(
                    "Telefone de Carlos: " +
                            agenda.get("Carlos"));
        }
        else {
            System.out.println(
                    "Carlos não está na agenda.");
        }


// 4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
// Use getOrDefault para mostrar a quantidade de um produto que existe
// e de um que não existe (devolvendo 0).
// Depois tente com get normal no que não existe e compare.

        HashMap<String, Integer> estoque = new HashMap<>();

        estoque.put("Arroz", 10);
        estoque.put("Feijão", 5);

        System.out.println(
                "Quantidade de Arroz: " +
                        estoque.getOrDefault("Arroz", 0)
        );

        System.out.println(
                "Quantidade de Café: " +
                        estoque.getOrDefault("Café", 0)
        );

        System.out.println(
                "Café usando get normal: " +
                        estoque.get("Café")
        );


// 5. Crie um HashMap de notas com três alunas.
// Imprima o mapa e o tamanho.
// Remova uma delas e imprima de novo.

        HashMap<String, Double> notas = new HashMap<>();

        notas.put("Ana", 8.0);
        notas.put("Bia", 7.5);
        notas.put("Carla", 9.0);

        System.out.println(
                "Notas: " + notas);

        System.out.println(
                "Tamanho: " + notas.size());

        notas.remove("Bia");

        System.out.println(
                "Notas depois da remoção: " + notas);

        System.out.println(
                "Tamanho: " + notas.size());
    }
}
