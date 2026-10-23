package dia21.BancodeDados;

public class Main {
    public static void conectarBanco(BancoDeDados banco){

        System.out.println
            (banco.chamarBanco()
            );

        System.out.println
            ("Número do Banco: " + banco.getNumero()
            );
    }
public static void main(String[] args){
        BancoDeDados mysql = new MySQL();
        BancoDeDados oracle = new Oracle();

        conectarBanco(mysql);
        conectarBanco(oracle);
}
}