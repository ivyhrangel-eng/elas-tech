package dia08;

import java.util.Locale;
import java.util.Scanner;

public class Atividade1 {
    static void main() {
        //1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).
        //
        //2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.
        //
        //3 — Peça o nome da pessoa e mostre a primeira letra dele.
        //
        //4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.
        //
        //Digite uma frase: Estou aprendendo Java
        //Digite uma palavra: Java
        //A palavra aparece na frase? true
        //
        //5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
        Scanner input = new Scanner(System.in);

        String nome = "Teomara da Silva";
        String nome1= "teomara da Silva";
        String frase = "Estou aprendendo Java";
        String palavra = "Java";

        System.out.println(nome.length());

        //nome.toUpperCase(); para pedir nome em maiusculo

            System.out.println(nome.toUpperCase());

            //nome.toLowerCase(); para pedir nome em minusculo

            System.out.println(nome.toLowerCase());

            //para mostrar a letra: nome.charAt(0);

           System.out.println(nome.charAt(0));

           //para verificar se dentro da frase contem uma palavra
           System.out.println(frase.contains(palavra));

           //para verificar se a palvra contem dentro da frase.
           System.out.println("A palavra Java aparece na frase? "+ frase.contains(palavra));

           //para ignorar e verificar se o nome e igual independente da formatação
           System.out.println( nome.equalsIgnoreCase(nome1));

    }
}
