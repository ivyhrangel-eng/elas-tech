package dia21.factory;

public class Atividade4e5 {//Questão 4. Seu sistema precisa usar uma classe de pagamento de outra empresa, mas ela não implementa a sua interface. Por que não dá para simplesmente escrever implements na classe dela?

//Resposta: Não dá para escrever implements porque a classe é de outra empresa  o que significa que você não tem acesso ao código-fonte dela para alterá-lo. Além disso, os nomes dos métodos da classe dela  podem ser totalmente diferentes dos nomes exigidos pela sua interface . No lugar disso, usamos um Adapter , que atua como um intermediário entre o seu sistema e a classe externa.
//Questão 5. Em um Adapter, onde fica a tradução (por exemplo, a conversão de dólar para real)?
//Resposta : c) No método implementado da interface, dentro do adapter
}
