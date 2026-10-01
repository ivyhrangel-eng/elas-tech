package dia01e02;

import dia5.Exercicio1;

public class dia2 {
    public static void main(String[] args) {

        // Atividade 1 //

        String nome = "Ana";
        String cidade = "Salvador";
        String produto = "Caneca";

        int idade = 28;
        int quantidade = 4;

        int inteiro = 50;
        int inteiro2 = 20;

        double preco = 12.5;

        System.out.println( "Meu nome é " + nome + "," + " moro em " + cidade
                + " e tenho " + idade + " anos. ");

        System.out.println( "Comprei " + quantidade + " unidades de " + produto + " por R$ " + preco
                + " cada. " + "Total: R$ " + (preco * quantidade) + "." );

        System.out.println( "A soma de " + inteiro + " + " + inteiro2 + " e igual a: " +  (inteiro+inteiro2) + ".");

        // Atividade 2 //

        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));

        // No primeiro código, como a expressão começa com uma String,//
        // o Java concatena os números e apresenta 22.//
        // No segundo, os parênteses fazem a soma 2 + 2 primeiro,//
        // gerando 4, que depois é concatenado ao texto.//


        //Atividade 3 //

        int valora = 10;
        int valorb = 3;
        int nota1 = 8;
        int nota2 = 6;
        int nota3 = 10;
        int a = 3;
        int b = 4;
        int c = 5;
        int segundos = 3785;


        double valora1 = 10.0;
        double valorb2 = 3.0;

        System.out.println( " soma dos inteiros "
                + (valora + valorb) + ".");
        System.out.println( " subtracao dos inteiros " + (valora - valorb) + ".");
        System.out.println( " multiplicacao dos inteiros " + (valora * valorb) + ".");
        System.out.println( " divisao dos inteiros " + (valora / valorb) + ".");
        System.out.println( " resto dos inteiros " + (valora % valorb) + ".");

        System.out.println( " soma dos decimais " +(valora1 + valorb2) + ".");
        System.out.println( " subtração dos decimais " + (valora1 - valorb2) + ".");
        System.out.println( " multiplicacao dos decimais " + (valora1 * valorb2) + ".");
        System.out.println( " divisao dos decimais " + (valora1 / valorb2) + ".");
        System.out.println(  " resto dos decimais " + (valora1 % valorb2) + ".");

        System.out.println( " soma das notas " + (nota1 + nota2 + nota3) + ".");
        System.out.println( " media das notas " + (nota1 + nota2 + nota3) / 3.00 + ".");

        System.out.println( " resultado da operacao a+b*c " + (a + b *c) + ".");
        System.out.println( " resultado da operacao (a+b)*c " + (a + b) *c + ".");

        System.out.println( " minutos " + (segundos / 60) + ".");
        System.out.println( " segundos " + (segundos % 60) + ".");

        Exercicio1 gato = new Exercicio1();
        gato.nome = "Canjica";


    }
}
