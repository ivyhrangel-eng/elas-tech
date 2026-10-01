package revisaosemana1;

import java.util.Scanner;

public class Exercicio6 {
    static void main() {

        //Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:
        //
        //Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).
        //
        //Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).
        //
        //Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."

        Scanner input = new Scanner(System.in);

        int nascimento;
        String nome;

        System.out.print(
                "Digite seu ano de nascimento: ");

        nascimento = input.nextInt();

        input.nextLine();

        System.out.print(
                "Digite seu nome: ");
        nome = input.nextLine();

        System.out.println("O usuário: " + nome +
                " nasceu em: " + nascimento);

    }
}
