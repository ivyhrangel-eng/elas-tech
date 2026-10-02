package Dia11;

public class tryecatch {
    static void main() {
      try {


          int resultado = 10 / 0;
          System.out.println(resultado);
      }
      catch(ArithmeticException ae )
      {System.out.println("nao se divide 10 por 0, use um divisor possível");}
    }
}
//try {
//    int resultado = 10 / 0;
//    System.out.println(resultado);
//
//} catch (ArithmeticException e) {
//    System.out.println("Não dá pra dividir por zero!");
//
//} finally {
//    System.out.println("Isso sempre roda.");
//}
//
//System.out.println("O programa continua.");