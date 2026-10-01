package revisaosemana1;

import com.sun.source.tree.DoWhileLoopTree;

import java.util.Scanner;

public class Exercicio3 {
    static void main() {
        // Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
        //1 - Ver camisas
        //2 - Ver calças
        //3 - Sair
        //Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida, avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.

        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("1- ver camisas");
            System.out.println("2- ver calças");
            System.out.println("3- sair");
            System.out.print(" Digite uma opção: ");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu ver camisas");
                    break;

                case 2:
                    System.out.println("Você escolheu ver calças");
                    break;

                case 3:
                    System.out.println("sessão encerrada");
                    break;

                default:
                   System.out.println ("opção inválida");
            }
        }while (opcao !=3);





    }
}
