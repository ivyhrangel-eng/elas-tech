package dia21.BancodeDados;
//Crie uma interface BancoDeDados que implementa chamarBanco() e getNumero(). Depois classes chamadas Oracle e MySql e Main. MySql e Oracle devem implementar a interface. chamarBanco() deve retornar uma mensagem de acordo com o banco conectado.
//
//Exemplo:
//
//O Banco conectado é o MySql.
//
//Na sua Main crie um método conectarBanco() para receber um dos bancos e dentro dele chamar o método chamarBanco()
public interface BancoDeDados {
    String chamarBanco();
    int getNumero();
}
