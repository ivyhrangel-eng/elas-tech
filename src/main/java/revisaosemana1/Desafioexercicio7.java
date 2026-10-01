package revisaosemana1;

import java.util.Scanner;

public class Desafioexercicio7 {
    static void main() {

        //Você vai construir um programa que cadastra alunas, calcula a média delas e diz se foram aprovadas. O programa fica rodando até a pessoa escolher sair.
        //
        //Este desafio tem regras de construção obrigatórias. Não é só fazer funcionar, é fazer funcionando do jeito pedido. Sigam as instruções solicitadas, pois o objetivo é praticar as estruturas que vimos essa semana.
        //
        //O que o programa faz
        //Pergunta se a pessoa quer iniciar: 1 para continuar, 2 para sair
        //Se escolher 1:
        //pede a primeira nota
        //pede a segunda nota
        //calcula a média
        //pede o nome da aluna
        //decide se ela foi aprovada (média 6 ou mais)
        //mostra uma frase com o nome, as duas notas, a média e se foi aprovada
        //volta pro menu
        //Se escolher 2: mostra uma mensagem de despedida e encerra
        //Se digitar qualquer outra coisa: avisa que a opção é inválida e volta pro menu
        //
        //
        //Regras obrigatórias:
        //1. Crie uma classe Aluna com cinco atributos: nome, nota, nota2, media e passou (passou sendo boolean).
        //
        //2. Toda informação fica nos atributos do objeto. Nada de criar variáveis soltas tipo double nota1 = sc.nextDouble(). O valor lido vai direto pro atributo: aluna.nota = sc.nextDouble().
        //
        //3. Use while para manter o programa rodando até a pessoa escolher sair.
        //
        //4. Use switch para tratar as opções do menu. Todos os casos precisam de break, e precisa ter um default.
        //
        //5. Instancie a Aluna dentro do loop, no momento do cadastro. Cada volta cria uma aluna nova. (Ainda não estudamos como guardar vários valores, por enquanto, cada aluna é mostrada na tela e descartada na próxima iteração do loop.)
        //
        //6. Calcule a média dentro do programa. Nada de pedir a média pronta pra pessoa.
        //
        //7. Use if / else para definir se a aluna passou. A média mínima para aprovação é 6. Se a média for 6 ou mais, passou recebe true; se for menor, recebe false. O programa decide sozinho — não pergunte isso para a pessoa.
        //
        //8. Use printf para mostrar o resultado: %s para o nome (String), %.1f para as notas e a média, e %b para o passou (boolean).
        //
        //Exemplo de execução:
        //Deseja iniciar? Pressione 1 continuar, 2 para sair
        //1
        //Nota 1:
        //8.0
        //Nota 2:
        //7.0
        //Nome da Aluna:
        //Maria Silva
        //O nome da aluna é Maria Silva, sua primeira nota foi 8.0, sua segunda nota foi 7.0,
        //e sua média final foi 7.5. Aluna aprovada: true
        //Deseja iniciar? Pressione 1 continuar, 2 para sair
        //5
        //Opção inválida.
        //Deseja iniciar? Pressione 1 continuar, 2 para sair
        //2
        //Encerrando o sistema. Até logo!
        //
        //Bônus:
        //Se terminar e quiser ir além
        //Faça o programa mostrar "Aprovada" ou "Reprovada" em vez de true / false,
        //Adicione uma opção no menu que mostra quantas alunas já foram cadastradas até agora
        //Não deixe cadastrar nota menor que 0 ou maior que 10
        //
        //⚠️ Dica: Você vai precisar de um scanner.nextLine() sozinho. Lembram do bug do scanner.nextLine?  Ler número e depois texto tem uma armadilha: sobra um Enter no caminho e o programa pula a pergunta do nome. É ai que entra o sc.nextLine() sozinho pra limpar antes de ler o nome. Descubra onde ele vai.

            class Aluna{
                String nome;
                double nota;
                double nota2;
                double media;
                boolean passou;
            }
            Scanner input = new Scanner(System.in);
            String resultado;


            int opcao = 0;
            int contador = 0;
            while (opcao != 2) {
                System.out.println("Deseja iniciar? " + "Pressione 1 para continuar, 2 para sair, 3 para ver total de alunas");
                opcao = input.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Iniciando cadastro");
                        Aluna aluna = new Aluna();

                        System.out.println("Nota 1:");
                        aluna.nota = input.nextDouble();

                        while (aluna.nota < 0 || aluna.nota > 10) {
                            System.out.println("Nota inválida. Digite novamente:" );
                            aluna.nota = input.nextDouble();
                        }

                        System.out.println("Nota 2:");
                        aluna.nota2 = input.nextDouble();
                        while (aluna.nota2 < 0 || aluna.nota2 > 10) {
                            System.out.println("Nota invalida. Digite novamente:" );    aluna.nota2 = input.nextDouble();
                        }

                        aluna.media = (aluna.nota + aluna.nota2) /2;
                        System.out.println("Sua média é: " + aluna.media);
                        input.nextLine();

                        System.out.println("Nome da aluna:");
                        aluna.nome = input.nextLine();

                        if (aluna.media >=6){
                            aluna.passou = true;
                            resultado = "Aprovada";
                        }

                        else{
                            aluna.passou = false;
                            resultado = "Reprovada";
                            }

                        System.out.printf(
                                "O nome da aluna é: %s\n" +
                                        "sua primeira nota foi: %.1f\n" +
                                        "e sua segunda nota foi: %.1f\n" +
                                        "e sua média final é: %.1f\n" +
                                        "aluna aprovada: %b\n" +
                                        "Resultado: %s\n",

                                aluna.nome, aluna.nota, aluna.nota2, aluna.media, aluna.passou, resultado);

                                    contador = contador + 1;


                        break;

                    case 2:
                        System.out.println("Encerrando o sistema, até logo!");
                        break;


                    case 3:
                        System.out.println("O numero de alunas cadastradas é: " + contador);
                        break;

                        default:
                        System.out.println("Opção inválida");
                        break;
                }
            }


    }
}
