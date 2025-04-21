package oops;

public class Polymorphism {

    void makeSound() {
        System.out.println("Crying");
    }

    static class Dog extends Polymorphism {
        @Override
        void makeSound() {
            System.out.println("Wooh wooh..");
        }
    }

    static class Cat extends Polymorphism {
        @Override
        void makeSound() {
            System.out.println("Myau Myaau...");
        }
    }
}
