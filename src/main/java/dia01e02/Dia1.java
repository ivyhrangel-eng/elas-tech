package dia01e02;

public class Dia1 {
    static void main(String[] args) {

        String nome = "Ivyh";
        String cidade = "Russas";
        String profissao = "Desenvolvedora";
        String cep = "62900-000";
        String telefone = "+55 88 99999-9999";

        int idade = 25;
        int anohNascimento = 2001;


        double altura = 1.65;
        double peso = 60.5;
        double temperatura = 36.5;
        double nota = 9.5; // Referente a "Nota"


        boolean ehFumante = false;
        boolean carteirahMotorista = true;


        System.out.println("Seus dados sao:");
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("altura: " + altura);
        System.out.println("CEP: " + cep);
        System.out.println("Fumante: " + ehFumante);
        System.out.println("cidade: " + cidade);
        System.out.println("Peso: " + peso);
        System.out.println("Telefone: " + telefone);
        System.out.println("CarteiraMotorista: " + carteirahMotorista);
        System.out.println("Profissao " + profissao);
        System.out.println("anoNascimento: " + anohNascimento);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("nota: " + nota);
        System.out.println("Olá: " + nome + " Sua Cidade é: " + cidade + "? " + " E seu CEP é: " + cep + "?");
    }
}