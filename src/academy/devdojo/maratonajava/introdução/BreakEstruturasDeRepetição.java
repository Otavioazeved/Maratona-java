package academy.devdojo.maratonajava.introdução;

public class BreakEstruturasDeRepetição {
    public static void main(String[] args) {
        //imprimir os 25 primeiros numeros de um dado valor
        int ValorMax = 50;
        for (int i = 0; i <= ValorMax ; i++) {
            if(i > 25){
                break;

            }
            System.out.println(i);

        }
    }

}


