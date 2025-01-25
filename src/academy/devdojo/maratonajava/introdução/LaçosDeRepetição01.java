package academy.devdojo.maratonajava.introdução;

public class LaçosDeRepetição01 {
    public static void main(String[] args) {
        /*while, do while e o for  estruturas
        para iterar sobre alguma coisa.
         */
        int count = 0;

        while(count < 10){
            System.out.println(++count);

        }
        do {
            System.out.println("dentro do do while");
        }while(count < 10 );


        for(int i = 0; i < 10; i++){
            System.out.println("for " + i);
        }

        for(int i = 0; i < 10; i++){
            System.out.println("2x" + i + "=" + i*2);
        }

        for (int w = 1; w < 11 ; w++) {
            System.out.println("3 x "  + w + " = " + w*3);

        }
    }
}
