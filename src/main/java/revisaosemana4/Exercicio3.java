package revisaosemana4;

public class Exercicio3 { // Questão 3: Getters e Setters
    // Se preferires manter a classe interna ou principal aqui:
}

class produto {
    private int quantidade;
    private double preco;
    private String nome;

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            System.out.println("O valor não pode ser negativo");
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("O valor deve ser maior que zero");
        } else {
            this.preco = preco;
        }
    }
}