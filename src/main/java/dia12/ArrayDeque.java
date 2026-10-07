package dia12;

import java.util.Arrays;

public class ArrayDeque {
    static void main() {

        //EXERCICIOS ARRAY DE QEUE

        // Crie uma fila e coloque três pessoas nela com add. Imprima a fila
        //   e quantas pessoas tem.

        java.util.ArrayDeque<String> fila1 = new java.util.ArrayDeque<>();

        fila1.add("Ana");
        fila1.add("Bia");
        fila1.add("Carlos");

        System.out.println(fila1);
        System.out.println(
                "Quantidade de pessoas: " + fila1.size()
        );

        java.util.ArrayDeque<String> fila2 = new java.util.ArrayDeque<>();


        //Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
        //   imprima a fila logo depois. Repare que ela não mudou.

        fila2.addAll(Arrays.asList("Ana", "Bia", "Carlos"));

        System.out.println(
                "Próximo: " + fila2.peek()
        );
        System.out.println("Fila: " + fila2);


        // Mesma fila. Agora use poll para atender o primeiro e imprima a fila
        //   depois. Compare com o exercício 2.

        java.util.ArrayDeque<String> fila3 = new java.util.ArrayDeque<>();

        fila3.addAll(Arrays.asList("Ana", "Bia", "Carlos"));

        System.out.println(
                "Atendido: " + fila3.poll()
        );
        System.out.println(
                "Fila depois do atendimento: " + fila3
        );



      //Crie uma fila com três nomes e atenda todos usando
        //   while (!fila.isEmpty()). No final, imprima "Fila vazia!".

        java.util.ArrayDeque<String> fila4 = new java.util.ArrayDeque<>();

        fila4.addAll(Arrays.asList("Ana", "Bia", "Carlos"));

        while (!fila4.isEmpty()) {
            System.out.println(
                    "Atendendo: " + fila4.poll()
            );
        }

        System.out.println
                ("Fila vazia!"
                );


        //Crie uma fila com três nomes e use contains para responder duas
        //   perguntas: se "Bia" está na fila e se "Zoe" está.

        java.util.ArrayDeque<String> fila5 = new java.util.ArrayDeque<>();

        fila5.addAll(Arrays.asList("Ana", "Bia", "Carlos"));

        System.out.println(
                "Bia está na fila? " +
                        fila5.contains("Bia")
        );
        System.out.println("Zoe está na fila? " +
                fila5.contains("Zoe")
        );



       //Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
        //   - se estiver vazia  -> "Não tem ninguém na fila."
        //   - se tiver gente    -> "Próximo: [nome]"
        //   Depois adicione uma pessoa e teste de novo.

        java.util.ArrayDeque<String> fila6 = new java.util.ArrayDeque<>();

        if (fila6.isEmpty()) {
            System.out.println(
                    "Não tem ninguém na fila."
            );
        }
        else {
            System.out.println(
                    "Próximo: " +
                            fila6.peek()
            );
        }

        fila6.add("Ana");

        if (fila6.isEmpty())
        {
            System.out.println(
                    "Não tem ninguém na fila."
            );
        }
        else {
            System.out.println(
                    "Próximo: " +
                            fila6.peek()
            );
        }
    }
}
