package dia21.factory;

public class Main_atv3 {
    public static void main(String[] args) {
        // Instancia a fábrica diretamente pelo nome dela
        Atividade3_animalfactory fabrica = new Atividade3_animalfactory();

        // Usa a fábrica para criar os animais usando a interface
        Atividade3_animal meuCachorro = fabrica.getAnimal("cachorro");
        Atividade3_animal meuGato = fabrica.getAnimal("gato");

        meuCachorro.emitirSom();
        meuGato.emitirSom();
    }
}