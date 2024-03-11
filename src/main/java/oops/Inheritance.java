package oops;

public class Inheritance {
    String name;
    int age;

    Inheritance(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static class SubClass extends Inheritance {

        SubClass(String name, int age) {

            super(name, age);
        }
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass("Deepen", 24);
        System.out.println(obj.name +" " + obj.age);

    }
}
