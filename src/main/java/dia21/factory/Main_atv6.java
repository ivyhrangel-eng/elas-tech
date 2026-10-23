package dia21.factory;

public class Main_atv6 {
    public static void main(String[] args) {
        // 1. Linha que tentaria usar direto (comentada porque não compila):
        // Atividade6_pagamento p = new Atividade6_paypalapi();

        // 2. Criando a variável do tipo Atividade6_pagamento usando o adapter
        Atividade6_paypalapi payPalOriginal = new Atividade6_paypalapi();
        Atividade6_pagamento pagamentoAdapter = new Atividade6_paypaladpter(payPalOriginal);

        // Chamando o método pagar através do adapter
        pagamentoAdapter.pagar();
    }
}