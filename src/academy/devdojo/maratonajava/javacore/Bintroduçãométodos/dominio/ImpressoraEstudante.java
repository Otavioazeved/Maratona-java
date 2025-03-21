package academy.devdojo.maratonajava.javacore.Bintroduçãométodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){

        System.out.println("----------------");
        estudante.name = "gohan";
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);
    }
}
