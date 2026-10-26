package dia24;

import java.util.ArrayList;
import java.util.List;

interface ObservadorVoo {
    void atualizar(String status);
}

class Passageiro implements ObservadorVoo {
    private String nome;

    public Passageiro(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String status) {
        System.out.println("Passageiro " + nome + " avisado: " + status);
    }
}

class Voo {
    private List<ObservadorVoo> observadores = new ArrayList<>();
    private String status;

    public void adicionarObservador(ObservadorVoo o) {
        observadores.add(o);
    }

    public void mudarStatus(String novoStatus) {
        this.status = novoStatus;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (ObservadorVoo o : observadores) {
            o.atualizar(status);
        }
    }
}

public class Atv4_sistema_de_voo {
    public static void main(String[] args) {
        Voo meuVoo = new Voo();
        Passageiro p1 = new Passageiro("Carlos");

        meuVoo.adicionarObservador(p1);
        meuVoo.mudarStatus("Embarque iniciado");
    }
}