package dia21.factory;

public class Atividade7e8 {//Questão 7. Explique com suas palavras qual problema o Facade resolve. Se quiser, use o exemplo do síndico do condomínio ou crie outro.
    //Resposta:O  Facade resolve o problema da complexidade excessiva. Pense em quando você vai ligar a televisão, o home theater e o videogame: em vez de você ter que configurar cada aparelho manualmente um por um, você aperta um único botão "Jogar Videogame" num controle universal.
    //A Facade funciona como esse botão único ou como um "síndico": ela esconde todo o sistema complexo de várias classes conversando entre si e oferece uma interface simples e direta para o usuário interagir com apenas um comando.

    //Questão 8. Marque V (verdadeiro) ou F (falso):
    //( F ) A fachada precisa implementar uma interface. (Não é obrigatório, a fachada pode ser apenas uma classe comum com métodos simplificadores).
    //
    //( V ) A fachada guarda as classes envolvidas no processo em atributos. (Sim, ela precisa conhecê-las para poder coordená-las).
    //
    //( F ) Depois que a fachada existe, é proibido usar as outras classes diretamente. (Não é proibido; as classes continuam independentes e podem ser usadas sozinhas se necessário).
}
