package dia24;

import dia24.ObservadorVoo;
import dia24.Passageiro;
import dia24.Voo;

// Classe PainelAeroporto
class PainelAeroporto implements ObservadorVoo {
    @Override
    public void atualizar(String status) {
        System.out.println("Painel: " + status);
    }
}

// Classe principal com o mesmo nome do ficheiro
public class Atv5_Painel {
    public static void main(String[] args) {
        Voo meuVoo = new Voo();

        Passageiro passageiro = new Passageiro("Ana");
        PainelAeroporto painel = new PainelAeroporto();

        // Adicionando ambos ao voo
        meuVoo.adicionarObservador(passageiro);
        meuVoo.adicionarObservador(painel);

        // Mudando o status
        meuVoo.mudarStatus("Atrasado");
    }
}