package oops;

public class Inheritance {
    String name;
    int age;

    Inheritance(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static class Single extends Inheritance {
        String address;

        Single(String name, int age, String address) {

            super(name, age);
            this.address = address;
        }
    }
}
