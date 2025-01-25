package academy.devdojo.maratonajava.introdução;

public class ExercicioBreak {
    public static void main(String[] args) {
        // dado valor de um carro descubra em quantas vezes ele pode ser parcelado
        //condição: valor da parcela maior ou igual a 1000
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("parcela " + parcela+ " R$ " + valorParcela);

            
        }

    }
}
