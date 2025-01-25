package academy.devdojo.maratonajava.introdução;

public class EstruturasCondicionaisAula02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 juvenil
        // idade >= 18 && < 20 categoria juniores

        int age = 19;
        if(age < 15 ){
            System.out.println("Voce é da categoria infantil.");
        } else if (age >= 15 && age < 18) {
            System.out.println("voce é da categoria juvenil");

        } else if (age >=18 && age < 20) {
            System.out.println("voce é da categoria juniores");

        }else{
            System.out.println("voce não tem idade para categoria de base");
        }
    }
}
