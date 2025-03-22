package academy.devdojo.maratonajava.javacore.Bintroduçãométodos.Test;

import academy.devdojo.maratonajava.javacore.Bintroduçãométodos.dominio.Calculadora;

public class calculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarargs(numeros);
    }
}
