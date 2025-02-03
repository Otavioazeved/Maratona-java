package academy.devdojo.maratonajava.javacore.Bintroduçãométodos.Test;

import academy.devdojo.maratonajava.javacore.Bintroduçãométodos.dominio.Calculadora;

public class testTemperatura {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int whether = 40;
        calculadora.temperatura(whether);
        System.out.println("temperatura original: " + whether);

    }
}
