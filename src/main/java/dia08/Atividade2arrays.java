package dia08;

import java.util.Scanner;

public class Atividade2arrays {
    static void main() {
        Scanner input = new Scanner(System.in);

        String[] nomes = {"Ana", "Maria", "João", "Carlos", "Ivyh"};

        System.out.println("Primeiro: " + nomes[0]);
        System.out.println("Terceiro: " + nomes[2]);
        System.out.println("Último: " + nomes[4]);

        int[] notas = {8, 6, 10, 7, 9};

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }


        int soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }

        double media = (double) soma / notas.length;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);


        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número:");
            numeros[i] = input.nextInt();
        }

        System.out.println("Números digitados:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
