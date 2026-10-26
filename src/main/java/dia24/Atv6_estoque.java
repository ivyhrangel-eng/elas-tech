package dia24;

import java.util.ArrayList;
import java.util.List;

interface ObservadorEstoque {
    void atualizar(int quantidade);
}

class RegistroEstoque implements ObservadorEstoque {
    @Override
    public void atualizar(int quantidade) {
        System.out.println("Nova quantidade: " + quantidade);
    }
}

class Estoque {
    private List<ObservadorEstoque> observadores = new ArrayList<>();
    private int quantidade;

    public void adicionarObservador(ObservadorEstoque o) {
        observadores.add(o);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        notificarTodos();
    }

    private void notificarTodos() {
        for (ObservadorEstoque o : observadores) {
            o.atualizar(quantidade);
        }
    }
}

public class Atv6_estoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        RegistroEstoque registro = new RegistroEstoque();

        estoque.adicionarObservador(registro);

        estoque.setQuantidade(50);
        estoque.setQuantidade(30);
    }
}