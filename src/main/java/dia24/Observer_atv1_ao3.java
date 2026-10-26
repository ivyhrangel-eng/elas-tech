package dia24;

public class Observer_atv1_ao3 { //1 - Qual problema o padrão Observer resolve? Dê um exemplo do dia a dia que funcione como ele.


    //Qual problema resolve? Ele resolve a necessidade de manter múltiplos objetos (interessados) atualizados automaticamente quando o estado de outro objeto muda, sem criar uma dependência  entre eles. Sem o Observer, o objeto principal precisaria conhecer e chamar diretamente cada classe interessada, o que bagunçaria o código se quiséssemos adicionar ou remover interessados no futuro.
    //
    //Exemplo do dia a dia: A inscrição em um canal do YouTube. Quando um criador posta um vídeo novo (o Subject), todos os inscritos que ativaram o sininho (os Observers) recebem uma notificação automática no celular, sem que o criador precise ligar para cada um individualmente.



//Atividade 2 - No Observer, o que é o Subject  e o que é o Observer? Como o Subject avisa os observadores sem conhecer as classes concretas deles?

    //O que é o Subject? É o objeto "central" que está a ser observado (ex: o Voo, o Estoque, o Pedido). Ele guarda o estado e gerencia a lista de quem quer ser avisado.
    //
    //O que é o Observer? É a interface ou o elemento interessado em receber as atualizações quando o Subject muda.
    //
    //Como o Subject avisa sem conhecer as classes concretas? Ele faz isso através de Polimorfismo e Interfaces. O Subject guarda apenas uma lista genérica da interface (ex: List<ObservadorVoo>) e chama o método de atualização padrão (ex: atualizar()). Como ele só enxerga a interface, ele não faz ideia se o objeto na lista é um Passageiro, um Painel ou um Entregador — ele só sabe que todos eles possuem aquele método.

    //Atividade 3 - Se você precisar adicionar um novo interessado, por exemplo um Entregador que também precisa saber quando o pedido muda de status, o que é preciso alterar na classe Pedido? Por quê?

    //Absolutamente nada! Por que Graças ao desacoplamento do padrão Observer, a classe Pedido lida apenas com a interface genérica dos observadores. Para adicionar o Entregador, basta criar a classe dele implementando a interface de observação e registrá-lo na lista do pedido. A classe Pedido continua fechada para modificações, mas aberta para extensões (Princípio Aberto/Fechado do SOLID).
}
