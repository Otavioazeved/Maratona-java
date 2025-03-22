package academy.devdojo.maratonajava.javacore.Bintroduçãométodos.Test;

import academy.devdojo.maratonajava.javacore.Bintroduçãométodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroduçãométodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.name = "tavin";
        estudante01.age= 23;
        estudante01.sex = 'M';

        estudante02.name = "Sandra";
        estudante02.age = 33;
        estudante02.sex = 'F';

        estudante01.imprime();
        estudante02.imprime();


    }
}
