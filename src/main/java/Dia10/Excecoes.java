package Dia10;

import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {
    static void main() {
        Scanner input = new Scanner(System.in);

        //Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo. Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero

        int numero;
        int numero2;
        System.out.println(
                "Digite o primeiro numero: ");

        numero = input.nextInt();

        System.out.println(
                "Digite o segundo numero: ");

        numero2 = input.nextInt();

        try {
        System.out.println(numero / numero2);


        }

        catch (ArithmeticException e) {
            System.out.println(
                    "Não é possivel dividir por zero, tente com outro número ");
        }

    // Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição. Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.

        double[] notas = {8.0, 6.0, 3.0, 7.0, 9.0};
        int posicao;

        System.out.println(
                "Digite a posição da nota: "
        );

        posicao = input.nextInt();

        try {
            System.out.println(notas[posicao]);

        }
        catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println(
                    "Posição inválida. O array só vai de 0 a 4."
            );
        }

        //Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número, trate a InputMismatchException e mostre uma mensagem pedindo um número

            int idade;
        System.out.println(
                    "Digite a idade: "
        );

        try {
            idade = input.nextInt();

       }
        catch (InputMismatchException ime) {
            System.out.println(
                    "A idade precisa ser digitada em números"

            );
                input.nextLine();
        }


        // Crie uma variável String nome = null; e tente imprimir nome.length(). Trate a NullPointerException e mostre "O nome não foi preenchido."

        String nome = null;
        try {
            System.out.println(nome.length());
        }
        catch (NullPointerException npe){
            System.out.println(
                    "o nome não pode ser preenchido"
            );
        }

        //Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número. Trate a ArithmeticException para o caso de ela digitar 0.

        int numero3;
        System.out.println(
                "Digite o numero"
        );
        numero3 = input.nextInt();
        try {
            System.out.println(
                    100 % numero3
            );
        }
        catch (ArithmeticException ae) {
            System.out.println(
                    "O numero nao pode ser 0"
            );
        }

    //Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe." Depois do try/catch, imprima "O programa continua funcionando."

        String[] nomes = { "Flora", "Rosa", "Ivyh"};

            try { System.out.println(
                    nomes[5]);
            }
            catch (ArrayIndexOutOfBoundsException aiobe){
                System.out.println(
                        "Essa posição não existe");

            }
            finally {
                System.out.println(
                        "O programa continua funcionando"
                );
            }

    }
}
