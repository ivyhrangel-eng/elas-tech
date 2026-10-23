package dia21.factory;

public class Atividade1 {//Questão 1. Explique com suas palavras qual problema o Factory resolve. O que aconteceria se os ifs que decidem qual objeto criar ficassem espalhados pelo main e por outras partes do programa, e depois surgisse um tipo novo?
//Resposta: O Factory resolve o problema de centralizar e isolar a lógica de criação de objetos, tirando essa responsabilidade de dentro do código principal (main ou regras de negócio).
//
//Se os ifs ou switches que decidem qual objeto instanciar ficassem espalhados por todo o programa, e de repente surgisse um tipo novo (ex: um Passaro), você teria que caçar e modificar todos os lugares do código onde esses ifs foram escritos.
//
//Com a Factory, o ponto de criação fica num lugar só. Se surgir um tipo novo, você altera apenas a fábrica, mantendo o resto do sistema limpo e protegido (respeitando o princípio de responsabilidade única).

}
