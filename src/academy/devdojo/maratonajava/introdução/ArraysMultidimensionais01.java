package academy.devdojo.maratonajava.introdução;

public class ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 - Meses
        // 31,28,31,30
        int [][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 33;


        dias[1][0] = 1;
        dias[1][1] = 2;
        dias[1][2] = 1;


        dias[2][0] = 3;
        dias[2][1] = 8;
        dias[2][2] = 1;


        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);


            }

        }
        System.out.println("--------------------");
        for (int []arrBase:dias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }




    }
}
