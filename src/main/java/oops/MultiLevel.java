package oops;

public class MultiLevel extends Inheritance.Single {
    String lastName;

    MultiLevel(String name, int age, String address, String lastName) {
        super(name, age, address);
        this.lastName = lastName;
    }

    public static class NewClass extends MultiLevel {
        int id;

        NewClass(String name, int age, String address, String lastName, int id) {
            super(name, age, address, lastName);
            this.id = id;

        }
    }
}
