package dia20;

public class Main {
    public static void main(String[] args) {
        // Criamos o primeiro brinquedo e damos um nome a ele
        Brinquedos brinquedoEscolhido = new Brinquedos();
        brinquedoEscolhido.nome = "Carrinho";

        // Criamos a instância que vai chamar o método
        Brinquedos gerenciador = new Brinquedos();

        // Chamamos o método passando o brinquedo
        gerenciador.verBrinquedo(brinquedoEscolhido);
    }

}