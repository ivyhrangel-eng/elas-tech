package dia21.BancodeDados;

public class Oracle implements BancoDeDados {

    public String chamarBanco() {
        return "O banco conectado é Oracle";
    }

    public int getNumero() {
        return 1;
    }
}
