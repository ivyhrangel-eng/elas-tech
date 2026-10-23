package dia21.factory;

public class Atividade3_animalfactory {
    public Atividade3_animal getAnimal(String tipo) {
        if (tipo.equalsIgnoreCase("cachorro")) {
            return new Atividade3_cachorro();
        } else if (tipo.equalsIgnoreCase("gato")) {
            return new Atividade3_gato();
        }
        return null;
    }
}
