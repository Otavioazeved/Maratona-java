package academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Otavio";
        estudante.age = 23;
        estudante.sex = 'M';
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);

    }
}
