package dia14;

public class Encapsulamento {
    static void main() {

        //1. (sentir o private na pele)
        //
        //   Crie a classe ContaBancaria com os atributos titular (String) e
        //   saldo (double), os DOIS private.
        //
        //   Na Main, crie uma conta e tente fazer estas duas linhas:
        //
        //   System.out.println(c.titular);
        //   c.saldo = -5000;
        //
        //   Rode e LEIA o erro.

        ContaBancaria cb = new ContaBancaria();

         //   System.out.println(cb.titular);
           // cb.saldo = -5000;



            //2. (abrir a porta de leitura)
        //
        //   Crie um getter para cada atributo.
        //
        //   Na Main, apague as duas linhas que davam erro e mostre o titular
        //   e o saldo usando os getters.
        //
        //   Saída esperada:
        //
        //   Titular: null
        //   Saldo: 0.0

            System.out.println("Titular: " + cb.getTitular());
            System.out.println("Saldo: " + cb.getSaldo());


     // Crie um setter para o titular que RECUSA valor vazio. Se vier
        //   vazio, avisa e mantém o que já estava.
        //
        //   Na Main, chame ele duas vezes: uma com "" e uma com "Ana".
        //   Mostre o titular depois de cada uma.
        //
        //   Saída esperada:
        //
        //   Titular inválido! Mantido null
        //   Titular: Ana
        //
        //   Referência:
        //
        //   public void setAtributo(String atributo) {
        //       if (atributo == null || atributo.isEmpty()) {
        //           System.out.println("Inválido! Mantido " + this.atributo);
        //           return;
        //       }
        //       this.atributo = atributo;
        //   }
        //
        //    O return sozinho sai do método na hora, sem fazer o resto.
        //
        //    Compare com a questão 1: lá, c.saldo = -5000 passava direto.
        //      Aqui o objeto conferiu antes de aceitar.

        cb.setTitular("");
        System.out.println("Titular: " + cb.getTitular());

        cb.setTitular("Ana");
        System.out.println("Titular: " + cb.getTitular());

        cb.depositar(500);
        System.out.println("Saldo: " + cb.getSaldo());

        cb.depositar(-100);
        cb.sacar(2000);
        cb.sacar(200);

        System.out.println("Saldo: " + cb.getSaldo());

        //cb.registrarLog("teste");
    }
    }





