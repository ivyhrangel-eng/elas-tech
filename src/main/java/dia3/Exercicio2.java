package dia3;

public class Exercicio2 {
    public static void main(String[] args) {

        double saldo_da_conta = 200.00;
        double valor_de_uma_compra = 300.00;

        if (saldo_da_conta >= valor_de_uma_compra) {
            System.out.println("compra aprovada " + "saldo atual: "
                    + (saldo_da_conta - valor_de_uma_compra));
        }

           else System.out.println("compra reprovada " + "saldo atual: "
                + (valor_de_uma_compra - saldo_da_conta));

        }
    }
//else if (saldo_da_conta < valor_de_uma_compra) {
//System.out.println("compra reprovada " + "saldo atual: "
// + (valor_de_uma_compra - saldo_da_conta ));
