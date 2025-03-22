package academy.devdojo.maratonajava.javacore.Bintroduçãométodos.Test;

import academy.devdojo.maratonajava.javacore.Bintroduçãométodos.dominio.Funcionario;

public class funcionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Otavio";
        funcionario.idade = 23;
        funcionario.salarios = new double[]{1200, 987.32, 2000};
        funcionario.imprime();
        funcionario.imprimeMediaSalarial();


    }
}
