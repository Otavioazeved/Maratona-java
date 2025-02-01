package academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.dominio;

public class Car {
    public String name;
    public String model;
    public int year;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
