package oops;

import oops.Polymorphism.Dog;
import oops.Polymorphism.Cat;

public class Main {
    public static void main(String[] args) {
        Polymorphism animal;
        animal = new Dog();
        animal.makeSound();
        animal = new Cat();
        animal.makeSound();


        MultiLevel.NewClass obj2 = new MultiLevel.NewClass("Deepen", 25, "ktm", "Chhetri", 101);
        System.out.println("ID: " + obj2.id);
        System.out.println("Name:" + obj2.name + " " + obj2.lastName);
        System.out.println("Age: " + obj2.age + " " + obj2.address);


    }
}
