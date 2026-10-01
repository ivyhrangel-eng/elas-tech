package dia3;

import java.util.Scanner;

public class Exercicio4{
    public static void main(String[] args) {
        // Crie variáveis idade (17) e tem Autorizacao (true).
        // Mostre se a pessoa pode entrar
        // na festa: precisa ter 18 anos ou ter autorização.
        // Faça o mesmo para precisa ter 18 anos e ter autorização.


                boolean tem_autorizacao = true;
                int idade=17;
                int idade2=18;



                // 1. Precisa ter 18 anos OU ter autorização
                if (idade >= 18 || tem_autorizacao) {
                    System.out.println("Pode entrar na festa");
                } else {
                    System.out.println("Não pode entrar na festa");
                }

                // 2. Precisa ter 18 anos E ter autorização
                if (idade >= 18 && tem_autorizacao) {
                    System.out.println("Pode entrar na festa");
                } else {
                    System.out.println("Não pode entrar na festa");
                }
            }
        }

