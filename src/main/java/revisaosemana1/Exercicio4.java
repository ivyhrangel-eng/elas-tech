package revisaosemana1;

public class Exercicio4 {
    static void main() {
        //Crie uma classe chamada Pet.
        //
        //Dê a ela três atributos: nome (String), raca (String) e peso (double).
        //
        //Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).
        //
        //Atribua valores para os atributos de cada um deles.
        //
        //Imprima os dados dos dois pets concatenando textos e variáveis.

        class Pet{
            String nome;
            String raca;
            double peso;
        }
        Pet gato = new Pet();
            gato.nome = "Canjica";
            gato.raca = "Vira-lata";
            gato.peso = 25;

        Pet cachorro = new Pet();
            cachorro.nome  = "Gaia";
            cachorro.raca = "Pitbull";
            cachorro.peso = 68;

            System.out.println(
                    "Nome: " + cachorro.nome + " Raça: " +
                            cachorro.raca + " Peso: " + cachorro.peso);

            System.out.println(
                   "Nome: " + gato.nome + " Raça: " + gato.raca +
                           " Peso: " + gato.peso);


    }
}
