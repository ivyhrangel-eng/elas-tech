package dia3;

public class Idade {
    static void main(String[] args) {

        //Crie uma variável idade e mostre a categoria de uma pessoa: menos de 13 anos
        // é "Criança", de 13 a 17 é "Adolescente", de 18 a 59 é "Adulto" e 60 ou mais
        // é "Idoso".//

        int idade = 18;

         if (idade < 13){
            System.out.println("criança");
         }
         else if (idade >= 13 &&  idade < 18) {
             System.out.println("adolescente");
         }
         else if  (idade >= 18 && idade <60) {
             System.out.println("adulto");
         }
             else  {
                 System.out.println("idoso");
             }

         }

    }


