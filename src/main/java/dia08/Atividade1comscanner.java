package dia08;

import java.util.Locale;
import java.util.Scanner;

public class Atividade1comscanner {
    static void main() {
            Scanner input = new Scanner(System.in);

            String nome;
            String frase;
            String palavra = "chicote";
            String nome1 = "jozelia";

            System.out.println("Digite um nomezinho: ");

            nome= input.nextLine();
            System.out.printf("O nome %s contem " + nome.length() + " números\n ", nome);

            System.out.printf(nome.toUpperCase() + "  " + nome. toLowerCase() + "\n");


            System.out.printf("%c\n", nome.charAt(0));


            System.out.println("Digite uma frase");
            frase = input.nextLine();
            palavra = input.nextLine();
            System.out.printf( "A palavra aparece na frase? %b\n" , frase.contains(palavra=palavra));
            

            System.out.println("Digite um nome");
            System.out.printf("%b\n",nome.equalsIgnoreCase(nome));

    }
}
