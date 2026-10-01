package dia3;

public class Exercicio3 {
    public static void main(String[] args) {

        //Crie uma variável opcao com um número de 1 a 4 e, usando switch, mostre o pedido escolhido no cardápio: 1 é Café, 2 é Cappuccino, 3 é Chocolate quente e 4 é Chá. Qualquer outro número mostra "Opção inválida".

        int opcao = 5;

        switch (opcao){
            case 1:
                System.out.println("cafe");
                break;

                case 2:
                System.out.println("cappuccino");
                break;

                case 3:
                    System.out.println("chocolate");
                    break;

                case 4:
                    System.out.println("cha");
                    break;

                case 5:
                    System.out.println("opcao invalida");
                    break;

        }
        }

    }

