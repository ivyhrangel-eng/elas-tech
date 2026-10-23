package dia17;

public class Singleton {
    private static Singleton instance;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    //Crie um atributo private static do tipo da própria classe. É onde o objeto único fica guardado. Começa como null.
        //Deixe o construtor private. Assim ninguém consegue usar new fora da classe.
        //Crie um método public static de acesso, geralmente chamado getInstancia().
        //Dentro dele, crie o objeto só se ainda não existir (if (instancia == null)).
        //Retorne sempre o mesmo objeto.
        //Acesse sempre pelo nome da classe: Classe.getInstancia(), nunca com new.
    }


