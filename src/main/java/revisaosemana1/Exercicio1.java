package revisaosemana1;

import java.util.Scanner;

public class Exercicio1 {
    static void main() {

        // Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
        //Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"

        Scanner input = new Scanner(System.in);

        String lanche = "Xis-Bacon";
        String lanche2 = "Xis-Java";

        double valor_lanche = 35.00;
        double valor_lanche2 = 45.00;



        if (valor_lanche > 30)
        {
            valor_lanche = valor_lanche - 5;}
        if (valor_lanche2 > 30)
        {
            valor_lanche2 = valor_lanche2 - 5;
        }

        System.out.println("Digite o nome do lanche: ");
        String lanche1 = input.next();

        if(lanche1.equals("Xis-Bacon")){
            System.out.printf("O lanche " + lanche1 + " custa R$%.2f", valor_lanche);
        }
        else if(lanche1.equals("Xis-Java")){
            System.out.printf("O lanche "+ lanche1 + " custa R$%.2f", valor_lanche2);
        }




    }
}
