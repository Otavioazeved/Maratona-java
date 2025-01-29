package academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "jorge";
        professor.age = 57;
        professor.sex = 'M';

        System.out.println("Nome: " + professor.name);
        System.out.println("Idade: " +professor.age + " anos");
        System.out.println("Sexo: " +professor.sex);
    }
}
