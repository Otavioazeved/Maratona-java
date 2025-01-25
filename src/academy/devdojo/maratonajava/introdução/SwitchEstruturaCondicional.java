package academy.devdojo.maratonajava.introdução;

public class SwitchEstruturaCondicional {
    public static void main(String[] args) {
        // valores que posso usar no switch(char, enum, byte, String, short)
        byte dia = 14;
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("opção invalida");


        }

         int sexo = 1;

        switch (sexo) {
            case 1:
                System.out.println("homem");
                break;
            case 2:
                System.out.println("mulher");
                break;
            default:
                System.out.println("opção invalidada");
        }
    }
}
