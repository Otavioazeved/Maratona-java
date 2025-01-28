package academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante2.name = "Tavinho";   // mesmo q iniciado por outro nome, eu posso forçar ser iniciado pelo que eu quero
        System.out.println(estudante.age);
        System.out.println(estudante.sex);
        System.out.println(estudante.name);
        System.out.println("---------");
        System.out.println(estudante2.age);
        System.out.println(estudante2.sex);
        System.out.println(estudante2.name);
    }
}

