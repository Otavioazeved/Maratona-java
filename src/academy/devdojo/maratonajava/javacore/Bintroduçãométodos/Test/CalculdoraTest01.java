package academy.devdojo.maratonajava.javacore.Bintroduçãométodos.Test;

import academy.devdojo.maratonajava.javacore.Bintroduçãométodos.dominio.Calculadora;

public class CalculdoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora =  new Calculadora();      // o nome desse processo chama-se instaciamento
        int resultadoSoma = calculadora.somaDoisNumeros(10,9);
        System.out.println( "o resultado da soma é: " + resultadoSoma);
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicandoDoisNumeros();
        calculadora.divisaoDeDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");



    }

}
