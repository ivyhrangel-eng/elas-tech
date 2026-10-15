package Revisaosemana3petshop;

interface Servico {
    void executar(String nome);
}

class Banho implements Servico {
    @Override
    public void executar(String nome) {
        System.out.println("Dando banho em " + nome + "...");
    }
}

class Tosa implements Servico {
    @Override
    public void executar(String nome) {
        System.out.println("Tosando " + nome + "...");
    }
}

class Consulta implements Servico {
    @Override
    public void executar(String nome) {
        System.out.println("Levando " + nome + " para a consulta...");
    }
}