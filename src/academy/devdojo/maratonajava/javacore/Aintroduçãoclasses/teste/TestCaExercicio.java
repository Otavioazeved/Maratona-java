package academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.dominio.Car;

public class TestCaExercicio {
    public static void main(String[] args) {

            Car car1 = new Car();
            Car car2 = new Car();

            car1.name = "onix";
            car1.model = "black";
            car1.year = 2020;

            // referencia de objeto

            car1 = car2;

            System.out.println("--------");
            car2.name = "corolla";
            car2.model = "blue";
            car2.year = 2024;

            System.out.println("Name1: " + car1.name);
            System.out.println("Model1: " + car1.model);
            System.out.println("Year1: " + car1.year);

            System.out.println("---------------");


            System.out.println("Name2: " + car2.name);
            System.out.println("Model2: " + car2.model);
            System.out.println("Year2: " + car2.year);

        }
    }

