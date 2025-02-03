package academy.devdojo.maratonajava.javacore.Bintroduçãométodos.Test;


import academy.devdojo.maratonajava.javacore.Bintroduçãométodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int ori1 = 456;
        int ori2 = 789;
        calculadora.alterandNumerosTest(ori1, ori2);
        System.out.println("depois do metodo");
        System.out.println(ori1);
        System.out.println(ori2);
    }

}
