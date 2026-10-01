package revisaosemana1;

import java.util.Scanner;

public class Exercicio1correto {
    static void main() {



               // Crie um programa que peça ao usuário para digitar o nome de um lanche
                // e o valor dele. Se o valor for maior que R$ 30,00,
                // aplique um desconto de R$ 5,00.
                // No final, exiba o nome e o valor com duas casas decimais.

              Scanner ex1 = new Scanner(System.in);

                String lanche;
                double valor_lanche;

                System.out.println("Digite o nome do lanche: ");
                lanche = ex1.nextLine();

                System.out.println("Digite o valor do lanche: ");
                valor_lanche = ex1.nextDouble();

                if (valor_lanche > 30) {
                    valor_lanche = valor_lanche - 5;
                }

                System.out.printf(
                        "O lanche %s custa R$ %.2f\n",
                        lanche, valor_lanche
                );
            }
        }


