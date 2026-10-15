package dia14;

public class ContaBancaria {

        private String titular;
        private double saldo;

        public String getTitular() {
            return titular;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setTitular(String titular) {
            if (titular == null || titular.isEmpty()) {
                System.out.println("o titular é invalido");
                return;
            }
                this.titular = titular;

        }
        public void depositar(double valor){
            if (valor <= 0) {
                System.out.println("o valor é inválido");
                return;
            }
            saldo = saldo + valor;
            registrarLog("deposito de: " + valor);
        }

            private void registrarLog(String acao){
            System.out.println("[LOG]: " + titular + ": " + acao);
            }

            private boolean temSaldo(double valor) {

                return (saldo >= valor);
                }
            public void sacar(double valor){
            if(valor <= 0){
                System.out.println("Valor inválido");
                return;
            }
                if (!temSaldo(valor)) {
                    System.out.println("Saldo insuficiente");
                    return;
                }

                saldo= saldo - valor;
                registrarLog("saque de: " + valor);
        }

}


