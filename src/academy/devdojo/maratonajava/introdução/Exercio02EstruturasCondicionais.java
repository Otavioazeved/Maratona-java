package academy.devdojo.maratonajava.introdução;

public class Exercio02EstruturasCondicionais {
    public static void main(String[] args) {
        /* dados os valores de 1 a 7, imprima se é dia util ou final de semana,
         considerando 1 como domingo, utilizando switch case.
         */
        byte diasDaSemana = 1;
        switch (diasDaSemana) {
            case 1:
                System.out.println("domingo, e é final de semana");
                break;
            case 2:
                System.out.println("segunda, e é dia util");
                break;
            case 3:
                System.out.println("terça feira, e é dia util");
                break;
            case 4:
                System.out.println("quarta feira, e é dia util");
                break;
            case 5:
                System.out.println("quinta feira, e é dia util");
                break;
            case 6:
                System.out.println("sexta feira, e é dia util");
                break;
            case 7:
                System.out.println("sabado, e é final de semana");
                break;
            default:
                System.out.println("opção invalida");
        }
    }
}
