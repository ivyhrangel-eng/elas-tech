package dia21.factory;

public class Atividade6_paypaladpter implements Atividade6_pagamento {

    private Atividade6_paypalapi payPalAPI;

    public Atividade6_paypaladpter(Atividade6_paypalapi payPalAPI) {
        this.payPalAPI = payPalAPI;
    }

    @Override
    public void pagar() {
        payPalAPI.sendPayment();
    }
}
