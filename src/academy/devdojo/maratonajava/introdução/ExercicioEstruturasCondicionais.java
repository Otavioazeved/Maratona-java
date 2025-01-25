package academy.devdojo.maratonajava.introdução;

public class ExercicioEstruturasCondicionais {
    public static void main(String[] args) {
      double sal = 120000;
        double result01 = sal * 0.097;
        double result02 = sal * 0.3735 ;
        double result03 = sal * 0.4950;
      if(sal <= 34712){
          System.out.println("voce pagará de imposto: " + result01);

      } else if (sal > 34713 && sal <= 68507) {
          System.out.println("voce pagará de imposto: " + result02);

      }else{
          System.out.println("voce pagará de imposto: " + result03);
          
      }

    }
}
