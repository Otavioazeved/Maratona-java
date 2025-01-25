package academy.devdojo.maratonajava.introdução;

public class ArraysMultiInicialização {
    public static void main(String[] args) {
        int[][] arraInt = new int[3][];



        arraInt[0] = new int[]{54, 56, 67, 89};
        arraInt[1] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};;
        arraInt[2] = new int[]{12, 122, 133};

        for (int[] arryBase: arraInt){
            System.out.println("\n------");
            for (int num:arryBase){
                System.out.print(num + " ");                  // tirando o ln p ele n imprimir na proxima linha
            }
        }
    }
}
