package academy.devdojo.maratonajava.javacore.Bintroduçãométodos.Test;

import academy.devdojo.maratonajava.javacore.Bintroduçãométodos.dominio.Calculadora;

public class calculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resusltadoDivisão = calculadora.divideDoisNumeros(0,9 );
        System.out.println("O resultado da divisão é: " + resusltadoDivisão);
        System.out.println(calculadora.divideDoisNumeros2(20, 2));
    }
}
