package academy.devdojo.maratonajava.javacore.Bintroduçãométodos.dominio;

public class Calculadora {
    public static int somaDoisNumeros(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 8);
    }

    public void multiplicandoDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public void divisaoDeDoisNumeros() {
        System.out.println(10 / 5);
    }

    // parametros
    public void multiplicaDoisNumeros(int num1, int num2, int num3) {
        System.out.println(num1 * num2 / num3);

    }

    // return
    public double divideDoisNumeros(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros2(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
           return 0;
        } else {
            return num1 / num2;
        }

    }
    public void alteraDoisNumeros (int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("dentro do altera dois numeros: ");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);

    }
}



