package academy.devdojo.maratonajava.introdução;

import javax.swing.*;

public class Aula03ArraysForEach {
    public static void main(String[] args) {
        int[] number = {144, 157, 155};
        // Essa é uma nova forma de iniciar um array.
        for(int i = 0; i < number.length; i++) {
            //System.out.println(number[0]);
        }
        //ForEach
        for (int num:number){
            System.out.println(num);
            // dessa forma não tem como acessar o indice;
        }

    }
}




