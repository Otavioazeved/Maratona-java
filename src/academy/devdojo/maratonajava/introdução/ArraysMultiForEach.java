package academy.devdojo.maratonajava.introdução;

public class ArraysMultiForEach {
    public static void main(String[] args) {
        int [][]days = new int [3][3];

        days[0][0] = 31;
        days[0][1] = 3;
        days[0][2] = 1;

        days[1][0] = 21;
        days[1][1] = 41;
        days[1][2] = 21;


        days[2][0] = 10;
        days[2][1] = 11;
        days[2][2] = 23;


        for (int [] arrBas: days){
            for (int num: arrBas){
                System.out.println(num);
            }

        }



    }
}
